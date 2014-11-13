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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Pulse contains the pulse characteristics for equipments using a pulsed
 * emission. It includes the parameters of the pulse time cycle and the pulse
 * shape.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Pulse&gt;
 *   &lt;PRRMin cls="U"&gt;300&lt;/PRRMin&gt;
 *   &lt;PDMin cls="U"&gt;12&lt;/PDMin&gt;
 *   &lt;DutyCycleMax cls="U"&gt;50&lt;/DutyCycleMax&gt;
 *   &lt;AvgPowerMin cls="U"&gt;20&lt;/AvgPowerMin&gt;
 * &lt;/Pulse&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPulse", propOrder = {
  "pulseComp",
  "pulseForm",
  "pulseAvgCycle"
})
public class Pulse {

  @XmlElement(name = "PulseComp")
  protected PulseComp pulseComp;

  @XmlElement(name = "PulseForm")
  protected PulseForm pulseForm;

  @XmlElement(name = "PulseAvgCycle")
  protected PulseAvgCycle pulseAvgCycle;
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

  @XmlAttribute(name = "minPRR")
  protected BigDecimal minPRR;

  @XmlAttribute(name = "maxPRR")
  protected BigDecimal maxPRR;

  @XmlAttribute(name = "minPD")
  protected BigDecimal minPD;

  @XmlAttribute(name = "maxPD")
  protected BigDecimal maxPD;

  /**
   * Get
   * <p>
   * @return a {@link PulseComp} instance
   * @since 3.1.0
   */
  public PulseComp getPulseComp() {
    return pulseComp;
  }

  /**
   * Set
   * <p>
   * @param value a {@link PulseComp} instance
   * @since 3.1.0
   */
  public void setPulseComp(PulseComp value) {
    this.pulseComp = value;
  }

  public boolean isSetPulseComp() {
    return (this.pulseComp != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link PulseForm} instance
   * @since 3.1.0
   */
  public PulseForm getPulseForm() {
    return pulseForm;
  }

  /**
   * Set
   * <p>
   * @param value a {@link PulseForm} instance
   * @since 3.1.0
   */
  public void setPulseForm(PulseForm value) {
    this.pulseForm = value;
  }

  public boolean isSetPulseForm() {
    return (this.pulseForm != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link PulseAvgCycle} instance
   * @since 3.1.0
   */
  public PulseAvgCycle getPulseAvgCycle() {
    return pulseAvgCycle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link PulseAvgCycle} instance
   * @since 3.1.0
   */
  public void setPulseAvgCycle(PulseAvgCycle value) {
    this.pulseAvgCycle = value;
  }

  public boolean isSetPulseAvgCycle() {
    return (this.pulseAvgCycle != null);
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
  public BigDecimal getMinPRR() {
    return minPRR;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinPRR(BigDecimal value) {
    this.minPRR = value;
  }

  public boolean isSetMinPRR() {
    return (this.minPRR != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxPRR() {
    return maxPRR;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxPRR(BigDecimal value) {
    this.maxPRR = value;
  }

  public boolean isSetMaxPRR() {
    return (this.maxPRR != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinPD() {
    return minPD;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinPD(BigDecimal value) {
    this.minPD = value;
  }

  public boolean isSetMinPD() {
    return (this.minPD != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxPD() {
    return maxPD;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxPD(BigDecimal value) {
    this.maxPD = value;
  }

  public boolean isSetMaxPD() {
    return (this.maxPD != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link PulseComp}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPulseComp(PulseComp value) {
    setPulseComp(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link PulseForm}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPulseForm(PulseForm value) {
    setPulseForm(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link PulseAvgCycle}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withPulseAvgCycle(PulseAvgCycle value) {
    setPulseAvgCycle(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withMinPRR(BigDecimal value) {
    setMinPRR(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withMaxPRR(BigDecimal value) {
    setMaxPRR(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withMinPD(BigDecimal value) {
    setMinPD(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Pulse object instance
   * @since 3.1.0
   */
  public Pulse withMaxPD(BigDecimal value) {
    setMaxPD(value);
    return this;
  }

  /**
   * Get a string representation of this Pulse instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Pulse {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Pulse} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
