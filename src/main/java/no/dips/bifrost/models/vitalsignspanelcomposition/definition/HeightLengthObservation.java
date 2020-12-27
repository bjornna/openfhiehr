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
@Archetype("openEHR-EHR-OBSERVATION.height.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.450783500+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public class HeightLengthObservation implements EntryEntity {
  /**
   * Path: Vital Signs Panel/Height/Length/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Vital Signs Panel/Height/Length/Device
   * Description: Description of the device used to measure height or body length.
   */
  @Path("/protocol[at0007]/items[at0011]")
  private Cluster device;

  /**
   * Path: Vital Signs Panel/Height/Length/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0022]")
  private List<Cluster> extension;

  /**
   * Path: Vital Signs Panel/Height/Length/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Vital Signs Panel/Height/Length/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Vital Signs Panel/Height/Length/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Height/Length/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<HeightLengthAnyEventChoice> anyEvent;

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

  public void setAnyEvent(List<HeightLengthAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<HeightLengthAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
