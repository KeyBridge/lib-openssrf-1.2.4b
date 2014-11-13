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
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * DigitalFormat
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDigitalFormat")
public class DigitalFormat {

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

  @XmlAttribute(name = "numStates")
  protected BigInteger numStates;

  @XmlAttribute(name = "pulseFormat")
  protected String pulseFormat;

  @XmlAttribute(name = "codeGain")
  protected BigDecimal codeGain;

  @XmlAttribute(name = "codeRate")
  protected BigDecimal codeRate;

  @XmlAttribute(name = "codePeriod")
  protected BigDecimal codePeriod;

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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumStates() {
    return numStates;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumStates(BigInteger value) {
    this.numStates = value;
  }

  public boolean isSetNumStates() {
    return (this.numStates != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPulseFormat() {
    return pulseFormat;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPulseFormat(String value) {
    this.pulseFormat = value;
  }

  public boolean isSetPulseFormat() {
    return (this.pulseFormat != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getCodeGain() {
    return codeGain;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setCodeGain(BigDecimal value) {
    this.codeGain = value;
  }

  public boolean isSetCodeGain() {
    return (this.codeGain != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getCodeRate() {
    return codeRate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setCodeRate(BigDecimal value) {
    this.codeRate = value;
  }

  public boolean isSetCodeRate() {
    return (this.codeRate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getCodePeriod() {
    return codePeriod;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setCodePeriod(BigDecimal value) {
    this.codePeriod = value;
  }

  public boolean isSetCodePeriod() {
    return (this.codePeriod != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withNumStates(BigInteger value) {
    setNumStates(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withPulseFormat(String value) {
    setPulseFormat(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withCodeGain(BigDecimal value) {
    setCodeGain(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withCodeRate(BigDecimal value) {
    setCodeRate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current DigitalFormat object instance
   * @since 3.1.0
   */
  public DigitalFormat withCodePeriod(BigDecimal value) {
    setCodePeriod(value);
    return this;
  }

  /**
   * Get a string representation of this DigitalFormat instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DigitalFormat {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DigitalFormat} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
