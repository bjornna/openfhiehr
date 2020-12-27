package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
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
    date = "2020-12-27T09:23:36.207775500+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class RespirationAnyEventPointEvent implements PointEventEntity, RespirationAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Respiration/Any event/Presence
   * Description: Observation of spontaneous respiration.
   */
  @Path("/data[at0003]/items[at0062]/value|defining_code")
  private PresenceDefiningCode presenceDefiningCode;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/List/Presence/null_flavour
   */
  @Path("/data[at0003]/items[at0062]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double rateMagnitude;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String rateUnits;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/List/Rate/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour rateNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen being delivered to the individual at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi02 of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0022]/items[at0055]")
  private Cluster inspiredOxygen;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/Exertion
   * Description: Details about physical exertion being undertaken during the examination.
   * Comment: The individual's level of exertion during, or just prior to, the observation.
   */
  @Path("/state[at0022]/items[at0037]")
  private Cluster exertion;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Respiration/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setPresenceDefiningCode(PresenceDefiningCode presenceDefiningCode) {
     this.presenceDefiningCode = presenceDefiningCode;
  }

  public PresenceDefiningCode getPresenceDefiningCode() {
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

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
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
