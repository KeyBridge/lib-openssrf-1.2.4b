package us.gov.dod.standard.ssrf._1_2_4.link;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import sun.org.mozilla.javascript.ast.Assignment;
import us.gov.dod.standard.ssrf._1_2_4.shared.ContactOrgRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.CositeSep;
import us.gov.dod.standard.ssrf._1_2_4.shared.NumUnits;

/**
 * Station defines the station, or one of the stations, within the current
 * Assignment dataset.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Sub-Elements are {@link POCInformation}, {@link StationLoc}
 * <p>
 * Example:
 * <pre>
 * &lt;Station&gt;
 *   &lt;Name cls="U"&gt;Base Station&lt;/Name&gt;
 *   &lt;CallSign cls="U"&gt;WUH55&lt;/CallSign&gt;
 *   &lt;sub-elements/&gt;
 *   &lt;/Station&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStation", propOrder = {
  "stationLoc",
  "cositeSep",
  "contactOrgRef",
  "numUnits",
  "userCode",
  "tsdf"
})
public class Station {

  /**
   * US:StationLoc (Required)
   * <p>
   * Station (US) defines one or more transmitters or receivers or a combination
   * of transmitters and receivers, including the accessory
   * <p>
   * Divergence from SMADEF: When exchanging data with NATO, only one Stat
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StationLoc", required = true)
  protected Set<StationLoc> stationLoc;
  /**
   * CositeSep - Cosite Separation (Optional)
   * <p>
   * The minimum required frequency separation between the equipment for which
   * the assignment is being made and any other equipment operating at the same
   * location. Enter: - For a fixed frequency assignment, the required frequency
   * separation in MHz (without unit), between this equipment and other
   * equipment operated at one location. If the frequency separation is unknown
   * use the NATO recommended frequency separation requirements are listed
   * below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts); 2
   * (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CositeSep")
  protected CositeSep cositeSep;

  @XmlElement(name = "ContactOrgRef")
  protected Set<ContactOrgRef> contactOrgRef;

  @XmlElement(name = "NumUnits")
  protected NumUnits numUnits;
  /**
   * UserCode - User Code (Optional)
   * <p>
   * A code identifying the user of the station.
   * <p>
   * Format is S6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UserCode")
  protected UserCode userCode;

  @XmlElement(name = "TSDF")
  protected Set<TSDF> tsdf;
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
   * US:StationName - Station Name (Optional)
   * <p>
   * A short descriptive name for the station. This must be unique within the
   * dataset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "name", required = true)
  protected String name;
  /**
   * CallSign - Call Sign (Optional)
   * <p>
   * The call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "callSign")
  protected String callSign;

  /**
   * Get the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @return a {@link StationLoc} instance
   * @since 3.1.0
   */
  public Set<StationLoc> getStationLoc() {
    if (stationLoc == null) {
      stationLoc = new HashSet<>();
    }
    return this.stationLoc;
  }

  public boolean isSetStationLoc() {
    return ((this.stationLoc != null) && (!this.stationLoc.isEmpty()));
  }

  /**
   * Clear the StationLoc field. This sets the field to null.
   */
  public void unsetStationLoc() {
    this.stationLoc = null;
  }

  /**
   * Get the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * @return a {@link CositeSep} instance
   * @since 3.1.0
   */
  public CositeSep getCositeSep() {
    return cositeSep;
  }

  /**
   * Set the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
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
   * @return a {@link ContactOrgRef} instance
   * @since 3.1.0
   */
  public Set<ContactOrgRef> getContactOrgRef() {
    if (contactOrgRef == null) {
      contactOrgRef = new HashSet<>();
    }
    return this.contactOrgRef;
  }

  public boolean isSetContactOrgRef() {
    return ((this.contactOrgRef != null) && (!this.contactOrgRef.isEmpty()));
  }

  /**
   * Clear the ContactOrgRef field. This sets the field to null.
   */
  public void unsetContactOrgRef() {
    this.contactOrgRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NumUnits} instance
   * @since 3.1.0
   */
  public NumUnits getNumUnits() {
    return numUnits;
  }

  /**
   * Set
   * <p>
   * @param value a {@link NumUnits} instance
   * @since 3.1.0
   */
  public void setNumUnits(NumUnits value) {
    this.numUnits = value;
  }

  public boolean isSetNumUnits() {
    return (this.numUnits != null);
  }

  /**
   * Get a code identifying the user of the station.
   * <p>
   * @return a {@link UserCode} instance
   * @since 3.1.0
   */
  public UserCode getUserCode() {
    return userCode;
  }

  /**
   * Set a code identifying the user of the station.
   * <p>
   * @param value a {@link UserCode} instance
   * @since 3.1.0
   */
  public void setUserCode(UserCode value) {
    this.userCode = value;
  }

  public boolean isSetUserCode() {
    return (this.userCode != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link TSDF} instance
   * @since 3.1.0
   */
  public Set<TSDF> getTSDF() {
    if (tsdf == null) {
      tsdf = new HashSet<>();
    }
    return this.tsdf;
  }

  public boolean isSetTSDF() {
    return ((this.tsdf != null) && (!this.tsdf.isEmpty()));
  }

  /**
   * Clear the TSDF field. This sets the field to null.
   */
  public void unsetTSDF() {
    this.tsdf = null;
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
   * Get a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setName(String value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Get the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCallSign() {
    return callSign;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCallSign(String value) {
    this.callSign = value;
  }

  public boolean isSetCallSign() {
    return (this.callSign != null);
  }

  /**
   * Set the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @param values One or more instances of type {@link StationLoc...}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withStationLoc(StationLoc... values) {
    if (values != null) {
      getStationLoc().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StationLoc
   * <p>
   * Complex element Station (US) defines one or more transmitters or receivers
   * or a combination of transmitters and receivers, including the accessory
   * equipment necessary at one location for carrying on a radiocommunication,
   * radiolocation, or other spectrum dependent function.
   * <p>
   * @param values A collection of {@link StationLoc} instances
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withStationLoc(Collection<StationLoc> values) {
    if (values != null) {
      getStationLoc().addAll(values);
    }
    return this;
  }

  /**
   * Set the minimum required frequency separation between the equipment for
   * which the assignment is being made and any other equipment operating at the
   * same location. Enter: - For a fixed frequency assignment, the required
   * frequency separation in MHz (without unit), between this equipment and
   * other equipment operated at one location. If the frequency separation is
   * unknown use the NATO recommended frequency separation requirements are
   * listed below. 0.5 (MHz) for a transmitter power below 24.8 dBW (300 watts);
   * 2 (MHz) for a transmitter power above 24.8 dBW (300 watts); 2.0 through 9.9
   * (MHz) for exceptionally high transmitter powers or difficult cosite
   * constraints. - For a HAVE QUICK II or SATURN frequency hopping assignments,
   * one of the following values: 0 - Instantaneous separation may be as small
   * as 25 kHz; 4 - Minimum separation is 4 MHz; 8 - Minimum separation is 8
   * MHz; 12 - Minimum separation is 12 MHz
   * <p>
   * @param value An instances of type {@link CositeSep}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withCositeSep(CositeSep value) {
    setCositeSep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ContactOrgRef...}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withContactOrgRef(ContactOrgRef... values) {
    if (values != null) {
      getContactOrgRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ContactOrgRef} instances
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withContactOrgRef(Collection<ContactOrgRef> values) {
    if (values != null) {
      getContactOrgRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link NumUnits}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withNumUnits(NumUnits value) {
    setNumUnits(value);
    return this;
  }

  /**
   * Set a code identifying the user of the station.
   * <p>
   * @param value An instances of type {@link UserCode}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withUserCode(UserCode value) {
    setUserCode(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link TSDF...}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withTSDF(TSDF... values) {
    if (values != null) {
      getTSDF().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link TSDF} instances
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withTSDF(Collection<TSDF> values) {
    if (values != null) {
      getTSDF().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a short descriptive name for the station. This must be unique within
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Station object instance
   * @since 3.1.0
   */
  public Station withCallSign(String value) {
    setCallSign(value);
    return this;
  }

  /**
   * Get a string representation of this Station instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Station {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Station} requires {@link null StationLoc}, {@link null name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetStationLoc() && isSetName();
  }

}
