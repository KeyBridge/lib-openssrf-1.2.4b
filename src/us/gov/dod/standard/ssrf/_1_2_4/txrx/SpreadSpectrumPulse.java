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
 * SpreadSpectrumPulse
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSpreadSpectrumPulse")
public class SpreadSpectrumPulse {

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

  @XmlAttribute(name = "freqDeviationRise")
  protected BigDecimal freqDeviationRise;

  @XmlAttribute(name = "freqDeviationFall")
  protected BigDecimal freqDeviationFall;

  @XmlAttribute(name = "minWidth")
  protected BigDecimal minWidth;

  @XmlAttribute(name = "maxWidth")
  protected BigDecimal maxWidth;

  @XmlAttribute(name = "chirpRate")
  protected BigDecimal chirpRate;

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
  public BigDecimal getFreqDeviationRise() {
    return freqDeviationRise;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setFreqDeviationRise(BigDecimal value) {
    this.freqDeviationRise = value;
  }

  public boolean isSetFreqDeviationRise() {
    return (this.freqDeviationRise != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getFreqDeviationFall() {
    return freqDeviationFall;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setFreqDeviationFall(BigDecimal value) {
    this.freqDeviationFall = value;
  }

  public boolean isSetFreqDeviationFall() {
    return (this.freqDeviationFall != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinWidth() {
    return minWidth;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinWidth(BigDecimal value) {
    this.minWidth = value;
  }

  public boolean isSetMinWidth() {
    return (this.minWidth != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxWidth() {
    return maxWidth;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxWidth(BigDecimal value) {
    this.maxWidth = value;
  }

  public boolean isSetMaxWidth() {
    return (this.maxWidth != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getChirpRate() {
    return chirpRate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setChirpRate(BigDecimal value) {
    this.chirpRate = value;
  }

  public boolean isSetChirpRate() {
    return (this.chirpRate != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withFreqDeviationRise(BigDecimal value) {
    setFreqDeviationRise(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withFreqDeviationFall(BigDecimal value) {
    setFreqDeviationFall(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withMinWidth(BigDecimal value) {
    setMinWidth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withMaxWidth(BigDecimal value) {
    setMaxWidth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrumPulse object instance
   * @since 3.1.0
   */
  public SpreadSpectrumPulse withChirpRate(BigDecimal value) {
    setChirpRate(value);
    return this;
  }

  /**
   * Get a string representation of this SpreadSpectrumPulse instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SpreadSpectrumPulse {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SpreadSpectrumPulse} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
