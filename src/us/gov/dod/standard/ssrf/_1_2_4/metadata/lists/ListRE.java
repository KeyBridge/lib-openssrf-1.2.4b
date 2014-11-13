package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.common.ExtReference;

/**
 * Enumerated values for fields using the ListRE type.
 * <p>
 * Used in {@link ExtReference}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListRE")
@XmlEnum
public enum ListRE {

  CONTR,
  DBRET,
  DOCU,
  ECSA,
  EMAIL,
  ENGIN,
  EWIR,
  FCC,
  INDUS,
  INTFR,
  ITUNO,
  JAWES,
  LICEN,
  MIPI,
  NAT,
  NOMEN,
  SIN,
  SPS,
  STD,
  TECH,
  URI;

  public String value() {
    return name();
  }

  public static ListRE fromValue(String v) {
    return valueOf(v);
  }

}
