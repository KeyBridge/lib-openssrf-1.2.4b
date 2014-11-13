package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Enumerated values for fields using the ListEB type.
 * <p>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListEB")
@XmlEnum
public enum ListEB {

  CD,
  D,
  H,
  HR,
  R,
  S,
  SR,
  SW,
  W,
  WR,
  XD,
  Z;

  public String value() {
    return name();
  }

  public static ListEB fromValue(String v) {
    return valueOf(v);
  }

}
