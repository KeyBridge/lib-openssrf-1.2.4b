package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.math.BigDecimal;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.EmsDesignator;

/**
 * EmsStd
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEmsStd", propOrder = {
  "emsSpec"
})
public class EmsStd extends Std<EmsStd> {

  @XmlElement(name = "EmsSpec", required = true)
  protected Set<EmsStd.EmsSpec> emsSpec;

  public Set<EmsStd.EmsSpec> getEmsSpec() {
    if (emsSpec == null) {
      emsSpec = new HashSet<>();
    }
    return this.emsSpec;
  }

  public boolean isSetEmsSpec() {
    return ((this.emsSpec != null) && (!this.emsSpec.isEmpty()));
  }

  /**
   * Clear the EmsSpec field. This sets the field to null.
   */
  public void unsetEmsSpec() {
    this.emsSpec = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link EmsStd.EmsSpec...}
   * @return The current EmsStd object instance
   * @since 3.1.0
   */
  public EmsStd withEmsSpec(EmsStd.EmsSpec... values) {
    if (values != null) {
      getEmsSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EmsSpec} instances
   * @return The current EmsStd object instance
   * @since 3.1.0
   */
  public EmsStd withEmsSpec(Collection<EmsStd.EmsSpec> values) {
    if (values != null) {
      getEmsSpec().addAll(values);
    }
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "emsDesignator",
    "emsPowerLimit",
    "emsSpurious"
  })
  public static class EmsSpec {

    @XmlElement(name = "EmsDesignator")
    protected EmsDesignator emsDesignator;

    @XmlElement(name = "EmsPowerLimit")
    protected Set<EmsPowerLimit> emsPowerLimit;

    @XmlElement(name = "EmsSpurious")
    protected Set<EmsSpurious> emsSpurious;
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

    @XmlAttribute(name = "requiredMod")
    protected String requiredMod;

    @XmlAttribute(name = "authBW")
    protected BigDecimal authBW;

    @XmlAttribute(name = "chnlSpacing")
    protected BigDecimal chnlSpacing;

    @XmlAttribute(name = "duplexSeparation")
    protected BigDecimal duplexSeparation;

    @XmlAttribute(name = "tolerance")
    protected BigDecimal tolerance;

    @XmlAttribute(name = "intermodAttenuation")
    protected BigDecimal intermodAttenuation;

    @XmlAttribute(name = "txAttackTime")
    protected BigDecimal txAttackTime;

    @XmlAttribute(name = "txReleaseTime")
    protected BigDecimal txReleaseTime;

    /**
     * Get
     * <p>
     * @return a {@link EmsDesignator} instance
     * @since 3.1.0
     */
    public EmsDesignator getEmsDesignator() {
      return emsDesignator;
    }

    /**
     * Set
     * <p>
     * @param value a {@link EmsDesignator} instance
     * @since 3.1.0
     */
    public void setEmsDesignator(EmsDesignator value) {
      this.emsDesignator = value;
    }

    public boolean isSetEmsDesignator() {
      return (this.emsDesignator != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link EmsPowerLimit} instance
     * @since 3.1.0
     */
    public Set<EmsPowerLimit> getEmsPowerLimit() {
      if (emsPowerLimit == null) {
        emsPowerLimit = new HashSet<>();
      }
      return this.emsPowerLimit;
    }

    public boolean isSetEmsPowerLimit() {
      return ((this.emsPowerLimit != null) && (!this.emsPowerLimit.isEmpty()));
    }

    /**
     * Clear the EmsPowerLimit field. This sets the field to null.
     */
    public void unsetEmsPowerLimit() {
      this.emsPowerLimit = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link EmsSpurious} instance
     * @since 3.1.0
     */
    public Set<EmsSpurious> getEmsSpurious() {
      if (emsSpurious == null) {
        emsSpurious = new HashSet<>();
      }
      return this.emsSpurious;
    }

    public boolean isSetEmsSpurious() {
      return ((this.emsSpurious != null) && (!this.emsSpurious.isEmpty()));
    }

    /**
     * Clear the EmsSpurious field. This sets the field to null.
     */
    public void unsetEmsSpurious() {
      this.emsSpurious = null;
    }

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
    public String getRequiredMod() {
      return requiredMod;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setRequiredMod(String value) {
      this.requiredMod = value;
    }

    public boolean isSetRequiredMod() {
      return (this.requiredMod != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getAuthBW() {
      return authBW;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setAuthBW(BigDecimal value) {
      this.authBW = value;
    }

    public boolean isSetAuthBW() {
      return (this.authBW != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getChnlSpacing() {
      return chnlSpacing;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setChnlSpacing(BigDecimal value) {
      this.chnlSpacing = value;
    }

    public boolean isSetChnlSpacing() {
      return (this.chnlSpacing != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getDuplexSeparation() {
      return duplexSeparation;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setDuplexSeparation(BigDecimal value) {
      this.duplexSeparation = value;
    }

    public boolean isSetDuplexSeparation() {
      return (this.duplexSeparation != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getTolerance() {
      return tolerance;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setTolerance(BigDecimal value) {
      this.tolerance = value;
    }

    public boolean isSetTolerance() {
      return (this.tolerance != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getIntermodAttenuation() {
      return intermodAttenuation;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setIntermodAttenuation(BigDecimal value) {
      this.intermodAttenuation = value;
    }

    public boolean isSetIntermodAttenuation() {
      return (this.intermodAttenuation != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getTxAttackTime() {
      return txAttackTime;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setTxAttackTime(BigDecimal value) {
      this.txAttackTime = value;
    }

    public boolean isSetTxAttackTime() {
      return (this.txAttackTime != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getTxReleaseTime() {
      return txReleaseTime;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setTxReleaseTime(BigDecimal value) {
      this.txReleaseTime = value;
    }

    public boolean isSetTxReleaseTime() {
      return (this.txReleaseTime != null);
    }

    public EmsStd.EmsSpec withEmsDesignator(EmsDesignator value) {
      setEmsDesignator(value);
      return this;
    }

    public EmsStd.EmsSpec withEmsPowerLimit(EmsPowerLimit... values) {
      if (values != null) {
        getEmsPowerLimit().addAll(Arrays.asList(values));
      }
      return this;
    }

    public EmsStd.EmsSpec withEmsPowerLimit(Collection<EmsPowerLimit> values) {
      if (values != null) {
        getEmsPowerLimit().addAll(values);
      }
      return this;
    }

    public EmsStd.EmsSpec withEmsSpurious(EmsSpurious... values) {
      if (values != null) {
        getEmsSpurious().addAll(Arrays.asList(values));
      }
      return this;
    }

    public EmsStd.EmsSpec withEmsSpurious(Collection<EmsSpurious> values) {
      if (values != null) {
        getEmsSpurious().addAll(values);
      }
      return this;
    }

    public EmsStd.EmsSpec withCls(String value) {
      setCls(value);
      return this;
    }

    public EmsStd.EmsSpec withRequiredMod(String value) {
      setRequiredMod(value);
      return this;
    }

    public EmsStd.EmsSpec withAuthBW(BigDecimal value) {
      setAuthBW(value);
      return this;
    }

    public EmsStd.EmsSpec withChnlSpacing(BigDecimal value) {
      setChnlSpacing(value);
      return this;
    }

    public EmsStd.EmsSpec withDuplexSeparation(BigDecimal value) {
      setDuplexSeparation(value);
      return this;
    }

    public EmsStd.EmsSpec withTolerance(BigDecimal value) {
      setTolerance(value);
      return this;
    }

    public EmsStd.EmsSpec withIntermodAttenuation(BigDecimal value) {
      setIntermodAttenuation(value);
      return this;
    }

    public EmsStd.EmsSpec withTxAttackTime(BigDecimal value) {
      setTxAttackTime(value);
      return this;
    }

    public EmsStd.EmsSpec withTxReleaseTime(BigDecimal value) {
      setTxReleaseTime(value);
      return this;
    }

  }

  /**
   * Get a string representation of this EmsStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EmsStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsStd} requires {@link null EmsSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetEmsSpec();
  }

}
