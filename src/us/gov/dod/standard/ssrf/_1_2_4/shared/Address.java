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
package us.gov.dod.standard.ssrf._1_2_4.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Contact;
import us.gov.dod.standard.ssrf._1_2_4.Organisation;
import us.gov.dod.standard.ssrf._1_2_4.Role;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;

/**
 * Address contains the address of a Contact, Organisation or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;Address&gt;
 *   &lt;CityArea  cls="U"&gt;Annapolis&lt;/CityArea &gt;
 *   &lt;Country  cls="U"&gt;USA&lt;/Country &gt;
 *   &lt;Description  cls="U"&gt;Engineering Services Organization&lt;/Description &gt;
 *   &lt;PostCode  cls="U"&gt;21402&lt;/PostCode &gt;
 *   &lt;StateCounty  cls="U"&gt;Maryland&lt;/StateCounty &gt;
 *   &lt;Street  cls="U"&gt;Turbot&lt;/Street &gt;
 * &lt;/Address&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddress")
public class Address {

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
   * Street - Street Address (Optional)
   * <p>
   * The street address.
   * <p>
   * Format is S255
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "street")
  protected String street;
  /**
   * CityArea - City or Area (Optional)
   * <p>
   * The city of the address or an operational area name.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cityArea")
  protected String cityArea;
  /**
   * StateCounty - State or County (Optional)
   * <p>
   * The state or other sub-national political area.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "state")
  protected String state;
  /**
   * PostCode - Zip Code or Post Code (Optional)
   * <p>
   * The zip code or postal code portion of the address.
   * <p>
   * Format is S15
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "postCode")
  protected String postCode;
  /**
   * Country - Country or Area (Required)
   * <p>
   * The country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * Format is L:CAO
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "country", required = true)
  protected ListAO country;

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
   * Get the street address.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getStreet() {
    return street;
  }

  /**
   * Set the street address.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setStreet(String value) {
    this.street = value;
  }

  public boolean isSetStreet() {
    return (this.street != null);
  }

  /**
   * Get the city of the address or an operational area name.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCityArea() {
    return cityArea;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCityArea(String value) {
    this.cityArea = value;
  }

  public boolean isSetCityArea() {
    return (this.cityArea != null);
  }

  /**
   * Get the state or other sub-national political area.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getState() {
    return state;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setState(String value) {
    this.state = value;
  }

  public boolean isSetState() {
    return (this.state != null);
  }

  /**
   * Get the zip code or postal code portion of the address.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPostCode() {
    return postCode;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPostCode(String value) {
    this.postCode = value;
  }

  public boolean isSetPostCode() {
    return (this.postCode != null);
  }

  /**
   * Get the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getCountry() {
    return country;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setCountry(ListAO value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the street address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withStreet(String value) {
    setStreet(value);
    return this;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withCityArea(String value) {
    setCityArea(value);
    return this;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withState(String value) {
    setState(value);
    return this;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withPostCode(String value) {
    setPostCode(value);
    return this;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current Address object instance
   * @since 3.1.0
   */
  public Address withCountry(ListAO value) {
    setCountry(value);
    return this;
  }

  /**
   * Get a string representation of this Address instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Address {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Address} requires {@link null country}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCountry();
  }

}
