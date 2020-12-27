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
    date = "2020-12-27T09:23:36.301781100+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class PulseHeartBeatAnyEventPointEvent implements PointEventEntity, PulseHeartBeatAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/Presence
   * Description: Presence of a pulse or heart beat.
   */
  @Path("/data[at0001]/items[at1005]/value|defining_code")
  private PresenceDefiningCode2 presenceDefiningCode;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/structure/Presence/null_flavour
   */
  @Path("/data[at0001]/items[at1005]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/Rate
   * Description: The rate of the pulse or heart beat, measured in beats per minute.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double rateMagnitude;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/Rate
   * Description: The rate of the pulse or heart beat, measured in beats per minute.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String rateUnits;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/structure/Rate/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour rateNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/Exertion
   * Description: Details about physical exertion being undertaken during the examination.
   */
  @Path("/state[at0012]/items[at1017]")
  private List<Cluster> exertion;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setPresenceDefiningCode(PresenceDefiningCode2 presenceDefiningCode) {
     this.presenceDefiningCode = presenceDefiningCode;
  }

  public PresenceDefiningCode2 getPresenceDefiningCode() {
     return this.presenceDefiningCode ;
  }

  public void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode) {
     this.presenceNullFlavourDefiningCode = presenceNullFlavourDefiningCode;
  }

  public NullFlavour getPresenceNullFlavourDefiningCode() {
     return this.presenceNullFlavourDefiningCode ;
  }

  public void setRateMagnitude(Double rateMagnitude) {
     this.rateMagnitude = rateMagnitude;
  }

  public Double getRateMagnitude() {
     return this.rateMagnitude ;
  }

  public void setRateUnits(String rateUnits) {
     this.rateUnits = rateUnits;
  }

  public String getRateUnits() {
     return this.rateUnits ;
  }

  public void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode) {
     this.rateNullFlavourDefiningCode = rateNullFlavourDefiningCode;
  }

  public NullFlavour getRateNullFlavourDefiningCode() {
     return this.rateNullFlavourDefiningCode ;
  }

  public void setExertion(List<Cluster> exertion) {
     this.exertion = exertion;
  }

  public List<Cluster> getExertion() {
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
