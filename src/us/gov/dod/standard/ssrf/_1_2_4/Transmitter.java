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
package us.gov.dod.standard.ssrf._1_2_4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;
import us.gov.dod.standard.ssrf._1_2_4.shared.Nomenclature;
import us.gov.dod.standard.ssrf._1_2_4.shared.StockNum;
import us.gov.dod.standard.ssrf._1_2_4.txrx.*;

/**
 * Transmitter is the root element (dataset) containing the transmitter
 * characteristics.
 * <p>
 * Sub-Elements are
 * {@link Curve}, {@link Deployment}, {@link Nomenclature}, {@link POCInformation}, {@link TxMode}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Transmitter cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::TX:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
 *   &lt;Nomenclature&gt;
 *     &lt;Name cls="U"&gt;AN/PRC-113&lt;/Name&gt;
 *   &lt;/Nomenclature&gt;
 *   &lt;TxMode&gt;
 *     &lt;ModeID cls="U"&gt;HIGH POWER VOICE&lt;/ModeID&gt;
 *     &lt;OccBw cls="U"&gt;0.025&lt;/OccBw&gt;
 *     &lt;EmsClass cls="U"&gt;F3E&lt;/EmsClass&gt;
 *     &lt;Power&gt;
 *       &lt;PowerMax cls="U"&gt;10&lt;/PowerMax&gt;
 *     &lt;/Power&gt;
 *   &lt;/TxMode&gt;
 * &lt;/Transmitter&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTransmitter", propOrder = {
  "nomenclature",
  "stockNum",
  "signalTuning",
  "curve",
  "freqTolerance",
  "outputDevice",
  "filter"
})
public class Transmitter {

  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature")
  protected List<Nomenclature> nomenclature;

  @XmlElement(name = "StockNum")
  protected List<StockNum> stockNum;

  @XmlElement(name = "SignalTuning")
  protected List<SignalTuning> signalTuning;
  /**
   * Curve (Optional)
   * <p>
   * Curve defines the type of curve. It contains an indication as to whether
   * the values were measured or calculated, the numeric factor to be applied to
   * the carrier frequency to find the abscissa of the curve, a frequency to be
   * added to the carrier frequency to obtain the origin of the curve, and the
   * measurement bandwidth.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Curve")
  protected List<Curve> curve;

  @XmlElement(name = "FreqTolerance")
  protected ClassFreq freqTolerance;
  /**
   * OutputDevice - Output Device Name (Optional)
   * <p>
   * The name of the output device. The specific device designation should be
   * provided, for example, VARIAN VTS5751A1.
   * <p>
   * Format is S40
   * <p>
   * Attribute group Output (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OutputDevice")
  protected OutputDevice outputDevice;
  /**
   * Filter - Filter Type Description (Optional)
   * <p>
   * A brief description of the type of the output filter.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Filter")
  protected Memo filter;
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
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link StockNum} instance
   * @since 3.1.0
   */
  public List<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new ArrayList<>();
    }
    return this.stockNum;
  }

  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  /**
   * Clear the StockNum field. This sets the field to null.
   */
  public void unsetStockNum() {
    this.stockNum = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SignalTuning} instance
   * @since 3.1.0
   */
  public List<SignalTuning> getSignalTuning() {
    if (signalTuning == null) {
      signalTuning = new ArrayList<>();
    }
    return this.signalTuning;
  }

  public boolean isSetSignalTuning() {
    return ((this.signalTuning != null) && (!this.signalTuning.isEmpty()));
  }

  /**
   * Clear the SignalTuning field. This sets the field to null.
   */
  public void unsetSignalTuning() {
    this.signalTuning = null;
  }

  /**
   * Get the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @return a {@link Curve} instance
   * @since 3.1.0
   */
  public List<Curve> getCurve() {
    if (curve == null) {
      curve = new ArrayList<>();
    }
    return this.curve;
  }

  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  /**
   * Clear the Curve field. This sets the field to null.
   */
  public void unsetCurve() {
    this.curve = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public ClassFreq getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public void setFreqTolerance(ClassFreq value) {
    this.freqTolerance = value;
  }

  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null);
  }

  /**
   * Get the name of the output device. The specific device designation should
   * be provided, for example, VARIAN VTS5751A1.
   * <p>
   * @return a {@link OutputDevice} instance
   * @since 3.1.0
   */
  public OutputDevice getOutputDevice() {
    return outputDevice;
  }

  /**
   * Set the name of the output device. The specific device designation should
   * be provided, for example, VARIAN VTS5751A1.
   * <p>
   * @param value a {@link OutputDevice} instance
   * @since 3.1.0
   */
  public void setOutputDevice(OutputDevice value) {
    this.outputDevice = value;
  }

  public boolean isSetOutputDevice() {
    return (this.outputDevice != null);
  }

  /**
   * Get a brief description of the type of the output filter.
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getFilter() {
    return filter;
  }

  /**
   * Set a brief description of the type of the output filter.
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setFilter(Memo value) {
    this.filter = value;
  }

  public boolean isSetFilter() {
    return (this.filter != null);
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
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link StockNum...}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClassFreq}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withFreqTolerance(ClassFreq value) {
    setFreqTolerance(value);
    return this;
  }

  /**
   * Set the name of the output device. The specific device designation should
   * be provided, for example, VARIAN VTS5751A1.
   * <p>
   * @param value An instances of type {@link OutputDevice}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withOutputDevice(OutputDevice value) {
    setOutputDevice(value);
    return this;
  }

  /**
   * Set a brief description of the type of the output filter.
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withFilter(Memo value) {
    setFilter(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Transmitter object instance
   * @since 3.1.0
   */
  public Transmitter withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this Transmitter instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Transmitter {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Transmitter} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
