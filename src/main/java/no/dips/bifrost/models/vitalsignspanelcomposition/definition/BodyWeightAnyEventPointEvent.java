package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.490779800+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class BodyWeightAnyEventPointEvent implements PointEventEntity, BodyWeightAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Body weight/Any event/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double weightMagnitude;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String weightUnits;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/Simple/Weight/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour weightNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/State of dress
   * Description: Description of the state of dress of the person at the time of weighing.
   */
  @Path("/state[at0008]/items[at0009]/value|defining_code")
  private StateOfDressDefiningCode stateOfDressDefiningCode;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/state structure/State of dress/null_flavour
   */
  @Path("/state[at0008]/items[at0009]/null_flavour|defining_code")
  private NullFlavour stateOfDressNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Body weight/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setWeightMagnitude(Double weightMagnitude) {
     this.weightMagnitude = weightMagnitude;
  }

  public Double getWeightMagnitude() {
     return this.weightMagnitude ;
  }

  public void setWeightUnits(String weightUnits) {
     this.weightUnits = weightUnits;
  }

  public String getWeightUnits() {
     return this.weightUnits ;
  }

  public void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode) {
     this.weightNullFlavourDefiningCode = weightNullFlavourDefiningCode;
  }

  public NullFlavour getWeightNullFlavourDefiningCode() {
     return this.weightNullFlavourDefiningCode ;
  }

  public void setStateOfDressDefiningCode(StateOfDressDefiningCode stateOfDressDefiningCode) {
     this.stateOfDressDefiningCode = stateOfDressDefiningCode;
  }

  public StateOfDressDefiningCode getStateOfDressDefiningCode() {
     return this.stateOfDressDefiningCode ;
  }

  public void setStateOfDressNullFlavourDefiningCode(
      NullFlavour stateOfDressNullFlavourDefiningCode) {
     this.stateOfDressNullFlavourDefiningCode = stateOfDressNullFlavourDefiningCode;
  }

  public NullFlavour getStateOfDressNullFlavourDefiningCode() {
     return this.stateOfDressNullFlavourDefiningCode ;
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
