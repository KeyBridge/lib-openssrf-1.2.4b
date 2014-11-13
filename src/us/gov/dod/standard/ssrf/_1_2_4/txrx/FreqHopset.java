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

import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * FreqHopset
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFreqHopset", propOrder = {
  "freqSingle",
  "freqRange",
  "hopRate"
})
public class FreqHopset {

  @XmlElement(name = "FreqSingle")
  protected List<FreqSingle> freqSingle;

  @XmlElement(name = "FreqRange")
  protected List<FreqRange> freqRange;

  @XmlElement(name = "HopRate")
  protected List<HopRate> hopRate;
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

  @XmlAttribute(name = "numFreq")
  protected BigInteger numFreq;

  @XmlAttribute(name = "freqBlocking")
  protected String freqBlocking;

  @XmlAttribute(name = "hopChnlInterleave")
  protected BigInteger hopChnlInterleave;

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
   * Get
   * <p>
   * @return a {@link HopRate} instance
   * @since 3.1.0
   */
  public List<HopRate> getHopRate() {
    if (hopRate == null) {
      hopRate = new ArrayList<>();
    }
    return this.hopRate;
  }

  public boolean isSetHopRate() {
    return ((this.hopRate != null) && (!this.hopRate.isEmpty()));
  }

  /**
   * Clear the HopRate field. This sets the field to null.
   */
  public void unsetHopRate() {
    this.hopRate = null;
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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFreqBlocking() {
    return freqBlocking;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFreqBlocking(String value) {
    this.freqBlocking = value;
  }

  public boolean isSetFreqBlocking() {
    return (this.freqBlocking != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getHopChnlInterleave() {
    return hopChnlInterleave;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setHopChnlInterleave(BigInteger value) {
    this.hopChnlInterleave = value;
  }

  public boolean isSetHopChnlInterleave() {
    return (this.hopChnlInterleave != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqRange...}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withFreqRange(FreqRange... values) {
    if (values != null) {
      getFreqRange().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqRange} instances
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withFreqRange(Collection<FreqRange> values) {
    if (values != null) {
      getFreqRange().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link HopRate...}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withHopRate(HopRate... values) {
    if (values != null) {
      getHopRate().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link HopRate} instances
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withHopRate(Collection<HopRate> values) {
    if (values != null) {
      getHopRate().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withNumFreq(BigInteger value) {
    setNumFreq(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withFreqBlocking(String value) {
    setFreqBlocking(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current FreqHopset object instance
   * @since 3.1.0
   */
  public FreqHopset withHopChnlInterleave(BigInteger value) {
    setHopChnlInterleave(value);
    return this;
  }

  /**
   * Get a string representation of this FreqHopset instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqHopset {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqHopset} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
