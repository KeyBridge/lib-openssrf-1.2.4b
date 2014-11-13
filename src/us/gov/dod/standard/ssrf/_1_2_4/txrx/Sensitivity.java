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

import java.math.BigDecimal;
import javax.xml.bind.annotation.*;

/**
 * Sensitivity
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSensitivity", propOrder = {
  "sensitivityCriterion"
})
public class Sensitivity {

  @XmlElement(name = "SensitivityCriterion")
  protected Sensitivity.SensitivityCriterion sensitivityCriterion;
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

  @XmlAttribute(name = "level")
  protected BigDecimal level;

  @XmlAttribute(name = "noiseFigure")
  protected BigDecimal noiseFigure;

  @XmlAttribute(name = "noiseTemp")
  protected BigDecimal noiseTemp;

  public Sensitivity.SensitivityCriterion getSensitivityCriterion() {
    return sensitivityCriterion;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Sensitivity} instance
   * @since 3.1.0
   */
  public void setSensitivityCriterion(Sensitivity.SensitivityCriterion value) {
    this.sensitivityCriterion = value;
  }

  public boolean isSetSensitivityCriterion() {
    return (this.sensitivityCriterion != null);
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
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getLevel() {
    return level;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setLevel(BigDecimal value) {
    this.level = value;
  }

  public boolean isSetLevel() {
    return (this.level != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getNoiseFigure() {
    return noiseFigure;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setNoiseFigure(BigDecimal value) {
    this.noiseFigure = value;
  }

  public boolean isSetNoiseFigure() {
    return (this.noiseFigure != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getNoiseTemp() {
    return noiseTemp;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setNoiseTemp(BigDecimal value) {
    this.noiseTemp = value;
  }

  public boolean isSetNoiseTemp() {
    return (this.noiseTemp != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Sensitivity.SensitivityCriterion}
   * @return The current Sensitivity object instance
   * @since 3.1.0
   */
  public Sensitivity withSensitivityCriterion(Sensitivity.SensitivityCriterion value) {
    setSensitivityCriterion(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Sensitivity object instance
   * @since 3.1.0
   */
  public Sensitivity withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Sensitivity object instance
   * @since 3.1.0
   */
  public Sensitivity withLevel(BigDecimal value) {
    setLevel(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Sensitivity object instance
   * @since 3.1.0
   */
  public Sensitivity withNoiseFigure(BigDecimal value) {
    setNoiseFigure(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Sensitivity object instance
   * @since 3.1.0
   */
  public Sensitivity withNoiseTemp(BigDecimal value) {
    setNoiseTemp(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class SensitivityCriterion {

    @XmlValue
    protected float value;
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

    /**
     * Get a value that is most probably correct.
     * <p>
     * @return a {@link float} instance
     * @since 3.1.0
     */
    public float getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link float} instance
     * @since 3.1.0
     */
    public void setValue(float value) {
      this.value = value;
    }

    public boolean isSetValue() {
      return true;
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

    public Sensitivity.SensitivityCriterion withValue(float value) {
      setValue(value);
      return this;
    }

    public Sensitivity.SensitivityCriterion withCls(String value) {
      setCls(value);
      return this;
    }

    public Sensitivity.SensitivityCriterion withType(String value) {
      setType(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Sensitivity instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Sensitivity {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Sensitivity} requires {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
//    return isSetType();
    return true;
  }

}
