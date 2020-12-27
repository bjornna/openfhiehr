package no.dips.bifrost.models.vitalsignspanelcomposition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyTemperatureObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.BodyWeightObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.HeadCircumferenceObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.HeightLengthObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.PulseHeartBeatObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.PulseOximetryObservation;
import no.dips.bifrost.models.vitalsignspanelcomposition.definition.RespirationObservation;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class VitalSignsPanelCompositionContainment extends Containment {
  public SelectAqlField<VitalSignsPanelComposition> VITAL_SIGNS_PANEL_COMPOSITION = new AqlFieldImp<VitalSignsPanelComposition>(VitalSignsPanelComposition.class, "", "VitalSignsPanelComposition", VitalSignsPanelComposition.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(VitalSignsPanelComposition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VitalSignsPanelComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(VitalSignsPanelComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(VitalSignsPanelComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(VitalSignsPanelComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(VitalSignsPanelComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(VitalSignsPanelComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<RespirationObservation> RESPIRATION = new AqlFieldImp<RespirationObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.respiration.v2]", "respiration", RespirationObservation.class, this);

  public SelectAqlField<PulseHeartBeatObservation> PULSE_HEART_BEAT = new AqlFieldImp<PulseHeartBeatObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.pulse.v2]", "pulseHeartBeat", PulseHeartBeatObservation.class, this);

  public SelectAqlField<PulseOximetryObservation> PULSE_OXIMETRY = new AqlFieldImp<PulseOximetryObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]", "pulseOximetry", PulseOximetryObservation.class, this);

  public SelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new AqlFieldImp<BodyTemperatureObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public SelectAqlField<HeightLengthObservation> HEIGHT_LENGTH = new AqlFieldImp<HeightLengthObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.height.v2]", "heightLength", HeightLengthObservation.class, this);

  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT = new AqlFieldImp<BodyWeightObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.body_weight.v2]", "bodyWeight", BodyWeightObservation.class, this);

  public SelectAqlField<HeadCircumferenceObservation> HEAD_CIRCUMFERENCE = new AqlFieldImp<HeadCircumferenceObservation>(VitalSignsPanelComposition.class, "/content[openEHR-EHR-OBSERVATION.head_circumference.v1]", "headCircumference", HeadCircumferenceObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(VitalSignsPanelComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(VitalSignsPanelComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(VitalSignsPanelComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(VitalSignsPanelComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(VitalSignsPanelComposition.class, "/territory", "territory", Territory.class, this);

  private VitalSignsPanelCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static VitalSignsPanelCompositionContainment getInstance() {
    return new VitalSignsPanelCompositionContainment();
  }
}
