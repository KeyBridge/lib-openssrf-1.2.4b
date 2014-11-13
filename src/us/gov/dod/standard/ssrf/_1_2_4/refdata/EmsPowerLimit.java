package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Elevation;
import us.gov.dod.standard.ssrf._1_2_4.shared.TimeFrame;

/**
 * EmsPowerLimit
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEmsPowerLimit", propOrder = {
  "timeFrame",
  "elevation",
  "powerLimit"
})
public class EmsPowerLimit {

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;

  @XmlElement(name = "Elevation")
  protected Elevation elevation;

  @XmlElement(name = "PowerLimit")
  protected EmsPowerLimit.PowerLimit powerLimit;
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

  @XmlAttribute(name = "dutyCycle")
  protected BigDecimal dutyCycle;

  @XmlAttribute(name = "powerRefDist")
  protected BigInteger powerRefDist;

  /**
   * Get
   * <p>
   * @return the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public TimeFrame getTimeFrame() {
    return timeFrame;
  }

  /**
   * Set
   * <p>
   * @param value the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public void setTimeFrame(TimeFrame value) {
    this.timeFrame = value;
  }

  public boolean isSetTimeFrame() {
    return (this.timeFrame != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Elevation} instance
   * @since 3.1.0
   */
  public Elevation getElevation() {
    return elevation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Elevation} instance
   * @since 3.1.0
   */
  public void setElevation(Elevation value) {
    this.elevation = value;
  }

  public boolean isSetElevation() {
    return (this.elevation != null);
  }

  public EmsPowerLimit.PowerLimit getPowerLimit() {
    return powerLimit;
  }

  /**
   * Set
   * <p>
   * @param value a {@link EmsPowerLimit} instance
   * @since 3.1.0
   */
  public void setPowerLimit(EmsPowerLimit.PowerLimit value) {
    this.powerLimit = value;
  }

  public boolean isSetPowerLimit() {
    return (this.powerLimit != null);
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
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDutyCycle() {
    return dutyCycle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDutyCycle(BigDecimal value) {
    this.dutyCycle = value;
  }

  public boolean isSetDutyCycle() {
    return (this.dutyCycle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getPowerRefDist() {
    return powerRefDist;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setPowerRefDist(BigInteger value) {
    this.powerRefDist = value;
  }

  public boolean isSetPowerRefDist() {
    return (this.powerRefDist != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Elevation}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withElevation(Elevation value) {
    setElevation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link EmsPowerLimit.PowerLimit}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withPowerLimit(EmsPowerLimit.PowerLimit value) {
    setPowerLimit(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withDutyCycle(BigDecimal value) {
    setDutyCycle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current EmsPowerLimit object instance
   * @since 3.1.0
   */
  public EmsPowerLimit withPowerRefDist(BigInteger value) {
    setPowerRefDist(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class PowerLimit {

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

    @XmlAttribute(name = "limit")
    protected BigDecimal limit;

    @XmlAttribute(name = "type")
    protected String type;

    @XmlAttribute(name = "criteria")
    protected String criteria;

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
    public BigDecimal getLimit() {
      return limit;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setLimit(BigDecimal value) {
      this.limit = value;
    }

    public boolean isSetLimit() {
      return (this.limit != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getType() {
      return type;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setType(String value) {
      this.type = value;
    }

    public boolean isSetType() {
      return (this.type != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCriteria() {
      return criteria;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCriteria(String value) {
      this.criteria = value;
    }

    public boolean isSetCriteria() {
      return (this.criteria != null);
    }

    public EmsPowerLimit.PowerLimit withCls(String value) {
      setCls(value);
      return this;
    }

    public EmsPowerLimit.PowerLimit withLimit(BigDecimal value) {
      setLimit(value);
      return this;
    }

    public EmsPowerLimit.PowerLimit withType(String value) {
      setType(value);
      return this;
    }

    public EmsPowerLimit.PowerLimit withCriteria(String value) {
      setCriteria(value);
      return this;
    }

  }

  /**
   * Get a string representation of this EmsPowerLimit instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EmsPowerLimit {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsPowerLimit} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
