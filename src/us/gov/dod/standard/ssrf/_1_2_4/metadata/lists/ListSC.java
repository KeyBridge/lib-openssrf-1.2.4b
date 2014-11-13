package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.link.Config;
import us.gov.dod.standard.ssrf._1_2_4.toa.AllocApp;

/**
 * Enumerated values for fields using the ListSC type.
 * <p>
 * Used in {@link AllocApp}, {@link Config}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListSC")
@XmlEnum
public enum ListSC {

  AL("AL"),
  ALA("ALA"),
  ALB("ALB"),
  ALC("ALC"),
  ALG("ALG"),
  ALL("ALL"),
  ALO("ALO"),
  ALR("ALR"),
  ALS("ALS"),
  ALTM("ALTM"),
  ALTO("ALTO"),
  AM("AM"),
  AMA("AMA"),
  AT("AT"),
  BC("BC"),
  BT("BT"),
  CA("CA"),
  CO("CO"),
  CP("CP"),
  CR("CR"),
  CV("CV"),
  DGP("DGP"),
  @XmlEnumValue("E1")
  E_1("E1"),
  @XmlEnumValue("E2")
  E_2("E2"),
  @XmlEnumValue("E3")
  E_3("E3"),
  @XmlEnumValue("E4")
  E_4("E4"),
  EA("EA"),
  EB("EB"),
  EC("EC"),
  ED("ED"),
  EE("EE"),
  EF("EF"),
  EG("EG"),
  EH("EH"),
  EI("EI"),
  EJ("EJ"),
  EK("EK"),
  EM("EM"),
  EN("EN"),
  EO("EO"),
  EQ("EQ"),
  ER("ER"),
  ES("ES"),
  ET("ET"),
  EU("EU"),
  EV("EV"),
  EW("EW"),
  EX("EX"),
  EY("EY"),
  FA("FA"),
  FAB("FAB"),
  FAC("FAC"),
  FAD("FAD"),
  FAT("FAT"),
  FB("FB"),
  FBD("FBD"),
  FC("FC"),
  FCB("FCB"),
  FCD("FCD"),
  FD("FD"),
  FG("FG"),
  FL("FL"),
  FLD("FLD"),
  FLE("FLE"),
  FLEA("FLEA"),
  FLEB("FLEB"),
  FLEC("FLEC"),
  FLH("FLH"),
  FLU("FLU"),
  FP("FP"),
  FR("FR"),
  FS("FS"),
  FX("FX"),
  FXD("FXD"),
  FXE("FXE"),
  FXH("FXH"),
  GS("GS"),
  LR("LR"),
  MA("MA"),
  MAD("MAD"),
  MAP("MAP"),
  ME("ME"),
  ML("ML"),
  MLD("MLD"),
  MLP("MLP"),
  MO("MO"),
  MOB("MOB"),
  MOD("MOD"),
  MOE("MOE"),
  MOEA("MOEA"),
  MOEB("MOEB"),
  MOEC("MOEC"),
  MOH("MOH"),
  MOP("MOP"),
  MOU("MOU"),
  MR("MR"),
  MRP("MRP"),
  MS("MS"),
  MSD("MSD"),
  MSP("MSP"),
  MX("MX"),
  NL("NL"),
  NLC("NLC"),
  NLM("NLM"),
  NR("NR"),
  OD("OD"),
  OE("OE"),
  OT("OT"),
  PA("PA"),
  PL("PL"),
  PX("PX"),
  RA("RA"),
  RC("RC"),
  RD("RD"),
  RM("RM"),
  RN("RN"),
  RNL("RNL"),
  RT("RT"),
  SA("SA"),
  SAR("SAR"),
  SM("SM"),
  SMB("SMB"),
  SMD("SMD"),
  SMRG("SMRG"),
  SN("SN"),
  SP("SP"),
  SS("SS"),
  TA("TA"),
  TB("TB"),
  TC("TC"),
  TD("TD"),
  TE("TE"),
  TF("TF"),
  TG("TG"),
  TH("TH"),
  TI("TI"),
  TJ("TJ"),
  TK("TK"),
  TL("TL"),
  TM("TM"),
  TN("TN"),
  TO("TO"),
  TP("TP"),
  TQ("TQ"),
  TR("TR"),
  TS("TS"),
  TT("TT"),
  TU("TU"),
  TV("TV"),
  TW("TW"),
  TX("TX"),
  TY("TY"),
  TZ("TZ"),
  UA("UA"),
  UB("UB"),
  UD("UD"),
  UE("UE"),
  UH("UH"),
  UK("UK"),
  UM("UM"),
  UN("UN"),
  UR("UR"),
  UT("UT"),
  UV("UV"),
  UW("UW"),
  UY("UY"),
  VA("VA"),
  XC("XC"),
  XD("XD"),
  XE("XE"),
  XM("XM"),
  XR("XR"),
  XT("XT"),
  X("X");
  private final String value;

  ListSC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListSC fromValue(String v) {
    for (ListSC c : ListSC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
