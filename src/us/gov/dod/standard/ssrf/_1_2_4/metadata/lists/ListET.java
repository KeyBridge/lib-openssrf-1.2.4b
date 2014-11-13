package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ForceElement;

/**
 * Enumerated values for fields using the ListET type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListET")
@XmlEnum
public enum ListET {

  AA,
  AH,
  AV,
  F,
  LA,
  LN,
  LT,
  MA,
  ML,
  MW,
  UV,
  VA,
  VH,
  VP,
  WAA,
  WAB,
  WAC,
  WAD,
  WAE,
  WCA,
  WCB,
  WCC,
  WCD,
  WCE,
  WCF,
  WCG,
  WMA,
  WMB,
  WSA,
  WSB,
  WSC,
  WSD,
  WSE,
  WSF,
  WSG,
  WTA,
  WTB,
  WTC,
  WTD,
  WDE,
  WTF,
  WTG,
  WTH,
  WTI,
  WTJ,
  WTK,
  WTL,
  WTM,
  WTN,
  WTO,
  WTP,
  WTQ,
  WTR,
  WUA,
  WUB,
  WUC,
  WXA,
  WXB,
  WXC,
  WXD,
  WZA;

  public String value() {
    return name();
  }

  public static ListET fromValue(String v) {
    return valueOf(v);
  }

}
