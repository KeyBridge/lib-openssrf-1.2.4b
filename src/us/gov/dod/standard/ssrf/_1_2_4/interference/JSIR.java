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
package us.gov.dod.standard.ssrf._1_2_4.interference;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * JSIR
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TJSIR", propOrder = {
  "intfFEDeploymentRef"
})
public class JSIR {

  @XmlElement(name = "IntfFEDeploymentRef", required = true)
  protected List<JSIR.IntfFEDeploymentRef> intfFEDeploymentRef;
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

  @XmlAttribute(name = "reported", required = true)
  protected String reported;

  public List<JSIR.IntfFEDeploymentRef> getIntfFEDeploymentRef() {
    if (intfFEDeploymentRef == null) {
      intfFEDeploymentRef = new ArrayList<>();
    }
    return this.intfFEDeploymentRef;
  }

  public boolean isSetIntfFEDeploymentRef() {
    return ((this.intfFEDeploymentRef != null) && (!this.intfFEDeploymentRef.isEmpty()));
  }

  /**
   * Clear the IntfFEDeploymentRef field. This sets the field to null.
   */
  public void unsetIntfFEDeploymentRef() {
    this.intfFEDeploymentRef = null;
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
  public String getReported() {
    return reported;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setReported(String value) {
    this.reported = value;
  }

  public boolean isSetReported() {
    return (this.reported != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link JSIR.IntfFEDeploymentRef...}
   * @return The current JSIR object instance
   * @since 3.1.0
   */
  public JSIR withIntfFEDeploymentRef(JSIR.IntfFEDeploymentRef... values) {
    if (values != null) {
      getIntfFEDeploymentRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link IntfFEDeploymentRef} instances
   * @return The current JSIR object instance
   * @since 3.1.0
   */
  public JSIR withIntfFEDeploymentRef(Collection<JSIR.IntfFEDeploymentRef> values) {
    if (values != null) {
      getIntfFEDeploymentRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JSIR object instance
   * @since 3.1.0
   */
  public JSIR withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JSIR object instance
   * @since 3.1.0
   */
  public JSIR withReported(String value) {
    setReported(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class IntfFEDeploymentRef {

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

    @XmlAttribute(name = "type", required = true)
    protected String type;

    @XmlAttribute(name = "serial", required = true)
    protected String serial;

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

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getType() {
      return type;
    }

    /**
     * Set
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
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getSerial() {
      return serial;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setSerial(String value) {
      this.serial = value;
    }

    public boolean isSetSerial() {
      return (this.serial != null);
    }

    public JSIR.IntfFEDeploymentRef withCls(String value) {
      setCls(value);
      return this;
    }

    public JSIR.IntfFEDeploymentRef withType(String value) {
      setType(value);
      return this;
    }

    public JSIR.IntfFEDeploymentRef withSerial(String value) {
      setSerial(value);
      return this;
    }

  }

  /**
   * Get a string representation of this JSIR instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JSIR {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JSIR} requires
   * {@link null IntfFEDeploymentRef}, {@link null reported}, {@link null serial}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIntfFEDeploymentRef() && isSetReported();
  }

}
