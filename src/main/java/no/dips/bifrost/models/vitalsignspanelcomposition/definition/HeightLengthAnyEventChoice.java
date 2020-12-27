package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.462781900+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface HeightLengthAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getHeightLengthNullFlavourDefiningCode();

  void setHeightLengthNullFlavourDefiningCode(NullFlavour heightLengthNullFlavourDefiningCode);

  Double getHeightLengthMagnitude();

  void setHeightLengthMagnitude(Double heightLengthMagnitude);

  String getHeightLengthUnits();

  void setHeightLengthUnits(String heightLengthUnits);

  PositionDefiningCode getPositionDefiningCode();

  void setPositionDefiningCode(PositionDefiningCode positionDefiningCode);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);
}
