package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.allotment.AsgnType;

/**
 * Enumerated values for fields using the ListCA type.
 * <p>
 * Used in {@link AsgnType}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListCA")
@XmlEnum
public enum ListCA {

  HF,
  NAV,
  OTHER,
  UHFAMS,
  VHFAMS;

  public String value() {
    return name();
  }

  public static ListCA fromValue(String v) {
    return valueOf(v);
  }

}
