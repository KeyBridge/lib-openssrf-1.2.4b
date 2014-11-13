package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Mode;
import us.gov.dod.standard.ssrf._1_2_4.shared.AuthorisedBw;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;
import us.gov.dod.standard.ssrf._1_2_4.shared.EmsDesignator;

/**
 * TxRxMode
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTxRxMode", propOrder = {
  "emsDesignator",
  "authorisedBw",
  "signalTuning",
  "modulation",
  "baseband",
  "spreadSpectrum",
  "occupiedBw",
  "pulse",
  "burst",
  "txMode",
  "rxMode"
})
public class TxRxMode
  extends Mode {

  @XmlElement(name = "EmsDesignator")
  protected EmsDesignator emsDesignator;

  @XmlElement(name = "AuthorisedBw")
  protected AuthorisedBw authorisedBw;

  @XmlElement(name = "SignalTuning")
  protected Set<SignalTuning> signalTuning;

  @XmlElement(name = "Modulation")
  protected Set<Modulation> modulation;

  @XmlElement(name = "Baseband")
  protected Set<Baseband> baseband;

  @XmlElement(name = "SpreadSpectrum")
  protected SpreadSpectrum spreadSpectrum;

  @XmlElement(name = "OccupiedBw")
  protected ClassBw occupiedBw;

  @XmlElement(name = "Pulse")
  protected Set<Pulse> pulse;

  @XmlElement(name = "Burst")
  protected Burst burst;

  @XmlElement(name = "TxMode")
  protected Set<TxMode> txMode;

  @XmlElement(name = "RxMode")
  protected Set<RxMode> rxMode;

  @XmlAttribute(name = "modeName", required = true)
  protected String modeName;

  /**
   * Get
   * <p>
   * @return a {@link EmsDesignator} instance
   * @since 3.1.0
   */
  public EmsDesignator getEmsDesignator() {
    return emsDesignator;
  }

  /**
   * Set
   * <p>
   * @param value a {@link EmsDesignator} instance
   * @since 3.1.0
   */
  public void setEmsDesignator(EmsDesignator value) {
    this.emsDesignator = value;
  }

  public boolean isSetEmsDesignator() {
    return (this.emsDesignator != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link AuthorisedBw} instance
   * @since 3.1.0
   */
  public AuthorisedBw getAuthorisedBw() {
    return authorisedBw;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AuthorisedBw} instance
   * @since 3.1.0
   */
  public void setAuthorisedBw(AuthorisedBw value) {
    this.authorisedBw = value;
  }

  public boolean isSetAuthorisedBw() {
    return (this.authorisedBw != null);
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
   * @return a {@link Modulation} instance
   * @since 3.1.0
   */
  public Set<Modulation> getModulation() {
    if (modulation == null) {
      modulation = new HashSet<>();
    }
    return this.modulation;
  }

  public boolean isSetModulation() {
    return ((this.modulation != null) && (!this.modulation.isEmpty()));
  }

  /**
   * Clear the Modulation field. This sets the field to null.
   */
  public void unsetModulation() {
    this.modulation = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Baseband} instance
   * @since 3.1.0
   */
  public Set<Baseband> getBaseband() {
    if (baseband == null) {
      baseband = new HashSet<>();
    }
    return this.baseband;
  }

  public boolean isSetBaseband() {
    return ((this.baseband != null) && (!this.baseband.isEmpty()));
  }

  /**
   * Clear the Baseband field. This sets the field to null.
   */
  public void unsetBaseband() {
    this.baseband = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public void setSpreadSpectrum(SpreadSpectrum value) {
    this.spreadSpectrum = value;
  }

  public boolean isSetSpreadSpectrum() {
    return (this.spreadSpectrum != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ClassBw} instance
   * @since 3.1.0
   */
  public ClassBw getOccupiedBw() {
    return occupiedBw;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ClassBw} instance
   * @since 3.1.0
   */
  public void setOccupiedBw(ClassBw value) {
    this.occupiedBw = value;
  }

  public boolean isSetOccupiedBw() {
    return (this.occupiedBw != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Pulse} instance
   * @since 3.1.0
   */
  public Set<Pulse> getPulse() {
    if (pulse == null) {
      pulse = new HashSet<>();
    }
    return this.pulse;
  }

  public boolean isSetPulse() {
    return ((this.pulse != null) && (!this.pulse.isEmpty()));
  }

  /**
   * Clear the Pulse field. This sets the field to null.
   */
  public void unsetPulse() {
    this.pulse = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Burst} instance
   * @since 3.1.0
   */
  public Burst getBurst() {
    return burst;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Burst} instance
   * @since 3.1.0
   */
  public void setBurst(Burst value) {
    this.burst = value;
  }

  public boolean isSetBurst() {
    return (this.burst != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link TxMode} instance
   * @since 3.1.0
   */
  public Set<TxMode> getTxMode() {
    if (txMode == null) {
      txMode = new HashSet<>();
    }
    return this.txMode;
  }

  public boolean isSetTxMode() {
    return ((this.txMode != null) && (!this.txMode.isEmpty()));
  }

  /**
   * Clear the TxMode field. This sets the field to null.
   */
  public void unsetTxMode() {
    this.txMode = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link RxMode} instance
   * @since 3.1.0
   */
  public Set<RxMode> getRxMode() {
    if (rxMode == null) {
      rxMode = new HashSet<>();
    }
    return this.rxMode;
  }

  public boolean isSetRxMode() {
    return ((this.rxMode != null) && (!this.rxMode.isEmpty()));
  }

  /**
   * Clear the RxMode field. This sets the field to null.
   */
  public void unsetRxMode() {
    this.rxMode = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getModeName() {
    return modeName;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setModeName(String value) {
    this.modeName = value;
  }

  public boolean isSetModeName() {
    return (this.modeName != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link EmsDesignator}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withEmsDesignator(EmsDesignator value) {
    setEmsDesignator(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AuthorisedBw}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withAuthorisedBw(AuthorisedBw value) {
    setAuthorisedBw(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Modulation...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withModulation(Modulation... values) {
    if (values != null) {
      getModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Modulation} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withModulation(Collection<Modulation> values) {
    if (values != null) {
      getModulation().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Baseband...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Baseband} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SpreadSpectrum}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withSpreadSpectrum(SpreadSpectrum value) {
    setSpreadSpectrum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClassBw}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withOccupiedBw(ClassBw value) {
    setOccupiedBw(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Pulse...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withPulse(Pulse... values) {
    if (values != null) {
      getPulse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Pulse} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withPulse(Collection<Pulse> values) {
    if (values != null) {
      getPulse().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Burst}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withBurst(Burst value) {
    setBurst(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TxMode...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withTxMode(TxMode... values) {
    if (values != null) {
      getTxMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TxMode} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withTxMode(Collection<TxMode> values) {
    if (values != null) {
      getTxMode().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RxMode...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withRxMode(RxMode... values) {
    if (values != null) {
      getRxMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RxMode} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withRxMode(Collection<RxMode> values) {
    if (values != null) {
      getRxMode().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  public TxRxMode withModeName(String value) {
    setModeName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxRxMode withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxRxMode withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxRxMode withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxRxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxRxMode withDescr(String value) {
    setDescr(value);
    return this;
  }

  /**
   * Get a string representation of this TxRxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxRxMode {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxRxMode} requires {@link null modeName}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetModeName();
  }

}
