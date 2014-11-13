package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.Receiver;
import us.gov.dod.standard.ssrf._1_2_4.Transmitter;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAU;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * TxRx
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTxRx", propOrder = {
  "nomenclature",
  "stockNum",
  "deployment",
  "emergency",
  "willReplace",
  "signalDescrRef",
  "duplexSep",
  "tspr",
  "elnot",
  "signalTuning",
  "freqTolerance",
  "eqpFnct",
  "txRxMode",
  "transmitter",
  "receiver"
})
public class TxRx extends Common<TxRx> {

  @XmlElement(name = "Nomenclature", required = true)
  protected Set<Nomenclature> nomenclature;

  @XmlElement(name = "StockNum")
  protected Set<StockNum> stockNum;

  @XmlElement(name = "Deployment")
  protected Deployment deployment;

  @XmlElement(name = "Emergency")
  protected Emergency emergency;

  @XmlElement(name = "WillReplace")
  protected Set<WillReplace> willReplace;

  @XmlElement(name = "SignalDescrRef")
  protected Set<ElmRef> signalDescrRef;

  @XmlElement(name = "DuplexSep")
  protected FreqSep duplexSep;

  @XmlElement(name = "TSPR")
  protected NationalMemo tspr;

  @XmlElement(name = "ELNOT")
  protected NationalMemo elnot;

  @XmlElement(name = "SignalTuning")
  protected Set<SignalTuning> signalTuning;

  @XmlElement(name = "FreqTolerance")
  protected ClassFreq freqTolerance;

  @XmlElement(name = "EqpFnct")
  protected Set<EqpFnct> eqpFnct;

  @XmlElement(name = "TxRxMode", required = true)
  protected Set<TxRxMode> txRxMode;

  @XmlElement(name = "Transmitter")
  protected Transmitter transmitter;

  @XmlElement(name = "Receiver")
  protected Receiver receiver;

  @XmlAttribute(name = "eqpType")
  protected ListAU eqpType;

  /**
   * Get
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
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
  public Set<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new HashSet<>();
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
   * @return a {@link Deployment} instance
   * @since 3.1.0
   */
  public Deployment getDeployment() {
    return deployment;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Deployment} instance
   * @since 3.1.0
   */
  public void setDeployment(Deployment value) {
    this.deployment = value;
  }

  public boolean isSetDeployment() {
    return (this.deployment != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Emergency} instance
   * @since 3.1.0
   */
  public Emergency getEmergency() {
    return emergency;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Emergency} instance
   * @since 3.1.0
   */
  public void setEmergency(Emergency value) {
    this.emergency = value;
  }

  public boolean isSetEmergency() {
    return (this.emergency != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link WillReplace} instance
   * @since 3.1.0
   */
  public Set<WillReplace> getWillReplace() {
    if (willReplace == null) {
      willReplace = new HashSet<>();
    }
    return this.willReplace;
  }

  public boolean isSetWillReplace() {
    return ((this.willReplace != null) && (!this.willReplace.isEmpty()));
  }

  /**
   * Clear the WillReplace field. This sets the field to null.
   */
  public void unsetWillReplace() {
    this.willReplace = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getSignalDescrRef() {
    if (signalDescrRef == null) {
      signalDescrRef = new HashSet<>();
    }
    return this.signalDescrRef;
  }

  public boolean isSetSignalDescrRef() {
    return ((this.signalDescrRef != null) && (!this.signalDescrRef.isEmpty()));
  }

  /**
   * Clear the SignalDescrRef field. This sets the field to null.
   */
  public void unsetSignalDescrRef() {
    this.signalDescrRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqSep} instance
   * @since 3.1.0
   */
  public FreqSep getDuplexSep() {
    return duplexSep;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqSep} instance
   * @since 3.1.0
   */
  public void setDuplexSep(FreqSep value) {
    this.duplexSep = value;
  }

  public boolean isSetDuplexSep() {
    return (this.duplexSep != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NationalMemo} instance
   * @since 3.1.0
   */
  public NationalMemo getTSPR() {
    return tspr;
  }

  /**
   * Set
   * <p>
   * @param value a {@link NationalMemo} instance
   * @since 3.1.0
   */
  public void setTSPR(NationalMemo value) {
    this.tspr = value;
  }

  public boolean isSetTSPR() {
    return (this.tspr != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NationalMemo} instance
   * @since 3.1.0
   */
  public NationalMemo getELNOT() {
    return elnot;
  }

  /**
   * Set
   * <p>
   * @param value a {@link NationalMemo} instance
   * @since 3.1.0
   */
  public void setELNOT(NationalMemo value) {
    this.elnot = value;
  }

  public boolean isSetELNOT() {
    return (this.elnot != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SignalTuning} instance
   * @since 3.1.0
   */
  public Set<SignalTuning> getSignalTuning() {
    if (signalTuning == null) {
      signalTuning = new HashSet<>();
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
  public Set<EqpFnct> getEqpFnct() {
    if (eqpFnct == null) {
      eqpFnct = new HashSet<>();
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
  public Set<TxRxMode> getTxRxMode() {
    if (txRxMode == null) {
      txRxMode = new HashSet<>();
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
   * @return the Transmitter value in a {@link Transmitter} data type
   * @since 3.1.0
   */
  public Transmitter getTransmitter() {
    return transmitter;
  }

  /**
   * Set
   * <p>
   * @param value the Transmitter value in a {@link Transmitter} data type
   * @since 3.1.0
   */
  public void setTransmitter(Transmitter value) {
    this.transmitter = value;
  }

  public boolean isSetTransmitter() {
    return (this.transmitter != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Receiver} instance
   * @since 3.1.0
   */
  public Receiver getReceiver() {
    return receiver;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Receiver} instance
   * @since 3.1.0
   */
  public void setReceiver(Receiver value) {
    this.receiver = value;
  }

  public boolean isSetReceiver() {
    return (this.receiver != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListAU} instance
   * @since 3.1.0
   */
  public ListAU getEqpType() {
    return eqpType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAU} instance
   * @since 3.1.0
   */
  public void setEqpType(ListAU value) {
    this.eqpType = value;
  }

  public boolean isSetEqpType() {
    return (this.eqpType != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link StockNum...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Deployment}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withDeployment(Deployment value) {
    setDeployment(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Emergency}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withEmergency(Emergency value) {
    setEmergency(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link WillReplace...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withWillReplace(WillReplace... values) {
    if (values != null) {
      getWillReplace().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link WillReplace} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withWillReplace(Collection<WillReplace> values) {
    if (values != null) {
      getWillReplace().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withSignalDescrRef(ElmRef... values) {
    if (values != null) {
      getSignalDescrRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalDescrRef} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withSignalDescrRef(Collection<ElmRef> values) {
    if (values != null) {
      getSignalDescrRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqSep}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withDuplexSep(FreqSep value) {
    setDuplexSep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link NationalMemo}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withTSPR(NationalMemo value) {
    setTSPR(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link NationalMemo}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withELNOT(NationalMemo value) {
    setELNOT(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClassFreq}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withFreqTolerance(ClassFreq value) {
    setFreqTolerance(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link EqpFnct...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withEqpFnct(EqpFnct... values) {
    if (values != null) {
      getEqpFnct().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EqpFnct} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withEqpFnct(Collection<EqpFnct> values) {
    if (values != null) {
      getEqpFnct().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TxRxMode...}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withTxRxMode(TxRxMode... values) {
    if (values != null) {
      getTxRxMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TxRxMode} instances
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withTxRxMode(Collection<TxRxMode> values) {
    if (values != null) {
      getTxRxMode().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Transmitter}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withTransmitter(Transmitter value) {
    setTransmitter(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Receiver}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withReceiver(Receiver value) {
    setReceiver(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAU}
   * @return The current TxRx object instance
   * @since 3.1.0
   */
  public TxRx withEqpType(ListAU value) {
    setEqpType(value);
    return this;
  }

  /**
   * Get a string representation of this TxRx instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxRx {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxRx} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null Nomenclature}, {@link null TxRxMode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetNomenclature() && isSetTxRxMode();
  }

}
