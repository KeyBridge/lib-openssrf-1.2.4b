package us.gov.dod.standard.ssrf._1_2_4.sspt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Memo;

/**
 * SystemCost
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSystemCost")
public class SystemCost
  extends Memo {

  @XmlAttribute(name = "intialCost")
  protected String intialCost;

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getIntialCost() {
    return intialCost;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setIntialCost(String value) {
    this.intialCost = value;
  }

  public boolean isSetIntialCost() {
    return (this.intialCost != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SystemCost object instance
   * @since 3.1.0
   */
  public SystemCost withIntialCost(String value) {
    setIntialCost(value);
    return this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SystemCost object instance
   * @since 3.1.0
   */
  @Override
  public SystemCost withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SystemCost object instance
   * @since 3.1.0
   */
  @Override
  public SystemCost withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this SystemCost instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SystemCost {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SystemCost} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
