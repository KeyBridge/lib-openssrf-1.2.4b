package us.gov.dod.standard.ssrf._1_2_4.common;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * Downgrade (US) contains the downgrade security classification from one or
 * more data information sources.
 * <p>
 * Element of {@link SecurityClass}
 * <p>
 * Example:
 * <pre>
 * &lt;Downgrade&gt;
 *   &lt;DownCls&gt;C&lt;/DownCls&gt;
 *   &lt;Date&gt;1999-11-05&lt;/Date&gt;
 * &lt;/Downgrade&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDowngrade")
public class Downgrade {

  /**
   * US:Downcls - Downgrading Classification (Required)
   * <p>
   * The classification level of the dataset after downgrading.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;
  /**
   * US:Downcls - Downgrading Classification (Required)
   * <p>
   * The classification level of the dataset after downgrading.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "downCls", required = true)
  protected String downCls;
  /**
   * US:Date - Downgrading Date (Required)
   * <p>
   * The date of the permitted downgrading.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "date", required = true)
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar date;

  /**
   * Get the classification level of the dataset after downgrading.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the classification level of the dataset after downgrading.
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
   * Get the classification level of the dataset after downgrading.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getDownCls() {
    return downCls;
  }

  /**
   * Set the classification level of the dataset after downgrading.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setDownCls(String value) {
    this.downCls = value;
  }

  public boolean isSetDownCls() {
    return (this.downCls != null);
  }

  /**
   * Get the date of the permitted downgrading.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getDate() {
    return date;
  }

  /**
   * Set the date of the permitted downgrading.
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
   * Set the classification level of the dataset after downgrading.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Downgrade object instance
   * @since 3.1.0
   */
  public Downgrade withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the classification level of the dataset after downgrading.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Downgrade object instance
   * @since 3.1.0
   */
  public Downgrade withDownCls(String value) {
    setDownCls(value);
    return this;
  }

  /**
   * Set the date of the permitted downgrading.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Downgrade object instance
   * @since 3.1.0
   */
  public Downgrade withDate(Calendar value) {
    setDate(value);
    return this;
  }

  /**
   * Set the date of the permitted downgrading.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Downgrade object instance
   * @since 3.1.0
   */
  public Downgrade withDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setDate(calendar);
    return this;
  }

  /**
   * Get a string representation of this Downgrade instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Downgrade {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Downgrade} requires {@link null date}, {@link null downCls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDate() && isSetDownCls();
  }

}
