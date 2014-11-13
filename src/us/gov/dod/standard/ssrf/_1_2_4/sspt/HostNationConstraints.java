package us.gov.dod.standard.ssrf._1_2_4.sspt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.link.Config;
import us.gov.dod.standard.ssrf._1_2_4.shared.LocationRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.TimeFrame;

/**
 * HostNationConstraints
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THostNationConstraints", propOrder = {
  "config",
  "authorisedTuning",
  "timeFrame",
  "locationRef"
})
public class HostNationConstraints {

  @XmlElement(name = "Config")
  protected Set<Config> config;

  @XmlElement(name = "AuthorisedTuning")
  protected AuthorisedTuning authorisedTuning;

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;

  @XmlElement(name = "LocationRef")
  protected Set<LocationRef> locationRef;
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
   * Get
   * <p>
   * @return a {@link Config} instance
   * @since 3.1.0
   */
  public Set<Config> getConfig() {
    if (config == null) {
      config = new HashSet<>();
    }
    return this.config;
  }

  public boolean isSetConfig() {
    return ((this.config != null) && (!this.config.isEmpty()));
  }

  /**
   * Clear the Config field. This sets the field to null.
   */
  public void unsetConfig() {
    this.config = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link AuthorisedTuning} instance
   * @since 3.1.0
   */
  public AuthorisedTuning getAuthorisedTuning() {
    return authorisedTuning;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AuthorisedTuning} instance
   * @since 3.1.0
   */
  public void setAuthorisedTuning(AuthorisedTuning value) {
    this.authorisedTuning = value;
  }

  public boolean isSetAuthorisedTuning() {
    return (this.authorisedTuning != null);
  }

  /**
   * Get
   * <p>
   * @return the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public TimeFrame getTimeFrame() {
    return timeFrame;
  }

  /**
   * Set
   * <p>
   * @param value the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public void setTimeFrame(TimeFrame value) {
    this.timeFrame = value;
  }

  public boolean isSetTimeFrame() {
    return (this.timeFrame != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public Set<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new HashSet<>();
    }
    return this.locationRef;
  }

  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  /**
   * Clear the LocationRef field. This sets the field to null.
   */
  public void unsetLocationRef() {
    this.locationRef = null;
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
   * Set
   * <p>
   * @param values One or more instances of type {@link Config...}
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withConfig(Config... values) {
    if (values != null) {
      getConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Config} instances
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withConfig(Collection<Config> values) {
    if (values != null) {
      getConfig().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AuthorisedTuning}
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withAuthorisedTuning(AuthorisedTuning value) {
    setAuthorisedTuning(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current HostNationConstraints object instance
   * @since 3.1.0
   */
  public HostNationConstraints withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this HostNationConstraints instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "HostNationConstraints {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link HostNationConstraints} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
