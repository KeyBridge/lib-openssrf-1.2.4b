package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.sspt.Stage4Srv;
import us.gov.dod.standard.ssrf._1_2_4.toa.AllocApp;

/**
 * Enumerated values for fields using the ListSN type.
 * <p>
 * Used in {@link AllocApp}, {@link Stage4Srv}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListSN")
@XmlEnum
public enum ListSN {

  AFS("AFS"),
  @XmlEnumValue("AM(OR)S")
  AM_OR_S("AM(OR)S"),
  @XmlEnumValue("AM(R)S")
  AM_R_S("AM(R)S"),
  AMS("AMS"),
  @XmlEnumValue("AMS(OR)S")
  AMS_OR_S("AMS(OR)S"),
  @XmlEnumValue("AMS(R)S")
  AMS_R_S("AMS(R)S"),
  AMSS("AMSS"),
  ARNS("ARNS"),
  ARNSS("ARNSS"),
  AS("AS"),
  ASS("ASS"),
  BS("BS"),
  BSS("BSS"),
  EESS("EESS"),
  FS("FS"),
  FSS("FSS"),
  ISS("ISS"),
  LMS("LMS"),
  LMSS("LMSS"),
  METAIDS("METAIDS"),
  METSS("METSS"),
  MMS("MMS"),
  MMSS("MMSS"),
  MRNS("MRNS"),
  MRNSS("MRNSS"),
  MS("MS"),
  MSS("MSS"),
  RAS("RAS"),
  RDS("RDS"),
  RDSS("RDSS"),
  RLS("RLS"),
  RLSS("RLSS"),
  RNS("RNS"),
  RNSS("RNSS"),
  SFTSS("SFTSS"),
  SFTSSS("SFTSSS"),
  SMRS("SMRS"),
  SOS("SOS"),
  SRS("SRS"),
  SS("SS");
  private final String value;

  ListSN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListSN fromValue(String v) {
    for (ListSN c : ListSN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
