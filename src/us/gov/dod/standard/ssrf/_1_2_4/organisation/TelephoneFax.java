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
package us.gov.dod.standard.ssrf._1_2_4.organisation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * TelephoneFax reflects the telephone and/or telefax number(s) of the Contact,
 * Organisation or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;TelephoneFax&gt;
 *   &lt;Type cls="U"&gt;TEL-Civil&lt;/Type&gt;
 *   &lt;Number cls="U"&gt;(202)281-3824x1234&lt;/Number&gt;
 * &lt;/TelephoneFax&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTelephoneFax", propOrder = {
  "value"
})
public class TelephoneFax {

  @XmlValue
  protected String value;
  /**
   * MaxCls - System Maximum Classification (Optional)
   * <p>
   * The highest classification that can be used on the network. Note for the
   * USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "system")
  protected String system;

  @XmlAttribute(name = "countryCode")
  protected String countryCode;

  @XmlAttribute(name = "numType", required = true)
  protected String numType;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
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
  public String getSystem() {
    return system;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSystem(String value) {
    this.system = value;
  }

  public boolean isSetSystem() {
    return (this.system != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCountryCode(String value) {
    this.countryCode = value;
  }

  public boolean isSetCountryCode() {
    return (this.countryCode != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getNumType() {
    return numType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setNumType(String value) {
    this.numType = value;
  }

  public boolean isSetNumType() {
    return (this.numType != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   * @since 3.1.0
   */
  public TelephoneFax withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   * @since 3.1.0
   */
  public TelephoneFax withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   * @since 3.1.0
   */
  public TelephoneFax withSystem(String value) {
    setSystem(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   * @since 3.1.0
   */
  public TelephoneFax withCountryCode(String value) {
    setCountryCode(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   * @since 3.1.0
   */
  public TelephoneFax withNumType(String value) {
    setNumType(value);
    return this;
  }

  /**
   * Get a string representation of this TelephoneFax instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TelephoneFax {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TelephoneFax} requires {@link null numType}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumType();
  }

}
