/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4.common;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * ClsDerived (US) contains the derived security classification from one or more
 * data information sources.
 * <p>
 * Element of {@link SecurityClass}
 * <p>
 * Example:
 * <pre>
 * &lt;ClsDerived&gt;
 *   &lt;Date&gt;1993-08-15&lt;/Date&gt;
 *   &lt;Title&gt;B-1B SCG&lt;/Title&gt;
 *   &lt;Org&gt;OC-ALC/LAB&lt;/Org&gt;
 * &lt;/ClsDerived&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TClsDerived")
public class ClsDerived {

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
   * US:Date - Derivative Classification Date (Required)
   * <p>
   * The date of the source document.
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
   * US:Title - Derivative Classification Document Title (Required)
   * <p>
   * The title of the source document.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "title", required = true)
  protected String title;
  /**
   * US:Org - Derivative Classification Publishing Organisa (Required)
   * <p>
   * The publishing organization of the source document.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "org", required = true)
  protected String org;

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
   * Get the date of the source document.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getDate() {
    return date;
  }

  /**
   * Set the date of the source document.
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
   * Get the title of the source document.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set the title of the source document.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Get the publishing organization of the source document.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrg() {
    return org;
  }

  /**
   * Set the publishing organization of the source document.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrg(String value) {
    this.org = value;
  }

  public boolean isSetOrg() {
    return (this.org != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsDerived object instance
   * @since 3.1.0
   */
  public ClsDerived withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current ClsDerived object instance
   * @since 3.1.0
   */
  public ClsDerived withDate(Calendar value) {
    setDate(value);
    return this;
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current ClsDerived object instance
   * @since 3.1.0
   */
  public ClsDerived withDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setDate(calendar);
    return this;
  }

  /**
   * Set the title of the source document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsDerived object instance
   * @since 3.1.0
   */
  public ClsDerived withTitle(String value) {
    setTitle(value);
    return this;
  }

  /**
   * Set the publishing organization of the source document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsDerived object instance
   * @since 3.1.0
   */
  public ClsDerived withOrg(String value) {
    setOrg(value);
    return this;
  }

  /**
   * Get a string representation of this ClsDerived instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ClsDerived {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ClsDerived} requires
   * {@link null date}, {@link null org}, {@link null title}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDate() && isSetOrg() && isSetTitle();
  }

}
