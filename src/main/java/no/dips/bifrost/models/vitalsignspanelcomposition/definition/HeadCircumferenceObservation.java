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

@Entity
@Archetype("openEHR-EHR-OBSERVATION.head_circumference.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.502781+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public class HeadCircumferenceObservation implements EntryEntity {
  /**
   * Path: Vital Signs Panel/Head circumference/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Vital Signs Panel/Head circumference/Device
   * Description: Details about the device used for the measurement.
   */
  @Path("/protocol[at0005]/items[at0006]")
  private Cluster device;

  /**
   * Path: Vital Signs Panel/Head circumference/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: For example: Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0005]/items[at0012]")
  private List<Cluster> extension;

  /**
   * Path: Vital Signs Panel/Head circumference/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Vital Signs Panel/Head circumference/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Vital Signs Panel/Head circumference/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0010]")
  @Choice
  private List<HeadCircumferenceAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
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

  public void setAnyEvent(List<HeadCircumferenceAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<HeadCircumferenceAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
