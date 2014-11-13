package us.gov.dod.standard.ssrf._1_2_4.ceoi;

import java.math.BigDecimal;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * CEOI
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCEOI", propOrder = {
  "shortTitleInfo",
  "feRef",
  "bsmPlanRef",
  "quickInstruction",
  "dictionaryRef",
  "timePeriod",
  "jrflRef",
  "netRef"
})
public class CEOI extends Common<CEOI> {

  @XmlElement(name = "ShortTitleInfo", required = true)
  protected ShortTitleInfo shortTitleInfo;

  @XmlElement(name = "FERef", required = true)
  protected ElmRef feRef;

  @XmlElement(name = "BSMPlanRef")
  protected ElmRef bsmPlanRef;

  @XmlElement(name = "QuickInstruction", required = true)
  protected Memo quickInstruction;

  @XmlElement(name = "DictionaryRef")
  protected Set<ElmRef> dictionaryRef;

  @XmlElement(name = "TimePeriod", required = true)
  protected Set<TimePeriod> timePeriod;

  @XmlElement(name = "JRFLRef")
  protected ElmRef jrflRef;

  @XmlElement(name = "NetRef")
  protected Set<NetRef> netRef;

  @XmlAttribute(name = "version", required = true)
  protected BigDecimal version;

  /**
   * Get
   * <p>
   * @return a {@link ShortTitleInfo} instance
   * @since 3.1.0
   */
  public ShortTitleInfo getShortTitleInfo() {
    return shortTitleInfo;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ShortTitleInfo} instance
   * @since 3.1.0
   */
  public void setShortTitleInfo(ShortTitleInfo value) {
    this.shortTitleInfo = value;
  }

  public boolean isSetShortTitleInfo() {
    return (this.shortTitleInfo != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getFERef() {
    return feRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setFERef(ElmRef value) {
    this.feRef = value;
  }

  public boolean isSetFERef() {
    return (this.feRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getBSMPlanRef() {
    return bsmPlanRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setBSMPlanRef(ElmRef value) {
    this.bsmPlanRef = value;
  }

  public boolean isSetBSMPlanRef() {
    return (this.bsmPlanRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getQuickInstruction() {
    return quickInstruction;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setQuickInstruction(Memo value) {
    this.quickInstruction = value;
  }

  public boolean isSetQuickInstruction() {
    return (this.quickInstruction != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getDictionaryRef() {
    if (dictionaryRef == null) {
      dictionaryRef = new HashSet<>();
    }
    return this.dictionaryRef;
  }

  public boolean isSetDictionaryRef() {
    return ((this.dictionaryRef != null) && (!this.dictionaryRef.isEmpty()));
  }

  /**
   * Clear the DictionaryRef field. This sets the field to null.
   */
  public void unsetDictionaryRef() {
    this.dictionaryRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link TimePeriod} instance
   * @since 3.1.0
   */
  public Set<TimePeriod> getTimePeriod() {
    if (timePeriod == null) {
      timePeriod = new HashSet<>();
    }
    return this.timePeriod;
  }

  public boolean isSetTimePeriod() {
    return ((this.timePeriod != null) && (!this.timePeriod.isEmpty()));
  }

  /**
   * Clear the TimePeriod field. This sets the field to null.
   */
  public void unsetTimePeriod() {
    this.timePeriod = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getJRFLRef() {
    return jrflRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setJRFLRef(ElmRef value) {
    this.jrflRef = value;
  }

  public boolean isSetJRFLRef() {
    return (this.jrflRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NetRef} instance
   * @since 3.1.0
   */
  public Set<NetRef> getNetRef() {
    if (netRef == null) {
      netRef = new HashSet<>();
    }
    return this.netRef;
  }

  public boolean isSetNetRef() {
    return ((this.netRef != null) && (!this.netRef.isEmpty()));
  }

  /**
   * Clear the NetRef field. This sets the field to null.
   */
  public void unsetNetRef() {
    this.netRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getVersion() {
    return version;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setVersion(BigDecimal value) {
    this.version = value;
  }

  public boolean isSetVersion() {
    return (this.version != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ShortTitleInfo}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withShortTitleInfo(ShortTitleInfo value) {
    setShortTitleInfo(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withFERef(ElmRef value) {
    setFERef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withBSMPlanRef(ElmRef value) {
    setBSMPlanRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withQuickInstruction(Memo value) {
    setQuickInstruction(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withDictionaryRef(ElmRef... values) {
    if (values != null) {
      getDictionaryRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link DictionaryRef} instances
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withDictionaryRef(Collection<ElmRef> values) {
    if (values != null) {
      getDictionaryRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TimePeriod...}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withTimePeriod(TimePeriod... values) {
    if (values != null) {
      getTimePeriod().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TimePeriod} instances
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withTimePeriod(Collection<TimePeriod> values) {
    if (values != null) {
      getTimePeriod().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withJRFLRef(ElmRef value) {
    setJRFLRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NetRef...}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withNetRef(NetRef... values) {
    if (values != null) {
      getNetRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NetRef} instances
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withNetRef(Collection<NetRef> values) {
    if (values != null) {
      getNetRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current CEOI object instance
   * @since 3.1.0
   */
  public CEOI withVersion(BigDecimal value) {
    setVersion(value);
    return this;
  }

  /**
   * Get a string representation of this CEOI instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CEOI {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CEOI} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null FERef}, {@link null QuickInstruction}, {@link null ShortTitleInfo}, {@link null TimePeriod}, {@link null version}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFERef() && isSetQuickInstruction() && isSetShortTitleInfo() && isSetTimePeriod() && isSetVersion();
  }

}
