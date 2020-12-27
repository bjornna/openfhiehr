package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.422779200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("DV_CODED_TEXT")
public class BodyTemperatureLocationOfMeasurementDvCodedText implements RMEntity, BodyTemperatureLocationOfMeasurementChoice {
  /**
   * Path: Vital Signs Panel/Body temperature/value/value
   */
  @Path("|defining_code")
  private LocationOfMeasurementDefiningCode locationOfMeasurementDefiningCode;

  public void setLocationOfMeasurementDefiningCode(
      LocationOfMeasurementDefiningCode locationOfMeasurementDefiningCode) {
     this.locationOfMeasurementDefiningCode = locationOfMeasurementDefiningCode;
  }

  public LocationOfMeasurementDefiningCode getLocationOfMeasurementDefiningCode() {
     return this.locationOfMeasurementDefiningCode ;
  }
}
