package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
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
    date = "2020-12-27T09:23:36.512780900+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
@OptionFor("POINT_EVENT")
public class HeadCircumferenceAnyEventPointEvent implements PointEventEntity, HeadCircumferenceAnyEventChoice {
  /**
   * Path: Vital Signs Panel/Head circumference/Any event/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double headCircumferenceMagnitude;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event/Head circumference
   * Description: The measurement of the longest distance around the head.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String headCircumferenceUnits;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event/Tree/Head circumference/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour headCircumferenceNullFlavourDefiningCode;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0008]")
  private ItemTree tree;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Vital Signs Panel/Head circumference/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setHeadCircumferenceMagnitude(Double headCircumferenceMagnitude) {
     this.headCircumferenceMagnitude = headCircumferenceMagnitude;
  }

  public Double getHeadCircumferenceMagnitude() {
     return this.headCircumferenceMagnitude ;
  }

  public void setHeadCircumferenceUnits(String headCircumferenceUnits) {
     this.headCircumferenceUnits = headCircumferenceUnits;
  }

  public String getHeadCircumferenceUnits() {
     return this.headCircumferenceUnits ;
  }

  public void setHeadCircumferenceNullFlavourDefiningCode(
      NullFlavour headCircumferenceNullFlavourDefiningCode) {
     this.headCircumferenceNullFlavourDefiningCode = headCircumferenceNullFlavourDefiningCode;
  }

  public NullFlavour getHeadCircumferenceNullFlavourDefiningCode() {
     return this.headCircumferenceNullFlavourDefiningCode ;
  }

  public void setTree(ItemTree tree) {
     this.tree = tree;
  }

  public ItemTree getTree() {
     return this.tree ;
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
