package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.218775600+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface RespirationAnyEventChoice {
  NullFlavour getPresenceNullFlavourDefiningCode();

  void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode);

  PresenceDefiningCode getPresenceDefiningCode();

  void setPresenceDefiningCode(PresenceDefiningCode presenceDefiningCode);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);
}
