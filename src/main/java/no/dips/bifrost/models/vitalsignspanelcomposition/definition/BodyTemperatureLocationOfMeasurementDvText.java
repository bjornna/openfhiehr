package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.425779600+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("DV_TEXT")
public class BodyTemperatureLocationOfMeasurementDvText implements RMEntity, BodyTemperatureLocationOfMeasurementChoice {
  /**
   * Path: Vital Signs Panel/Body temperature/value/value
   */
  @Path("|value")
  private String locationOfMeasurementValue;

  public void setLocationOfMeasurementValue(String locationOfMeasurementValue) {
     this.locationOfMeasurementValue = locationOfMeasurementValue;
  }

  public String getLocationOfMeasurementValue() {
     return this.locationOfMeasurementValue ;
  }
}
