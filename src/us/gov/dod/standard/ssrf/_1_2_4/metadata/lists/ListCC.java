package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.shared.Compartment;

/**
 * Enumerated values for fields using the ListCC type.
 * <p>
 * Used in {@link Compartment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListCC")
@XmlEnum
public enum ListCC {

  HCS("HCS"),
  COMINT("COMINT"),
  @XmlEnumValue("-GAMMA")
  __GAMMA("-GAMMA"),
  @XmlEnumValue("-ECI")
  __ECI("-ECI"),
  @XmlEnumValue("TALENT KEYHOLE")
  TALENT_KEYHOLE("TALENT KEYHOLE");
  private final String value;

  ListCC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCC fromValue(String v) {
    for (ListCC c : ListCC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
