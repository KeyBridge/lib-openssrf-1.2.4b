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
package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Deployment provides the general type of equipment deployment. For the
 * detailed data, the appropriate force element and platforms elements should be
 * referenced. Data element Deployment identifies the general category of how
 * the equipment is deployed. For example an equipment may be deployed on an
 * airborne platform, a ship or fixed land installation.
 * <p>
 * Element of {@link RFSystem}, {@link Receiver}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link Installation}
 * <p>
 * Example:
 * <pre>
 * &lt;Deployment&gt;
 *   &lt;Type cls="U"&gt;Air&lt;/Type&gt;
 * &lt;/Deployment&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDeployment", propOrder = {
  "installation"
})
public class Deployment {

  /**
   * Installation (Optional)
   * <p>
   * Installation identifies the specific platforms on which an equipment is
   * installed, whether it is mounted at a fixed site atop a mountain, in a
   * shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Installation")
  protected List<Deployment.Installation> installation;
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
   * Type - Deployment Type (Required)
   * <p>
   * The type of deployment.
   * <p>
   * Format is L:CFD
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type", required = true)
  protected String type;

  public List<Deployment.Installation> getInstallation() {
    if (installation == null) {
      installation = new ArrayList<>();
    }
    return this.installation;
  }

  public boolean isSetInstallation() {
    return ((this.installation != null) && (!this.installation.isEmpty()));
  }

  /**
   * Clear the Installation field. This sets the field to null.
   */
  public void unsetInstallation() {
    this.installation = null;
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
   * Get the type of deployment.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Set the Installation
   * <p>
   * Complex element Installation identifies the specific platforms on which an
   * equipment is installed, whether it is mounted at a fixed site atop a
   * mountain, in a shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @param values One or more instances of type
   *               {@link Deployment.Installation...}
   * @return The current Deployment object instance
   * @since 3.1.0
   */
  public Deployment withInstallation(Deployment.Installation... values) {
    if (values != null) {
      getInstallation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Installation
   * <p>
   * Complex element Installation identifies the specific platforms on which an
   * equipment is installed, whether it is mounted at a fixed site atop a
   * mountain, in a shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @param values A collection of {@link Installation} instances
   * @return The current Deployment object instance
   * @since 3.1.0
   */
  public Deployment withInstallation(Collection<Deployment.Installation> values) {
    if (values != null) {
      getInstallation().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Deployment object instance
   * @since 3.1.0
   */
  public Deployment withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Deployment object instance
   * @since 3.1.0
   */
  public Deployment withType(String value) {
    setType(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class Installation {

    @XmlValue
    protected String value;
    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;

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
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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

    public Deployment.Installation withValue(String value) {
      setValue(value);
      return this;
    }

    public Deployment.Installation withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Deployment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Deployment {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Deployment} requires {@link null type}.
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
