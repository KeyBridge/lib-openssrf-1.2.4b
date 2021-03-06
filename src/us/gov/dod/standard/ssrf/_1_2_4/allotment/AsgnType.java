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
package us.gov.dod.standard.ssrf._1_2_4.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListCA;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListNR;

/**
 * AsgnType
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAsgnType")
public class AsgnType {

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

  @XmlAttribute(name = "category", required = true)
  protected ListCA category;

  @XmlAttribute(name = "resource")
  protected ListNR resource;

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
   * @return a {@link ListCA} instance
   * @since 3.1.0
   */
  public ListCA getCategory() {
    return category;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListCA} instance
   * @since 3.1.0
   */
  public void setCategory(ListCA value) {
    this.category = value;
  }

  public boolean isSetCategory() {
    return (this.category != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListNR} instance
   * @since 3.1.0
   */
  public ListNR getResource() {
    return resource;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListNR} instance
   * @since 3.1.0
   */
  public void setResource(ListNR value) {
    this.resource = value;
  }

  public boolean isSetResource() {
    return (this.resource != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AsgnType object instance
   * @since 3.1.0
   */
  public AsgnType withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListCA}
   * @return The current AsgnType object instance
   * @since 3.1.0
   */
  public AsgnType withCategory(ListCA value) {
    setCategory(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListNR}
   * @return The current AsgnType object instance
   * @since 3.1.0
   */
  public AsgnType withResource(ListNR value) {
    setResource(value);
    return this;
  }

  /**
   * Get a string representation of this AsgnType instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AsgnType {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnType} requires {@link null category}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCategory();
  }

}
