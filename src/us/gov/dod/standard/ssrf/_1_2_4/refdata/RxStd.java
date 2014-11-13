package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.math.BigDecimal;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * RxStd
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRxStd", propOrder = {
  "rxSpec"
})
public class RxStd extends Std<RxStd> {

  @XmlElement(name = "RxSpec", required = true)
  protected Set<RxStd.RxSpec> rxSpec;

  public Set<RxStd.RxSpec> getRxSpec() {
    if (rxSpec == null) {
      rxSpec = new HashSet<>();
    }
    return this.rxSpec;
  }

  public boolean isSetRxSpec() {
    return ((this.rxSpec != null) && (!this.rxSpec.isEmpty()));
  }

  /**
   * Clear the RxSpec field. This sets the field to null.
   */
  public void unsetRxSpec() {
    this.rxSpec = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RxStd.RxSpec...}
   * @return The current RxStd object instance
   * @since 3.1.0
   */
  public RxStd withRxSpec(RxStd.RxSpec... values) {
    if (values != null) {
      getRxSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RxSpec} instances
   * @return The current RxStd object instance
   * @since 3.1.0
   */
  public RxStd withRxSpec(Collection<RxStd.RxSpec> values) {
    if (values != null) {
      getRxSpec().addAll(values);
    }
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "rxSpurious"
  })
  public static class RxSpec {

    @XmlElement(name = "RxSpurious")
    protected Set<RxStd.RxSpec.RxSpurious> rxSpurious;
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

    @XmlAttribute(name = "sensitivity")
    protected BigDecimal sensitivity;

    @XmlAttribute(name = "sensitivitytype")
    protected String sensitivitytype;

    @XmlAttribute(name = "selectivity")
    protected BigDecimal selectivity;

    @XmlAttribute(name = "selectivityOffset")
    protected BigDecimal selectivityOffset;

    @XmlAttribute(name = "tolerance")
    protected BigDecimal tolerance;

    @XmlAttribute(name = "intermodRejection")
    protected BigDecimal intermodRejection;

    public Set<RxStd.RxSpec.RxSpurious> getRxSpurious() {
      if (rxSpurious == null) {
        rxSpurious = new HashSet<>();
      }
      return this.rxSpurious;
    }

    public boolean isSetRxSpurious() {
      return ((this.rxSpurious != null) && (!this.rxSpurious.isEmpty()));
    }

    /**
     * Clear the RxSpurious field. This sets the field to null.
     */
    public void unsetRxSpurious() {
      this.rxSpurious = null;
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
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getSensitivity() {
      return sensitivity;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setSensitivity(BigDecimal value) {
      this.sensitivity = value;
    }

    public boolean isSetSensitivity() {
      return (this.sensitivity != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getSensitivitytype() {
      return sensitivitytype;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setSensitivitytype(String value) {
      this.sensitivitytype = value;
    }

    public boolean isSetSensitivitytype() {
      return (this.sensitivitytype != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getSelectivity() {
      return selectivity;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setSelectivity(BigDecimal value) {
      this.selectivity = value;
    }

    public boolean isSetSelectivity() {
      return (this.selectivity != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getSelectivityOffset() {
      return selectivityOffset;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setSelectivityOffset(BigDecimal value) {
      this.selectivityOffset = value;
    }

    public boolean isSetSelectivityOffset() {
      return (this.selectivityOffset != null);
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
    public BigDecimal getIntermodRejection() {
      return intermodRejection;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setIntermodRejection(BigDecimal value) {
      this.intermodRejection = value;
    }

    public boolean isSetIntermodRejection() {
      return (this.intermodRejection != null);
    }

    public RxStd.RxSpec withRxSpurious(RxStd.RxSpec.RxSpurious... values) {
      if (values != null) {
        getRxSpurious().addAll(Arrays.asList(values));
      }
      return this;
    }

    public RxStd.RxSpec withRxSpurious(Collection<RxStd.RxSpec.RxSpurious> values) {
      if (values != null) {
        getRxSpurious().addAll(values);
      }
      return this;
    }

    public RxStd.RxSpec withCls(String value) {
      setCls(value);
      return this;
    }

    public RxStd.RxSpec withSensitivity(BigDecimal value) {
      setSensitivity(value);
      return this;
    }

    public RxStd.RxSpec withSensitivitytype(String value) {
      setSensitivitytype(value);
      return this;
    }

    public RxStd.RxSpec withSelectivity(BigDecimal value) {
      setSelectivity(value);
      return this;
    }

    public RxStd.RxSpec withSelectivityOffset(BigDecimal value) {
      setSelectivityOffset(value);
      return this;
    }

    public RxStd.RxSpec withTolerance(BigDecimal value) {
      setTolerance(value);
      return this;
    }

    public RxStd.RxSpec withIntermodRejection(BigDecimal value) {
      setIntermodRejection(value);
      return this;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RxSpurious {

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

      @XmlAttribute(name = "rejection")
      protected BigDecimal rejection;

      @XmlAttribute(name = "separation")
      protected String separation;

      @XmlAttribute(name = "radiationLimit")
      protected BigDecimal radiationLimit;

      @XmlAttribute(name = "radiationType")
      protected String radiationType;

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
       * @return a {@link BigDecimal} instance
       * @since 3.1.0
       */
      public BigDecimal getRejection() {
        return rejection;
      }

      /**
       * Set
       * <p>
       * @param value a {@link BigDecimal} instance
       * @since 3.1.0
       */
      public void setRejection(BigDecimal value) {
        this.rejection = value;
      }

      public boolean isSetRejection() {
        return (this.rejection != null);
      }

      /**
       * Get
       * <p>
       * @return a {@link String} instance
       * @since 3.1.0
       */
      public String getSeparation() {
        return separation;
      }

      /**
       * Set
       * <p>
       * @param value a {@link String} instance
       * @since 3.1.0
       */
      public void setSeparation(String value) {
        this.separation = value;
      }

      public boolean isSetSeparation() {
        return (this.separation != null);
      }

      /**
       * Get
       * <p>
       * @return a {@link BigDecimal} instance
       * @since 3.1.0
       */
      public BigDecimal getRadiationLimit() {
        return radiationLimit;
      }

      /**
       * Set
       * <p>
       * @param value a {@link BigDecimal} instance
       * @since 3.1.0
       */
      public void setRadiationLimit(BigDecimal value) {
        this.radiationLimit = value;
      }

      public boolean isSetRadiationLimit() {
        return (this.radiationLimit != null);
      }

      /**
       * Get
       * <p>
       * @return a {@link String} instance
       * @since 3.1.0
       */
      public String getRadiationType() {
        return radiationType;
      }

      /**
       * Set
       * <p>
       * @param value a {@link String} instance
       * @since 3.1.0
       */
      public void setRadiationType(String value) {
        this.radiationType = value;
      }

      public boolean isSetRadiationType() {
        return (this.radiationType != null);
      }

      public RxStd.RxSpec.RxSpurious withCls(String value) {
        setCls(value);
        return this;
      }

      public RxStd.RxSpec.RxSpurious withRejection(BigDecimal value) {
        setRejection(value);
        return this;
      }

      public RxStd.RxSpec.RxSpurious withSeparation(String value) {
        setSeparation(value);
        return this;
      }

      public RxStd.RxSpec.RxSpurious withRadiationLimit(BigDecimal value) {
        setRadiationLimit(value);
        return this;
      }

      public RxStd.RxSpec.RxSpurious withRadiationType(String value) {
        setRadiationType(value);
        return this;
      }

    }

  }

  /**
   * Get a string representation of this RxStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxStd} requires {@link null RxSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetRxSpec();
  }

}
