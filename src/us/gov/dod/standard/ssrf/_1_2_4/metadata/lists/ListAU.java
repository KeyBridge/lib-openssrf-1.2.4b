package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Antenna;
import us.gov.dod.standard.ssrf._1_2_4.txrx.TxRx;

/**
 * Enumerated values for fields using the ListAU type.
 * <p>
 * Used in {@link Antenna}, {@link TxRx}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListAU")
@XmlEnum
public enum ListAU {

  T,
  R,
  TR;

  public String value() {
    return name();
  }

  public static ListAU fromValue(String v) {
    return valueOf(v);
  }

}
