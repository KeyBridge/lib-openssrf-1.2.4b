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

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListCC;

/**
 * Compartment
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCompartment", propOrder = {
  "value"
})
public class Compartment {

  @XmlValue
  protected ListCC value;
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

  @XmlAttribute(name = "xpath")
  protected String xpath;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link ListCC} instance
   * @since 3.1.0
   */
  public ListCC getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link ListCC} instance
   * @since 3.1.0
   */
  public void setValue(ListCC value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
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
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getXpath() {
    return xpath;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setXpath(String value) {
    this.xpath = value;
  }

  public boolean isSetXpath() {
    return (this.xpath != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link ListCC}
   * @return The current Compartment object instance
   * @since 3.1.0
   */
  public Compartment withValue(ListCC value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Compartment object instance
   * @since 3.1.0
   */
  public Compartment withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Compartment object instance
   * @since 3.1.0
   */
  public Compartment withXpath(String value) {
    setXpath(value);
    return this;
  }

  /**
   * Get a string representation of this Compartment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Compartment {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Compartment} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
