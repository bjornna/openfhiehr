package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
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
    date = "2020-12-27T09:23:36.389781800+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class PulseOximetryAnyEventPointEvent implements PointEventEntity, PulseOximetryAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/SpO₂
   * Description: The saturation of oxygen in the peripheral blood, measured via pulse oximetry.
   */
  @Path("/data[at0003]/items[at0006]/value")
  private DvProportion spo;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/Tree/SpO₂/null_flavour
   */
  @Path("/data[at0003]/items[at0006]/null_flavour|defining_code")
  private NullFlavour spoNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/Waveform
   * Description: A waveform reading associated with the oximetry measurement.
   */
  @Path("/data[at0003]/items[at0054]")
  private List<Cluster> waveform;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/Multimedia image
   * Description: Details of a series of oximetry readings, other than waveforms, expressed as a multimedia image or series of images. Waveforms should be recorded using the Waveform slot and associated cluster archetype.
   */
  @Path("/data[at0003]/items[at0060]")
  private List<Cluster> multimediaImage;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/Exertion
   * Description: Details about physical activity undertaken at the time of measurement.
   */
  @Path("/state[at0014]/items[at0034]")
  private Cluster exertion;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen available to the subject at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi0₂ of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0014]/items[at0015]")
  private Cluster inspiredOxygen;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Pulse oximetry/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setSpo(DvProportion spo) {
     this.spo = spo;
  }

  public DvProportion getSpo() {
     return this.spo ;
  }

  public void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode) {
     this.spoNullFlavourDefiningCode = spoNullFlavourDefiningCode;
  }

  public NullFlavour getSpoNullFlavourDefiningCode() {
     return this.spoNullFlavourDefiningCode ;
  }

  public void setWaveform(List<Cluster> waveform) {
     this.waveform = waveform;
  }

  public List<Cluster> getWaveform() {
     return this.waveform ;
  }

  public void setMultimediaImage(List<Cluster> multimediaImage) {
     this.multimediaImage = multimediaImage;
  }

  public List<Cluster> getMultimediaImage() {
     return this.multimediaImage ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
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
