package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.402781100+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface PulseOximetryAnyEventChoice {
  DvProportion getSpo();

  void setSpo(DvProportion spo);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getSpoNullFlavourDefiningCode();

  void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode);

  List<Cluster> getMultimediaImage();

  void setMultimediaImage(List<Cluster> multimediaImage);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);

  List<Cluster> getWaveform();

  void setWaveform(List<Cluster> waveform);
}
