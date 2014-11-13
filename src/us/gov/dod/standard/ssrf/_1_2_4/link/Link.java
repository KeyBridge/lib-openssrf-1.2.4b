package us.gov.dod.standard.ssrf._1_2_4.link;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * Link identifies each link in a system of assignments. This is the top element
 * of each Link. The exact definition of a link is very flexible and depends on
 * the degree of accuracy needed for the assignment. A link can be very generic
 * (one or several base stations serving an area or a volume with non-defined
 * mobiles) to very accurate (such as one link for each radio-relay hop).
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Sub-Elements are
 * {@link Assigned}, {@link DCSTrunk}, {@link DetailedFunctionID}, {@link StationConfig}, {@link Tuning}
 * <p>
 * Example:
 * <pre>
 * &lt;Link&gt;
 *   &lt;LinkID cls="U"&gt;LINK1&lt;/LinkID&gt;
 *   &lt;StationConfig&gt;
 *     &lt;Type cls="U"&gt;Transmit-Receive&lt;/Type&gt;
 *     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
 *     &lt;StationID cls="U"&gt;STATION1&lt;/StationID&gt;
 *   &lt;/StationConfig&gt;
 *   &lt;Assigned&gt;
 *     &lt;Freq&gt;
 *       &lt;FreqMin cls="U"&gt;256.275&lt;/FreqMin&gt;
 *     &lt;/Freq&gt;
 *   &lt;/Assigned&gt;
 * &lt;/Link&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLink", propOrder = {
  "content"
})
public class Link {

  @XmlElementRefs({
    @XmlElementRef(name = "RxStation", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "Rejected", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "NetNum", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "Freq", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "NavAids", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),
    /**
     * Tuning (Optional)
     * <p>
     * Tuning indicates the specific frequency or range of frequencies, tuning
     * increment, and number of frequencies, required for an assignment.
     * <p>
     * @since 3.1.0
     */
    @XmlElementRef(name = "Tuning", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "TxStation", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "TxRxStation", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),
    /**
     * US:DCSTrunk (Optional)
     * <p>
     * DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier
     * for a specific "trunked" system. The identifier is assigned by the
     * Defense Information Systems Agency (DISA).
     * <p>
     * @since 3.1.0
     */
    @XmlElementRef(name = "DCSTrunk", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false)
  })
  protected Set<JAXBElement<?>> content;
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
   * US:LinkName - Link Name (Optional)
   * <p>
   * A human readable name of the link.
   * <p>
   * Format is S25
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "name", required = true)
  protected String name;

  public Set<JAXBElement<?>> getContent() {
    if (content == null) {
      content = new HashSet<>();
    }
    return this.content;
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
   * Get a human readable name of the link.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set a human readable name of the link.
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

  public Link withContent(JAXBElement<?>... values) {
    if (values != null) {
      getContent().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withContent(Collection<JAXBElement<?>> values) {
    if (values != null) {
      getContent().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a human readable name of the link.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   * @since 3.1.0
   */
  public Link withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Get a string representation of this Link instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Link {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Link} requires {@link null name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName();
  }

}
