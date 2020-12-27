package no.dips.bifrost.models.vitalsignspanelcomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyTemperatureObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyWeightObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.HeadCircumferenceObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.HeightLengthObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.PulseHeartBeatObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.PulseOximetryObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.RespirationObservation;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.encounter.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.086773200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@Template("vital_signs_panel")
public class VitalSignsPanelComposition implements CompositionEntity {
  /**
   * Path: Vital Signs Panel/context/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: Vital Signs Panel/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: Vital Signs Panel/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: Vital Signs Panel/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: Vital Signs Panel/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: Vital Signs Panel/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: Vital Signs Panel/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: Vital Signs Panel/Respiration
   * Description: The characteristics of spontaneous breathing by an individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.respiration.v2]")
  private RespirationObservation respiration;

  /**
   * Path: Vital Signs Panel/Pulse/Heart beat
   * Description: The rate and associated attributes for a pulse or heart beat.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.pulse.v2]")
  private PulseHeartBeatObservation pulseHeartBeat;

  /**
   * Path: Vital Signs Panel/Pulse oximetry
   * Description: Blood oxygen and related measurements, measured by pulse oximetry or pulse CO-oximetry.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]")
  private PulseOximetryObservation pulseOximetry;

  /**
   * Path: Vital Signs Panel/Body temperature
   * Description: A measurement of the body temperature, which is a surrogate for the core body temperature of the individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.body_temperature.v2]")
  private BodyTemperatureObservation bodyTemperature;

  /**
   * Path: Vital Signs Panel/Height/Length
   * Description: Height, or body length, is measured from crown of head to sole of foot.
   * Comment: Height is measured with the individual in a standing position and body length in a recumbent position.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.height.v2]")
  private HeightLengthObservation heightLength;

  /**
   * Path: Vital Signs Panel/Body weight
   * Description: Measurement of the body weight of an individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.body_weight.v2]")
  private BodyWeightObservation bodyWeight;

  /**
   * Path: Vital Signs Panel/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.head_circumference.v1]")
  private HeadCircumferenceObservation headCircumference;

  /**
   * Path: Vital Signs Panel/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: Vital Signs Panel/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Vital Signs Panel/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: Vital Signs Panel/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setRespiration(RespirationObservation respiration) {
     this.respiration = respiration;
  }

  public RespirationObservation getRespiration() {
     return this.respiration ;
  }

  public void setPulseHeartBeat(PulseHeartBeatObservation pulseHeartBeat) {
     this.pulseHeartBeat = pulseHeartBeat;
  }

  public PulseHeartBeatObservation getPulseHeartBeat() {
     return this.pulseHeartBeat ;
  }

  public void setPulseOximetry(PulseOximetryObservation pulseOximetry) {
     this.pulseOximetry = pulseOximetry;
  }

  public PulseOximetryObservation getPulseOximetry() {
     return this.pulseOximetry ;
  }

  public void setBodyTemperature(BodyTemperatureObservation bodyTemperature) {
     this.bodyTemperature = bodyTemperature;
  }

  public BodyTemperatureObservation getBodyTemperature() {
     return this.bodyTemperature ;
  }

  public void setHeightLength(HeightLengthObservation heightLength) {
     this.heightLength = heightLength;
  }

  public HeightLengthObservation getHeightLength() {
     return this.heightLength ;
  }

  public void setBodyWeight(BodyWeightObservation bodyWeight) {
     this.bodyWeight = bodyWeight;
  }

  public BodyWeightObservation getBodyWeight() {
     return this.bodyWeight ;
  }

  public void setHeadCircumference(HeadCircumferenceObservation headCircumference) {
     this.headCircumference = headCircumference;
  }

  public HeadCircumferenceObservation getHeadCircumference() {
     return this.headCircumference ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
