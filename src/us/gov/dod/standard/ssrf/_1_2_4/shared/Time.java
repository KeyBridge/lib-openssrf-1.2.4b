package us.gov.dod.standard.ssrf._1_2_4.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Time indicates when the equipment or system will be used.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTime", propOrder = {
  "timeFrame"
})
public class Time {

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;
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
  /**
   * Period - Period (Optional)
   * <p>
   * The period of usage.
   * <p>
   * Format is L:CTI
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "period")
  protected String period;

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
   * Get the period of usage.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPeriod() {
    return period;
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPeriod(String value) {
    this.period = value;
  }

  public boolean isSetPeriod() {
    return (this.period != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current Time object instance
   * @since 3.1.0
   */
  public Time withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Time object instance
   * @since 3.1.0
   */
  public Time withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the period of usage.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Time object instance
   * @since 3.1.0
   */
  public Time withPeriod(String value) {
    setPeriod(value);
    return this;
  }

  /**
   * Get a string representation of this Time instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Time {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Time} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
