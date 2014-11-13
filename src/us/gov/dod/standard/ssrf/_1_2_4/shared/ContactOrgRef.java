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
import us.gov.dod.standard.ssrf._1_2_4.ceoi.BSMPlan;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListCR;

/**
 * ContactOrgRef
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TContactOrgRef", propOrder = {
  "contactRef",
  "organisationRef",
  "feRef"
})
@XmlSeeAlso({
  BSMPlan.ExternalSys.class
})
public class ContactOrgRef {

  @XmlElement(name = "ContactRef")
  protected ElmRef contactRef;

  @XmlElement(name = "OrganisationRef")
  protected ElmRef organisationRef;

  @XmlElement(name = "FERef")
  protected ElmRef feRef;
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

  @XmlAttribute(name = "type", required = true)
  protected ListCR type;

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getContactRef() {
    return contactRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setContactRef(ElmRef value) {
    this.contactRef = value;
  }

  public boolean isSetContactRef() {
    return (this.contactRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getOrganisationRef() {
    return organisationRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setOrganisationRef(ElmRef value) {
    this.organisationRef = value;
  }

  public boolean isSetOrganisationRef() {
    return (this.organisationRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getFERef() {
    return feRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setFERef(ElmRef value) {
    this.feRef = value;
  }

  public boolean isSetFERef() {
    return (this.feRef != null);
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
   * @return a {@link ListCR} instance
   * @since 3.1.0
   */
  public ListCR getType() {
    return type;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListCR} instance
   * @since 3.1.0
   */
  public void setType(ListCR value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current ContactOrgRef object instance
   * @since 3.1.0
   */
  public ContactOrgRef withContactRef(ElmRef value) {
    setContactRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current ContactOrgRef object instance
   * @since 3.1.0
   */
  public ContactOrgRef withOrganisationRef(ElmRef value) {
    setOrganisationRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current ContactOrgRef object instance
   * @since 3.1.0
   */
  public ContactOrgRef withFERef(ElmRef value) {
    setFERef(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ContactOrgRef object instance
   * @since 3.1.0
   */
  public ContactOrgRef withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListCR}
   * @return The current ContactOrgRef object instance
   * @since 3.1.0
   */
  public ContactOrgRef withType(ListCR value) {
    setType(value);
    return this;
  }

  /**
   * Get a string representation of this ContactOrgRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ContactOrgRef {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ContactOrgRef} requires {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

}
