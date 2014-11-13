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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tuning indicates the specific frequency or range of frequencies, tuning
 * increment, and number of frequencies, required for an assignment.
 * <p>
 * Element of {@link Link}
 * <p>
 * Sub-Element is {@link RequestedFreq}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTuning", propOrder = {
  "freqSep",
  "freqSingle",
  "freqRange"
})
public class Tuning {

  /**
   * FreqSep - Frequency Separation (Optional)
   * <p>
   * The required minimum or exact frequency separation.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqSep (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqSep")
  protected FreqSep freqSep;

  @XmlElement(name = "FreqSingle")
  protected List<FreqSingle> freqSingle;

  @XmlElement(name = "FreqRange")
  protected List<FreqRange> freqRange;
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
   * TuningStep - Tuning Step (Required)
   * <p>
   * The tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "tuningStep", required = true)
  protected BigDecimal tuningStep;
  /**
   * NumFreq - Number of Frequencies (Required)
   * <p>
   * The number of frequencies required.
   * <p>
   * Format is UN(4)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "numFreq", required = true)
  protected BigInteger numFreq;
  /**
   * Priority - Priority (Optional)
   * <p>
   * A number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * Format is UN(1)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "priority")
  protected BigInteger priority;
  /**
   * Exclusive - Exclusive Assignment (Optional)
   * <p>
   * Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "exclusive")
  protected String exclusive;

  /**
   * Get the required minimum or exact frequency separation.
   * <p>
   * @return a {@link FreqSep} instance
   * @since 3.1.0
   */
  public FreqSep getFreqSep() {
    return freqSep;
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value a {@link FreqSep} instance
   * @since 3.1.0
   */
  public void setFreqSep(FreqSep value) {
    this.freqSep = value;
  }

  public boolean isSetFreqSep() {
    return (this.freqSep != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public List<FreqSingle> getFreqSingle() {
    if (freqSingle == null) {
      freqSingle = new ArrayList<>();
    }
    return this.freqSingle;
  }

  public boolean isSetFreqSingle() {
    return ((this.freqSingle != null) && (!this.freqSingle.isEmpty()));
  }

  /**
   * Clear the FreqSingle field. This sets the field to null.
   */
  public void unsetFreqSingle() {
    this.freqSingle = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public List<FreqRange> getFreqRange() {
    if (freqRange == null) {
      freqRange = new ArrayList<>();
    }
    return this.freqRange;
  }

  public boolean isSetFreqRange() {
    return ((this.freqRange != null) && (!this.freqRange.isEmpty()));
  }

  /**
   * Clear the FreqRange field. This sets the field to null.
   */
  public void unsetFreqRange() {
    this.freqRange = null;
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
   * Get the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setTuningStep(BigDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Get the number of frequencies required.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumFreq(BigInteger value) {
    this.numFreq = value;
  }

  public boolean isSetNumFreq() {
    return (this.numFreq != null);
  }

  /**
   * Get a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getPriority() {
    return priority;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setPriority(BigInteger value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  /**
   * Get Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExclusive() {
    return exclusive;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExclusive(String value) {
    this.exclusive = value;
  }

  public boolean isSetExclusive() {
    return (this.exclusive != null);
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value An instances of type {@link FreqSep}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqSep(FreqSep value) {
    setFreqSep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqRange...}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqRange(FreqRange... values) {
    if (values != null) {
      getFreqRange().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqRange} instances
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withFreqRange(Collection<FreqRange> values) {
    if (values != null) {
      getFreqRange().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withTuningStep(BigDecimal value) {
    setTuningStep(value);
    return this;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withNumFreq(BigInteger value) {
    setNumFreq(value);
    return this;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withPriority(BigInteger value) {
    setPriority(value);
    return this;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Tuning object instance
   * @since 3.1.0
   */
  public Tuning withExclusive(String value) {
    setExclusive(value);
    return this;
  }

  /**
   * Get a string representation of this Tuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Tuning {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Tuning} requires {@link null numFreq}, {@link null tuningStep}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumFreq() && isSetTuningStep();
  }

}
