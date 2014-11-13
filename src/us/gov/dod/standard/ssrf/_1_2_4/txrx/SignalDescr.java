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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * SignalDescr
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSignalDescr", propOrder = {
  "title",
  "signalTuning",
  "freqTolerance",
  "eqpFnct",
  "txRxMode",
  "signalTx",
  "signalRx"
})
public class SignalDescr extends Common<SignalDescr> {

  @XmlElement(name = "Title", required = true)
  protected Title title;

  @XmlElement(name = "SignalTuning")
  protected List<SignalTuning> signalTuning;

  @XmlElement(name = "FreqTolerance")
  protected ClassFreq freqTolerance;

  @XmlElement(name = "EqpFnct")
  protected List<EqpFnct> eqpFnct;

  @XmlElement(name = "TxRxMode", required = true)
  protected List<TxRxMode> txRxMode;

  @XmlElement(name = "SignalTx")
  protected SignalTx signalTx;

  @XmlElement(name = "SignalRx")
  protected SignalRx signalRx;

  /**
   * Get
   * <p>
   * @return the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public Title getTitle() {
    return title;
  }

  /**
   * Set
   * <p>
   * @param value the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public void setTitle(Title value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
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
   * Get
   * <p>
   * @return a {@link EqpFnct} instance
   * @since 3.1.0
   */
  public List<EqpFnct> getEqpFnct() {
    if (eqpFnct == null) {
      eqpFnct = new ArrayList<>();
    }
    return this.eqpFnct;
  }

  public boolean isSetEqpFnct() {
    return ((this.eqpFnct != null) && (!this.eqpFnct.isEmpty()));
  }

  /**
   * Clear the EqpFnct field. This sets the field to null.
   */
  public void unsetEqpFnct() {
    this.eqpFnct = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link TxRxMode} instance
   * @since 3.1.0
   */
  public List<TxRxMode> getTxRxMode() {
    if (txRxMode == null) {
      txRxMode = new ArrayList<>();
    }
    return this.txRxMode;
  }

  public boolean isSetTxRxMode() {
    return ((this.txRxMode != null) && (!this.txRxMode.isEmpty()));
  }

  /**
   * Clear the TxRxMode field. This sets the field to null.
   */
  public void unsetTxRxMode() {
    this.txRxMode = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SignalTx} instance
   * @since 3.1.0
   */
  public SignalTx getSignalTx() {
    return signalTx;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SignalTx} instance
   * @since 3.1.0
   */
  public void setSignalTx(SignalTx value) {
    this.signalTx = value;
  }

  public boolean isSetSignalTx() {
    return (this.signalTx != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SignalRx} instance
   * @since 3.1.0
   */
  public SignalRx getSignalRx() {
    return signalRx;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SignalRx} instance
   * @since 3.1.0
   */
  public void setSignalRx(SignalRx value) {
    this.signalRx = value;
  }

  public boolean isSetSignalRx() {
    return (this.signalRx != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClassFreq}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withFreqTolerance(ClassFreq value) {
    setFreqTolerance(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link EqpFnct...}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withEqpFnct(EqpFnct... values) {
    if (values != null) {
      getEqpFnct().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EqpFnct} instances
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withEqpFnct(Collection<EqpFnct> values) {
    if (values != null) {
      getEqpFnct().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TxRxMode...}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withTxRxMode(TxRxMode... values) {
    if (values != null) {
      getTxRxMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TxRxMode} instances
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withTxRxMode(Collection<TxRxMode> values) {
    if (values != null) {
      getTxRxMode().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SignalTx}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withSignalTx(SignalTx value) {
    setSignalTx(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SignalRx}
   * @return The current SignalDescr object instance
   * @since 3.1.0
   */
  public SignalDescr withSignalRx(SignalRx value) {
    setSignalRx(value);
    return this;
  }

  /**
   * Get a string representation of this SignalDescr instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SignalDescr {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SignalDescr} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null Title}, {@link null TxRxMode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetTitle() && isSetTxRxMode();
  }

}
