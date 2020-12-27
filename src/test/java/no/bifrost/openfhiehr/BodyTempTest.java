package no.bifrost.openfhiehr;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.nedap.archie.rm.RMObject;
import com.nedap.archie.rm.generic.PartySelf;

import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.serialisation.xmlencoding.CanonicalXML;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.junit.jupiter.api.Test;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;

import no.dips.bifrost.models.vitalsignspanelcomposition.VitalSignsPanelComposition;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyTemperatureAnyEventPointEvent;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyTemperatureObservation;

public class BodyTempTest {

    @Test
    public void testGenerate() {
        BodyTemperatureObservation o = new BodyTemperatureObservation();
        BodyTemperatureAnyEventPointEvent e = new BodyTemperatureAnyEventPointEvent();
        e.setTemperatureMagnitude(38.6);
        e.setTemperatureUnits("Cel");
        o.setAnyEvent(List.of(e));
        VitalSignsPanelComposition c = new VitalSignsPanelComposition();
        c.setBodyTemperature(o);
        c.setComposer(new PartySelf());
        VersionUid versionUid = new VersionUid(UUID.randomUUID(), "bifrost", 1);
        c.setVersionUid(versionUid);
        TemplateProvider templateProvider = getTemplateProvider();
        Unflattener unflattener = new Unflattener(templateProvider);
        RMObject comp = unflattener.unflatten(c);
        toFile(comp, "body_temp");

    }

    private void toFile(RMObject comp, String filename) {
        try {
            CanonicalJson json = new CanonicalJson();
            String j = json.marshal(comp);
            FileWriter writer = new FileWriter(new File("target/" + filename + ".json"));
            writer.write(j);
            writer.flush();
            writer.close();

            CanonicalXML xml = new CanonicalXML();
            String x = xml.marshal(comp);
            FileWriter writer2 = new FileWriter(new File("target/" + filename + ".xml"));
            writer2.write(x);
            writer2.flush();
            writer2.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private TemplateProvider getTemplateProvider() {
        return new TemplateProvider() {

            @Override
            public Optional<OPERATIONALTEMPLATE> find(String templateId) {

                try {
                    org.openehr.schemas.v1.TemplateDocument t = org.openehr.schemas.v1.TemplateDocument.Factory
                            .parse(new File("opts/vital_signs_panel.opt"));
                    return Optional.of(t.getTemplate());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }

        };
    }

}
