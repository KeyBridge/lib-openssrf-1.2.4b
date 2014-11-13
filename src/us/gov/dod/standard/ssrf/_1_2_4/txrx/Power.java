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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Power identifies the transmitter RF power at the transmitter antenna port.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Power&gt;
 *   &lt;PowerMin cls="U"&gt;-3&lt;/PowerMin&gt;
 *   &lt;PowerMax cls="U"&gt;31.8&lt;/PowerMax&gt;
 *   &lt;PowerType cls="U"&gt;PEP&lt;/PowerType&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 * &lt;/Power&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPower")
public class Power {

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

  @XmlAttribute(name = "minPower", required = true)
  protected BigDecimal minPower;

  @XmlAttribute(name = "maxPower")
  protected BigDecimal maxPower;
  /**
   * PowerType - Power Type (Optional)
   * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "powerType")
  protected String powerType;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * "Yes" if the power value(s) have been calculated, or "No" if they have been
   * measured.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "calc", required = true)
  protected String calc;

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
  public BigDecimal getMinPower() {
    return minPower;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinPower(BigDecimal value) {
    this.minPower = value;
  }

  public boolean isSetMinPower() {
    return (this.minPower != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxPower() {
    return maxPower;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxPower(BigDecimal value) {
    this.maxPower = value;
  }

  public boolean isSetMaxPower() {
    return (this.maxPower != null);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPowerType(String value) {
    this.powerType = value;
  }

  public boolean isSetPowerType() {
    return (this.powerType != null);
  }

  /**
   * Get "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCalc() {
    return calc;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCalc(String value) {
    this.calc = value;
  }

  public boolean isSetCalc() {
    return (this.calc != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withMinPower(BigDecimal value) {
    setMinPower(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withMaxPower(BigDecimal value) {
    setMaxPower(value);
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withPowerType(String value) {
    setPowerType(value);
    return this;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Power object instance
   * @since 3.1.0
   */
  public Power withCalc(String value) {
    setCalc(value);
    return this;
  }

  /**
   * Get a string representation of this Power instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Power {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Power} requires {@link null calc}, {@link null minPower}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCalc() && isSetMinPower();
  }

}
