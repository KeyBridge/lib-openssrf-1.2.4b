package us.gov.dod.standard.ssrf._1_2_4.link;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Blanking contains the start and stop angles of a horizontal and/or vertical
 * sector that is blanked.
 * <p>
 * Element of {@link StationConfig}
 * <p>
 * Example:
 * <pre>
 * &lt;Blanking&gt;
 *   &lt;AzStart cls="U"&gt;25&lt;/AzStart&gt;
 *   &lt;AzStop cls="U"&gt;35&lt;/AzStop&gt;
 * &lt;/Blanking&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBlanking")
public class Blanking {

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

  @XmlAttribute(name = "startAz", required = true)
  protected BigDecimal startAz;

  @XmlAttribute(name = "stopAz", required = true)
  protected BigDecimal stopAz;

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
  public BigDecimal getStartAz() {
    return startAz;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setStartAz(BigDecimal value) {
    this.startAz = value;
  }

  public boolean isSetStartAz() {
    return (this.startAz != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getStopAz() {
    return stopAz;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setStopAz(BigDecimal value) {
    this.stopAz = value;
  }

  public boolean isSetStopAz() {
    return (this.stopAz != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Blanking object instance
   * @since 3.1.0
   */
  public Blanking withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Blanking object instance
   * @since 3.1.0
   */
  public Blanking withStartAz(BigDecimal value) {
    setStartAz(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Blanking object instance
   * @since 3.1.0
   */
  public Blanking withStopAz(BigDecimal value) {
    setStopAz(value);
    return this;
  }

  /**
   * Get a string representation of this Blanking instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Blanking {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Blanking} requires {@link null startAz}, {@link null stopAz}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetStartAz() && isSetStopAz();
  }

}
