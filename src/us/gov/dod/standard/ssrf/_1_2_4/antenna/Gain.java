package us.gov.dod.standard.ssrf._1_2_4.antenna;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Gain
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGain")
public class Gain {

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

  @XmlAttribute(name = "minGain", required = true)
  protected BigDecimal minGain;

  @XmlAttribute(name = "maxGain")
  protected BigDecimal maxGain;
  /**
   * FrontToBackRatio - Front-to-back Ratio (Optional)
   * <p>
   * The front-to-back ratio of the main beam to the back lobe.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "frontToBackRatio")
  protected BigDecimal frontToBackRatio;

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
  public BigDecimal getMinGain() {
    return minGain;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinGain(BigDecimal value) {
    this.minGain = value;
  }

  public boolean isSetMinGain() {
    return (this.minGain != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxGain() {
    return maxGain;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxGain(BigDecimal value) {
    this.maxGain = value;
  }

  public boolean isSetMaxGain() {
    return (this.maxGain != null);
  }

  /**
   * Get the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setFrontToBackRatio(BigDecimal value) {
    this.frontToBackRatio = value;
  }

  public boolean isSetFrontToBackRatio() {
    return (this.frontToBackRatio != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Gain object instance
   * @since 3.1.0
   */
  public Gain withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Gain object instance
   * @since 3.1.0
   */
  public Gain withMinGain(BigDecimal value) {
    setMinGain(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Gain object instance
   * @since 3.1.0
   */
  public Gain withMaxGain(BigDecimal value) {
    setMaxGain(value);
    return this;
  }

  /**
   * Set the front-to-back ratio of the main beam to the back lobe.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Gain object instance
   * @since 3.1.0
   */
  public Gain withFrontToBackRatio(BigDecimal value) {
    setFrontToBackRatio(value);
    return this;
  }

  /**
   * Get a string representation of this Gain instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Gain {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Gain} requires {@link null minGain}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetMinGain();
  }

}
