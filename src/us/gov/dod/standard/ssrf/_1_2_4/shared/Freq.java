package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * Freq indicates a single assigned frequency or an assigned range of
 * frequencies.
 * <p>
 * Element of {@link Assigned}
 * <p>
 * Sub-Elements are {@link NarrowBandPlanning}, {@link PairedFreq}
 * <p>
 * Example:
 * <pre>
 * &lt;Freq&gt;
 *   &lt;FreqMin cls="U"&gt;351.125&lt;/FreqMin&gt;
 *   &lt;LegacyNum cls="U"&gt;USAF11012345&lt;/LegacyNum&gt;
 * &lt;/Freq&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFreq", propOrder = {
  "freqSingle",
  "freqRange",
  "freqOld",
  "pairedFreq",
  "ituRegistration",
  "legacyNum",
  "narrowBandPlanning"
})
public class Freq {

  @XmlElement(name = "FreqSingle")
  protected FreqSingle freqSingle;

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;

  @XmlElement(name = "FreqOld")
  protected FreqOld freqOld;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedFreq")
  protected PairedFreq pairedFreq;

  @XmlElement(name = "ITURegistration")
  protected Freq.ITURegistration ituRegistration;
  /**
   * LegacyNum - Legacy Number (Optional)
   * <p>
   * A legacy reference number associated with the assigned frequency.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LegacyNum")
  protected Set<LegacyNum> legacyNum;
  /**
   * US:NarrowBandPlanning (Optional)
   * <p>
   * NarrowBandPlanning (US) describes a reduced bandwidth assignment for a
   * single frequency or a range of frequencies.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NarrowBandPlanning")
  protected NarrowBandPlanning narrowBandPlanning;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "status")
  protected String status;

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public FreqSingle getFreqSingle() {
    return freqSingle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public void setFreqSingle(FreqSingle value) {
    this.freqSingle = value;
  }

  public boolean isSetFreqSingle() {
    return (this.freqSingle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public FreqRange getFreqRange() {
    return freqRange;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqRange} instance
   * @since 3.1.0
   */
  public void setFreqRange(FreqRange value) {
    this.freqRange = value;
  }

  public boolean isSetFreqRange() {
    return (this.freqRange != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqOld} instance
   * @since 3.1.0
   */
  public FreqOld getFreqOld() {
    return freqOld;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqOld} instance
   * @since 3.1.0
   */
  public void setFreqOld(FreqOld value) {
    this.freqOld = value;
  }

  public boolean isSetFreqOld() {
    return (this.freqOld != null);
  }

  /**
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @return a {@link PairedFreq} instance
   * @since 3.1.0
   */
  public PairedFreq getPairedFreq() {
    return pairedFreq;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value a {@link PairedFreq} instance
   * @since 3.1.0
   */
  public void setPairedFreq(PairedFreq value) {
    this.pairedFreq = value;
  }

  public boolean isSetPairedFreq() {
    return (this.pairedFreq != null);
  }

  public Freq.ITURegistration getITURegistration() {
    return ituRegistration;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Freq} instance
   * @since 3.1.0
   */
  public void setITURegistration(Freq.ITURegistration value) {
    this.ituRegistration = value;
  }

  public boolean isSetITURegistration() {
    return (this.ituRegistration != null);
  }

  /**
   * Get a legacy reference number associated with the assigned frequency.
   * <p>
   * @return a {@link LegacyNum} instance
   * @since 3.1.0
   */
  public Set<LegacyNum> getLegacyNum() {
    if (legacyNum == null) {
      legacyNum = new HashSet<>();
    }
    return this.legacyNum;
  }

  public boolean isSetLegacyNum() {
    return ((this.legacyNum != null) && (!this.legacyNum.isEmpty()));
  }

  /**
   * Clear the LegacyNum field. This sets the field to null.
   */
  public void unsetLegacyNum() {
    this.legacyNum = null;
  }

  /**
   * Get the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @return a {@link NarrowBandPlanning} instance
   * @since 3.1.0
   */
  public NarrowBandPlanning getNarrowBandPlanning() {
    return narrowBandPlanning;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param value a {@link NarrowBandPlanning} instance
   * @since 3.1.0
   */
  public void setNarrowBandPlanning(NarrowBandPlanning value) {
    this.narrowBandPlanning = value;
  }

  public boolean isSetNarrowBandPlanning() {
    return (this.narrowBandPlanning != null);
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCls(String value) {
    this.cls = value;
  }

  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getStatus() {
    return status;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setStatus(String value) {
    this.status = value;
  }

  public boolean isSetStatus() {
    return (this.status != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqSingle}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withFreqSingle(FreqSingle value) {
    setFreqSingle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqOld}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withFreqOld(FreqOld value) {
    setFreqOld(value);
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value An instances of type {@link PairedFreq}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withPairedFreq(PairedFreq value) {
    setPairedFreq(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Freq.ITURegistration}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withITURegistration(Freq.ITURegistration value) {
    setITURegistration(value);
    return this;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param values One or more instances of type {@link LegacyNum...}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withLegacyNum(LegacyNum... values) {
    if (values != null) {
      getLegacyNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a legacy reference number associated with the assigned frequency.
   * <p>
   * @param values A collection of {@link LegacyNum} instances
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withLegacyNum(Collection<LegacyNum> values) {
    if (values != null) {
      getLegacyNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:NarrowBandPlanning
   * <p>
   * Complex element NarrowBandPlanning (US) describes a reduced bandwidth
   * assignment for a single frequency or a range of frequencies.
   * <p>
   * @param value An instances of type {@link NarrowBandPlanning}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withNarrowBandPlanning(NarrowBandPlanning value) {
    setNarrowBandPlanning(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Freq object instance
   * @since 3.1.0
   */
  public Freq withStatus(String value) {
    setStatus(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class ITURegistration {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;

    @XmlAttribute(name = "code", required = true)
    protected String code;

    @XmlAttribute(name = "date", required = true)
    @XmlJavaTypeAdapter(XmlAdapterDATE.class)
    @XmlSchemaType(name = "date")
    protected Calendar date;
    /**
     * LegacyNum - Legacy Number (Optional)
     * <p>
     * A legacy reference number associated with the assigned frequency.
     * <p>
     * Format is S20
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "num", required = true)
    protected String num;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCls(String value) {
      this.cls = value;
    }

    public boolean isSetCls() {
      return (this.cls != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCode() {
      return code;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCode(String value) {
      this.code = value;
    }

    public boolean isSetCode() {
      return (this.code != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link Calendar} instance
     * @since 3.1.0
     */
    public Calendar getDate() {
      return date;
    }

    /**
     * Set
     * <p>
     * @param value a {@link Calendar} instance
     * @since 3.1.0
     */
    public void setDate(Calendar value) {
      this.date = value;
    }

    public boolean isSetDate() {
      return (this.date != null);
    }

    /**
     * Get a legacy reference number associated with the assigned frequency.
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getNum() {
      return num;
    }

    /**
     * Set a legacy reference number associated with the assigned frequency.
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setNum(String value) {
      this.num = value;
    }

    public boolean isSetNum() {
      return (this.num != null);
    }

    public Freq.ITURegistration withCls(String value) {
      setCls(value);
      return this;
    }

    public Freq.ITURegistration withCode(String value) {
      setCode(value);
      return this;
    }

    public Freq.ITURegistration withDate(Calendar value) {
      setDate(value);
      return this;
    }

    public Freq.ITURegistration withNum(String value) {
      setNum(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Freq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Freq {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Freq} requires
   * {@link null code}, {@link null date}, {@link null num}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
//    return isSetCode() && isSetDate() && isSetNum();
    return true;
  }

}
