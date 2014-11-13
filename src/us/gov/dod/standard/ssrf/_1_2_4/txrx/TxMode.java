package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Mode;
import us.gov.dod.standard.ssrf._1_2_4.Transmitter;
import us.gov.dod.standard.ssrf._1_2_4.shared.CositeSep;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;

/**
 * TxMode and its sub-elements define all the technical parameters for a mode of
 * operation of the Transmitter.
 * <p>
 * Element of {@link Transmitter}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link ObservedMOPAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link Power}, {@link Pulse}, {@link SpreadSpectrum}, {@link SubcarrierFreq}, {@link TxModulation}, {@link TxSignalTuning}
 * <p>
 * Example:
 * <pre>
 * &lt;TxMode&gt;
 *   &lt;BurstDuration  cls="U"&gt;.001&lt;/BurstDuration &gt;
 *   &lt;BurstNumPulses  cls="U"&gt;458&lt;/BurstNumPulses &gt;
 *   &lt;BurstOffTime  cls="U"&gt;.13&lt;/BurstOffTime &gt;
 *   &lt;BurstRate  cls="U"&gt;5984&lt;/BurstRate &gt;
 *   &lt;ChannelDwell cls="U"&gt;.2387&lt;/ChannelDwell&gt;
 *   &lt;curves cls="U"&gt;34&lt;/curves&gt;
 *   &lt;Description  cls="U"&gt;Targets 893 and 569&lt;/Description &gt;
 *   &lt;FreqTolerance  cls="U"&gt;.0001&lt;/FreqTolerance &gt;
 *   &lt;FreqToleranceUnit cls="U"&gt;ppm&lt;/FreqToleranceUnit&gt;
 *   &lt;IntermodulationEffect cls="U"&gt;Friendly receivers performance degraded by 12 percent&lt;/IntermodulationEffect&gt;
 *   &lt;IntermodulationPct  cls="U"&gt;17&lt;/IntermodulationPct &gt;
 *   &lt;ModeID  cls="U"&gt;Narrowband Pulse&lt;/ModeID &gt;
 *   &lt;NecessaryBw  cls="U"&gt;3123.67&lt;/NecessaryBw &gt;
 *   &lt;NumSideTones  cls="U"&gt;16&lt;/NumSideTones &gt;
 *   &lt;NumSubCarriers  cls="U"&gt;16&lt;/NumSubCarriers &gt;
 *   &lt;OccBw cls="U"&gt;3363.67&lt;/OccBw&gt;
 *   &lt;OccBwCalculated cls="U"&gt;Yes&lt;/OccBwCalculated&gt;
 *   &lt;OtherHarmonicLevel  cls="U"&gt;106&lt;/OtherHarmonicLevel &gt;
 *   &lt;RadarType  cls="U"&gt;FM Pulse&lt;/RadarType &gt;
 *   &lt;SecondHarmonicLevel  cls="U"&gt;89&lt;/SecondHarmonicLevel &gt;
 *   &lt;SpuriousLevel  cls="U"&gt;90&lt;/SpuriousLevel &gt;
 *   &lt;ThirdHarmonicLevel  cls="U"&gt;93&lt;/ThirdHarmonicLevel &gt;
 *   &lt;Tunability  cls="U"&gt;Fixed+Stepped&lt;/Tunability &gt;
 *   &lt;TuningMethod  cls="U"&gt;Synthesizer Microprocessor Controlled&lt;/TuningMethod &gt;
 *   &lt;GpsNBL1Level  cls="U"&gt;46.95&lt;/GpsNBL1Level &gt;
 *   &lt;GpsNBL2Level  cls="U"&gt;66.98&lt;/GpsNBL2Level &gt;
 *   &lt;GpsWBL1Level  cls="U"&gt;12.89&lt;/GpsWBL1Level &gt;
 *   &lt;GpsWBL2Level  cls="U"&gt;16.975&lt;/GpsWBL2Level &gt;
 *   &lt;JitterCapable cls="U"&gt;Yes&lt;/JitterCapable&gt;
 *   &lt;ModeName  cls="U"&gt;Broadband Sweep Jamming&lt;/ModeName &gt;
 *   &lt;ModulationType  cls="U"&gt;Pulse&lt;/ModulationType &gt;
 * &lt;/TxMode&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTxMode", propOrder = {
  "signalTuning",
  "power",
  "subcarrierFreq",
  "subcarrierTone",
  "cositeSep"
})
public class TxMode
  extends Mode {

  @XmlElement(name = "SignalTuning")
  protected Set<SignalTuning> signalTuning;
  /**
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Power", required = true)
  protected Set<Power> power;
  /**
   * SubcarrierFreq (Optional)
   * <p>
   * SubcarrierFreq describes the secondary channel that
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SubcarrierFreq")
  protected Set<ClassFreq> subcarrierFreq;

  @XmlElement(name = "SubcarrierTone")
  protected Set<ClassFreq> subcarrierTone;

  @XmlElement(name = "CositeSep")
  protected CositeSep cositeSep;

  @XmlAttribute(name = "txMode", required = true)
  protected String txMode;
  /**
   * NumSideTones - Number of Side Tones (Optional)
   * <p>
   * The number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "numSideTones")
  protected BigInteger numSideTones;
  /**
   * NumSubCarriers - Number of Subcarriers (Optional)
   * <p>
   * The number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "numSubCarriers")
  protected BigInteger numSubCarriers;

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
   * Get the power limit of this transmitter mode when in this configuration.
   * <p>
   * @return a {@link Power} instance
   * @since 3.1.0
   */
  public Set<Power> getPower() {
    if (power == null) {
      power = new HashSet<>();
    }
    return this.power;
  }

  public boolean isSetPower() {
    return ((this.power != null) && (!this.power.isEmpty()));
  }

  /**
   * Clear the Power field. This sets the field to null.
   */
  public void unsetPower() {
    this.power = null;
  }

  /**
   * Get the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @return a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public Set<ClassFreq> getSubcarrierFreq() {
    if (subcarrierFreq == null) {
      subcarrierFreq = new HashSet<>();
    }
    return this.subcarrierFreq;
  }

  public boolean isSetSubcarrierFreq() {
    return ((this.subcarrierFreq != null) && (!this.subcarrierFreq.isEmpty()));
  }

  /**
   * Clear the SubcarrierFreq field. This sets the field to null.
   */
  public void unsetSubcarrierFreq() {
    this.subcarrierFreq = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public Set<ClassFreq> getSubcarrierTone() {
    if (subcarrierTone == null) {
      subcarrierTone = new HashSet<>();
    }
    return this.subcarrierTone;
  }

  public boolean isSetSubcarrierTone() {
    return ((this.subcarrierTone != null) && (!this.subcarrierTone.isEmpty()));
  }

  /**
   * Clear the SubcarrierTone field. This sets the field to null.
   */
  public void unsetSubcarrierTone() {
    this.subcarrierTone = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link CositeSep} instance
   * @since 3.1.0
   */
  public CositeSep getCositeSep() {
    return cositeSep;
  }

  /**
   * Set
   * <p>
   * @param value a {@link CositeSep} instance
   * @since 3.1.0
   */
  public void setCositeSep(CositeSep value) {
    this.cositeSep = value;
  }

  public boolean isSetCositeSep() {
    return (this.cositeSep != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTxMode() {
    return txMode;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTxMode(String value) {
    this.txMode = value;
  }

  public boolean isSetTxMode() {
    return (this.txMode != null);
  }

  /**
   * Get the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumSideTones() {
    return numSideTones;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumSideTones(BigInteger value) {
    this.numSideTones = value;
  }

  public boolean isSetNumSideTones() {
    return (this.numSideTones != null);
  }

  /**
   * Get the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumSubCarriers(BigInteger value) {
    this.numSubCarriers = value;
  }

  public boolean isSetNumSubCarriers() {
    return (this.numSubCarriers != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values One or more instances of type {@link Power...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPower(Power... values) {
    if (values != null) {
      getPower().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values A collection of {@link Power} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withPower(Collection<Power> values) {
    if (values != null) {
      getPower().addAll(values);
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values One or more instances of type {@link ClassFreq...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubcarrierFreq(ClassFreq... values) {
    if (values != null) {
      getSubcarrierFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values A collection of {@link SubcarrierFreq} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubcarrierFreq(Collection<ClassFreq> values) {
    if (values != null) {
      getSubcarrierFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ClassFreq...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubcarrierTone(ClassFreq... values) {
    if (values != null) {
      getSubcarrierTone().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SubcarrierTone} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withSubcarrierTone(Collection<ClassFreq> values) {
    if (values != null) {
      getSubcarrierTone().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link CositeSep}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withCositeSep(CositeSep value) {
    setCositeSep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withTxMode(String value) {
    setTxMode(value);
    return this;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withNumSideTones(BigInteger value) {
    setNumSideTones(value);
    return this;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  public TxMode withNumSubCarriers(BigInteger value) {
    setNumSubCarriers(value);
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxMode withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxMode withCurve(Collection<Curve> values) {
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
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxMode withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   * @since 3.1.0
   */
  @Override
  public TxMode withDescr(String value) {
    setDescr(value);
    return this;
  }

  /**
   * Get a string representation of this TxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxMode {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxMode} requires {@link null Power}, {@link null txMode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetPower() && isSetTxMode();
  }

}
