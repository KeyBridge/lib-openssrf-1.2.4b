package us.gov.dod.standard.ssrf._1_2_4;

import java.util.*;
import javax.security.auth.login.Configuration;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;
import us.gov.dod.standard.ssrf._1_2_4.sspt.HostNationConstraints;

/**
 * SSReply is the XML root for all parameters of a Host Nation Declaration of
 * Spectrum Supportability. It inherits attributes and sub-elements from element
 * Common.
 * <p>
 * Sub-Elements are
 * {@link CommentSource}, {@link Configuration}, {@link StageLocation}
 * <p>
 * Example:
 * <pre>
 * &lt;SSReply cls="U"&gt;
 *   &lt;Serial cls="U"&gt;FRA::HD:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2012-02-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;SSRequestRef cls="U"&gt;USA::SR:123&lt;/SSRequestRef&gt;
 *   &lt;ReplyingCountry cls="U"&gt;FRA&lt;/ReplyingCountry&gt;
 *   &lt;SupportabilityCode cls="U"&gt;Supported with Restrictions&lt;/SupportabilityCode&gt;
 *   &lt;EffectiveDate cls="U"&gt;2012-02-25&lt;/EffectiveDate&gt;
 *   &lt;CommentSource&gt;
 *     &lt;Source cls="U"&gt;CAA&lt;/Source&gt;
 *     &lt;Comment idx="1" cls="U"&gt;IAW frequency clearance agreement FR MoD/FR CAA.&lt;/
 *     Comment&gt;
 *   &lt;/CommentSource&gt;
 * &lt;/SSReply&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSSReply", propOrder = {
  "ssRequestRef",
  "hostNationConstraints"
})
public class SSReply extends Common<SSReply> {

  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * The dataset identifier of the SSRequest being replied to.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SSRequestRef", required = true)
  protected SSRequestRef ssRequestRef;

  @XmlElement(name = "HostNationConstraints")
  protected Set<HostNationConstraints> hostNationConstraints;

  @XmlAttribute(name = "status", required = true)
  protected String attributeStatus;

  /**
   * Get the dataset identifier of the SSRequest being replied to.
   * <p>
   * @return a {@link SSRequestRef} instance
   * @since 3.1.0
   */
  public SSRequestRef getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value a {@link SSRequestRef} instance
   * @since 3.1.0
   */
  public void setSSRequestRef(SSRequestRef value) {
    this.ssRequestRef = value;
  }

  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link HostNationConstraints} instance
   * @since 3.1.0
   */
  public Set<HostNationConstraints> getHostNationConstraints() {
    if (hostNationConstraints == null) {
      hostNationConstraints = new HashSet<>();
    }
    return this.hostNationConstraints;
  }

  public boolean isSetHostNationConstraints() {
    return ((this.hostNationConstraints != null) && (!this.hostNationConstraints.isEmpty()));
  }

  /**
   * Clear the HostNationConstraints field. This sets the field to null.
   */
  public void unsetHostNationConstraints() {
    this.hostNationConstraints = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAttributeStatus() {
    return attributeStatus;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAttributeStatus(String value) {
    this.attributeStatus = value;
  }

  public boolean isSetAttributeStatus() {
    return (this.attributeStatus != null);
  }

  /**
   * Set the dataset identifier of the SSRequest being replied to.
   * <p>
   * @param value An instances of type {@link SSRequestRef}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withSSRequestRef(SSRequestRef value) {
    setSSRequestRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link HostNationConstraints...}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withHostNationConstraints(HostNationConstraints... values) {
    if (values != null) {
      getHostNationConstraints().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link HostNationConstraints} instances
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withHostNationConstraints(Collection<HostNationConstraints> values) {
    if (values != null) {
      getHostNationConstraints().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SSReply object instance
   * @since 3.1.0
   */
  public SSReply withAttributeStatus(String value) {
    setAttributeStatus(value);
    return this;
  }

  /**
   * Get a string representation of this SSReply instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSReply {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSReply} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null SSRequestRef}, {@link null status}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetSSRequestRef() && isSetStatus();
  }

}
