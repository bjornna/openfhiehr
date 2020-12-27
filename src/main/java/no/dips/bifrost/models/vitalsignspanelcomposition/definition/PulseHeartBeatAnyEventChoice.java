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
    date = "2020-12-27T09:23:36.327784200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface PulseHeartBeatAnyEventChoice {
  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getPresenceNullFlavourDefiningCode();

  void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  PresenceDefiningCode2 getPresenceDefiningCode();

  void setPresenceDefiningCode(PresenceDefiningCode2 presenceDefiningCode);

  List<Cluster> getExertion();

  void setExertion(List<Cluster> exertion);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
