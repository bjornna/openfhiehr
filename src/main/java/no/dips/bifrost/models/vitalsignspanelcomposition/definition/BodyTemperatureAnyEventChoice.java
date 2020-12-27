package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.444787100+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface BodyTemperatureAnyEventChoice {
  Cluster getExertion();

  void setExertion(Cluster exertion);

  String getTemperatureUnits();

  void setTemperatureUnits(String temperatureUnits);

  Double getTemperatureMagnitude();

  void setTemperatureMagnitude(Double temperatureMagnitude);

  NullFlavour getTemperatureNullFlavourDefiningCode();

  void setTemperatureNullFlavourDefiningCode(NullFlavour temperatureNullFlavourDefiningCode);

  List<Cluster> getEnvironmentalConditions();

  void setEnvironmentalConditions(List<Cluster> environmentalConditions);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);
}
