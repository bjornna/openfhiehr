package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.493779900+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface BodyWeightAnyEventChoice {
  String getWeightUnits();

  void setWeightUnits(String weightUnits);

  Double getWeightMagnitude();

  void setWeightMagnitude(Double weightMagnitude);

  StateOfDressDefiningCode getStateOfDressDefiningCode();

  void setStateOfDressDefiningCode(StateOfDressDefiningCode stateOfDressDefiningCode);

  NullFlavour getStateOfDressNullFlavourDefiningCode();

  void setStateOfDressNullFlavourDefiningCode(NullFlavour stateOfDressNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getWeightNullFlavourDefiningCode();

  void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);
}
