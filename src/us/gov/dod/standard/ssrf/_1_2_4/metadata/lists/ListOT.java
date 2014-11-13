package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.txrx.OutputDevice;

/**
 * Enumerated values for fields using the ListOT type.
 * <p>
 * Used in {@link OutputDevice}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListOT")
@XmlEnum
public enum ListOT {

  A,
  AA,
  AB,
  B,
  C,
  E,
  F,
  FF,
  G,
  H,
  I,
  J,
  K,
  N,
  O,
  P,
  PF,
  Q,
  R,
  S,
  T,
  U,
  V,
  W,
  YY,
  Z;

  public String value() {
    return name();
  }

  public static ListOT fromValue(String v) {
    return valueOf(v);
  }

}
