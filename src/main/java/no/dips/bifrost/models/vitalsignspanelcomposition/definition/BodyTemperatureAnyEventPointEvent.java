package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.441782300+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class BodyTemperatureAnyEventPointEvent implements PointEventEntity, BodyTemperatureAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Body temperature/Any event/Temperature
   * Description: The measured body temperature (as a surrogate for the core of the body).
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double temperatureMagnitude;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/Temperature
   * Description: The measured body temperature (as a surrogate for the core of the body).
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String temperatureUnits;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/Tree/Temperature/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour temperatureNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/Environmental conditions
   * Description: Details about the environmental conditions at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0056]")
  private List<Cluster> environmentalConditions;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/Exertion
   * Description: Details about the exertion of the person at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0057]")
  private Cluster exertion;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setTemperatureMagnitude(Double temperatureMagnitude) {
     this.temperatureMagnitude = temperatureMagnitude;
  }

  public Double getTemperatureMagnitude() {
     return this.temperatureMagnitude ;
  }

  public void setTemperatureUnits(String temperatureUnits) {
     this.temperatureUnits = temperatureUnits;
  }

  public String getTemperatureUnits() {
     return this.temperatureUnits ;
  }

  public void setTemperatureNullFlavourDefiningCode(
      NullFlavour temperatureNullFlavourDefiningCode) {
     this.temperatureNullFlavourDefiningCode = temperatureNullFlavourDefiningCode;
  }

  public NullFlavour getTemperatureNullFlavourDefiningCode() {
     return this.temperatureNullFlavourDefiningCode ;
  }

  public void setEnvironmentalConditions(List<Cluster> environmentalConditions) {
     this.environmentalConditions = environmentalConditions;
  }

  public List<Cluster> getEnvironmentalConditions() {
     return this.environmentalConditions ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
