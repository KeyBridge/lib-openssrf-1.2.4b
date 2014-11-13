package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * SpreadSpectrumSweep
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSpreadSpectrumSweep")
public class SpreadSpectrumSweep {

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

  @XmlAttribute(name = "minTime")
  protected BigDecimal minTime;

  @XmlAttribute(name = "maxTime")
  protected BigDecimal maxTime;

  @XmlAttribute(name = "minFreq")
  protected BigDecimal minFreq;

  @XmlAttribute(name = "maxFreq")
  protected BigDecimal maxFreq;

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
  public BigDecimal getMinTime() {
    return minTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinTime(BigDecimal value) {
    this.minTime = value;
  }

  public boolean isSetMinTime() {
    return (this.minTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxTime() {
    return maxTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxTime(BigDecimal value) {
    this.maxTime = value;
  }

  public boolean isSetMaxTime() {
    return (this.maxTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinFreq() {
    return minFreq;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinFreq(BigDecimal value) {
    this.minFreq = value;
  }

  public boolean isSetMinFreq() {
    return (this.minFreq != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxFreq() {
    return maxFreq;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxFreq(BigDecimal value) {
    this.maxFreq = value;
  }

  public boolean isSetMaxFreq() {
    return (this.maxFreq != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SpreadSpectrumSweep object instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumSweep object instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep withMinTime(BigDecimal value) {
    setMinTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumSweep object instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep withMaxTime(BigDecimal value) {
    setMaxTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumSweep object instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep withMinFreq(BigDecimal value) {
    setMinFreq(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumSweep object instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep withMaxFreq(BigDecimal value) {
    setMaxFreq(value);
    return this;
  }

  /**
   * Get a string representation of this SpreadSpectrumSweep instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SpreadSpectrumSweep {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SpreadSpectrumSweep} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
