package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * AntStd
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntStd", propOrder = {
  "antSpec"
})
public class AntStd extends Std<AntStd> {

  @XmlElement(name = "AntSpec", required = true)
  protected Set<AntSpec> antSpec;

  /**
   * Get
   * <p>
   * @return a {@link AntSpec} instance
   * @since 3.1.0
   */
  public Set<AntSpec> getAntSpec() {
    if (antSpec == null) {
      antSpec = new HashSet<>();
    }
    return this.antSpec;
  }

  public boolean isSetAntSpec() {
    return ((this.antSpec != null) && (!this.antSpec.isEmpty()));
  }

  /**
   * Clear the AntSpec field. This sets the field to null.
   */
  public void unsetAntSpec() {
    this.antSpec = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AntSpec...}
   * @return The current AntStd object instance
   * @since 3.1.0
   */
  public AntStd withAntSpec(AntSpec... values) {
    if (values != null) {
      getAntSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AntSpec} instances
   * @return The current AntStd object instance
   * @since 3.1.0
   */
  public AntStd withAntSpec(Collection<AntSpec> values) {
    if (values != null) {
      getAntSpec().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AntStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntStd} requires {@link null AntSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetAntSpec();
  }

}
