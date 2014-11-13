package us.gov.dod.standard.ssrf._1_2_4;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.RouteRef;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.RouteRef.AtWayPoint;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * FEDeployment describes the deployment of a force element to a location. Each
 * deployment has a period of time for which the deployment is valid described
 * by the start and end date/time.
 * <p>
 * Sub-Elements are {@link AtWayPoint}, {@link Project}
 * <p>
 * Example:
 * <pre>
 * &lt;FEDeployment cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::FD:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;FERef cls="U"&gt;NLD::FE:222&lt;/FERef&gt;
 *   &lt;Type cls="U"&gt;Location-Current&lt;/Type&gt;
 *   &lt;Months cls="U"&gt;1-2&lt;/Months&gt;
 *   &lt;Years cls="U"&gt;2012&lt;/Years&gt;
 *   &lt;LocationRef cls="U"&gt;NLD::LO:333&lt;/LocationRef&gt;
 * &lt;/FEDeployment&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFEDeployment", propOrder = {
  "timeFrame",
  "feRef",
  "locationRef",
  "routeRef"
})
public class FEDeployment extends Common<FEDeployment> {

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;
  /**
   * FERef - Force Element Serial (Required)
   * <p>
   * The dataset identifier of the ForceElement being deployed.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FERef", required = true)
  protected ElmRef feRef;
  /**
   * LocationRef - Location Reference (Optional)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef")
  protected LocationRef locationRef;

  @XmlElement(name = "RouteRef")
  protected RouteRef routeRef;
  /**
   * Type - Deployment Type (Required)
   * <p>
   * The type of deployment.
   * <p>
   * Format is L:CFD
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type")
  protected String type;

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
   * Get the dataset identifier of the ForceElement being deployed.
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getFERef() {
    return feRef;
  }

  /**
   * Set the dataset identifier of the ForceElement being deployed.
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setFERef(ElmRef value) {
    this.feRef = value;
  }

  public boolean isSetFERef() {
    return (this.feRef != null);
  }

  /**
   * Get the serial of the referenced Location.
   * <p>
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public LocationRef getLocationRef() {
    return locationRef;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value a {@link LocationRef} instance
   * @since 3.1.0
   */
  public void setLocationRef(LocationRef value) {
    this.locationRef = value;
  }

  public boolean isSetLocationRef() {
    return (this.locationRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link RouteRef} instance
   * @since 3.1.0
   */
  public RouteRef getRouteRef() {
    return routeRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link RouteRef} instance
   * @since 3.1.0
   */
  public void setRouteRef(RouteRef value) {
    this.routeRef = value;
  }

  public boolean isSetRouteRef() {
    return (this.routeRef != null);
  }

  /**
   * Get the type of deployment.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current FEDeployment object instance
   * @since 3.1.0
   */
  public FEDeployment withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set the dataset identifier of the ForceElement being deployed.
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current FEDeployment object instance
   * @since 3.1.0
   */
  public FEDeployment withFERef(ElmRef value) {
    setFERef(value);
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value An instances of type {@link LocationRef}
   * @return The current FEDeployment object instance
   * @since 3.1.0
   */
  public FEDeployment withLocationRef(LocationRef value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link RouteRef}
   * @return The current FEDeployment object instance
   * @since 3.1.0
   */
  public FEDeployment withRouteRef(RouteRef value) {
    setRouteRef(value);
    return this;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FEDeployment object instance
   * @since 3.1.0
   */
  public FEDeployment withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Get a string representation of this FEDeployment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FEDeployment {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FEDeployment} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null FERef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFERef();
  }

}
