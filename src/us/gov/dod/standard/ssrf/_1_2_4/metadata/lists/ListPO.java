package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.antenna.Pol;
import us.gov.dod.standard.ssrf._1_2_4.refdata.AntSpec;

/**
 * Enumerated values for fields using the ListPO type.
 * <p>
 * Used in {@link AntSpec}, {@link Pol}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListPO")
@XmlEnum
public enum ListPO {

  @XmlEnumValue("45")
  FOUR_5("45"),
  @XmlEnumValue("CL")
  CL("CL"),
  @XmlEnumValue("CR")
  CR("CR"),
  @XmlEnumValue("D")
  D("D"),
  @XmlEnumValue("E")
  E("E"),
  @XmlEnumValue("EL")
  EL("EL"),
  @XmlEnumValue("ER")
  ER("ER"),
  @XmlEnumValue("H")
  H("H"),
  @XmlEnumValue("HV")
  HV("HV"),
  @XmlEnumValue("L")
  L("L"),
  @XmlEnumValue("M")
  M("M"),
  @XmlEnumValue("O")
  O("O"),
  @XmlEnumValue("R")
  R("R"),
  @XmlEnumValue("SL")
  SL("SL"),
  @XmlEnumValue("SR")
  SR("SR"),
  @XmlEnumValue("TC")
  TC("TC"),
  @XmlEnumValue("V")
  V("V"),
  @XmlEnumValue("X")
  X("X");

  private final String value;

  ListPO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListPO fromValue(String v) {
    for (ListPO c : ListPO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
