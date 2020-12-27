package no.dips.bifrost.models.vitalsignspanelcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2020-12-27T09:23:36.517780200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.0.0"
)
public interface HeadCircumferenceAnyEventChoice {
  String getHeadCircumferenceUnits();

  void setHeadCircumferenceUnits(String headCircumferenceUnits);

  Double getHeadCircumferenceMagnitude();

  void setHeadCircumferenceMagnitude(Double headCircumferenceMagnitude);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  ItemTree getTree();

  void setTree(ItemTree tree);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getHeadCircumferenceNullFlavourDefiningCode();

  void setHeadCircumferenceNullFlavourDefiningCode(
      NullFlavour headCircumferenceNullFlavourDefiningCode);
}
