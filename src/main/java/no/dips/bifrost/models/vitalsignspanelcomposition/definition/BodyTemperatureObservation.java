package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.body_temperature.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.412781900+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public class BodyTemperatureObservation implements EntryEntity {
  /**
   * Path: Vital Signs Panel/Body temperature/origin
   */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Vital Signs Panel/Body temperature/Protocol/Location of measurement/null_flavour
   */
  @Path("/protocol[at0020]/items[at0021]/null_flavour|defining_code")
  private NullFlavour locationOfMeasurementNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Body temperature/Structured measurement location
   * Description: Structured anatomical location of where the measurement was taken.
   */
  @Path("/protocol[at0020]/items[at0064]")
  private List<Cluster> structuredMeasurementLocation;

  /**
   * Path: Vital Signs Panel/Body temperature/Device
   * Description: Details about the device use to measure body temperature.
   */
  @Path("/protocol[at0020]/items[at0059]")
  private Cluster device;

  /**
   * Path: Vital Signs Panel/Body temperature/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: e.g. Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0020]/items[at0062]")
  private List<Cluster> extension;

  /**
   * Path: Vital Signs Panel/Body temperature/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Vital Signs Panel/Body temperature/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Vital Signs Panel/Body temperature/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Body temperature/value
   */
  @Path("/protocol[at0020]/items[at0021]/value")
  @Choice
  private BodyTemperatureLocationOfMeasurementChoice locationOfMeasurement;

  /**
   * Path: Vital Signs Panel/Body temperature/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0002]/events[at0003]")
  @Choice
  private List<BodyTemperatureAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setLocationOfMeasurementNullFlavourDefiningCode(
      NullFlavour locationOfMeasurementNullFlavourDefiningCode) {
     this.locationOfMeasurementNullFlavourDefiningCode = locationOfMeasurementNullFlavourDefiningCode;
  }

  public NullFlavour getLocationOfMeasurementNullFlavourDefiningCode() {
     return this.locationOfMeasurementNullFlavourDefiningCode ;
  }

  public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
     this.structuredMeasurementLocation = structuredMeasurementLocation;
  }

  public List<Cluster> getStructuredMeasurementLocation() {
     return this.structuredMeasurementLocation ;
  }

  public void setDevice(Cluster device) {
     this.device = device;
  }

  public Cluster getDevice() {
     return this.device ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
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

  public void setLocationOfMeasurement(
      BodyTemperatureLocationOfMeasurementChoice locationOfMeasurement) {
     this.locationOfMeasurement = locationOfMeasurement;
  }

  public BodyTemperatureLocationOfMeasurementChoice getLocationOfMeasurement() {
     return this.locationOfMeasurement ;
  }

  public void setAnyEvent(List<BodyTemperatureAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<BodyTemperatureAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
