package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ForceElement;

/**
 * Enumerated values for fields using the ListLC type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListLC")
@XmlEnum
public enum ListLC {

  A("A"),
  ACD("ACD"),
  @XmlEnumValue("ACS ")
  ACS__("ACS "),
  ACT("ACT"),
  ADM("ADM"),
  AF("AF"),
  AFY("AFY"),
  AGP("AGP"),
  AGY("AGY"),
  ANX("ANX"),
  AP("AP"),
  AR("AR"),
  ARO("ARO"),
  ARS("ARS"),
  AST("AST"),
  AUG("AUG"),
  B("B"),
  BAS("BAS"),
  BD("BD"),
  BDE("BDE"),
  BKS("BKS"),
  BLT("BLT"),
  BN("BN"),
  BND("BND"),
  BR("BR"),
  BSN("BSN"),
  BT("BT"),
  BTY("BTY"),
  BU("BU"),
  CAY("CAY"),
  CDC("CDC"),
  CEC("CEC"),
  CEP("CEP"),
  CGC("CGC"),
  CGE("CGE"),
  CLN("CLN"),
  CMD("CMD"),
  CMN("CMN"),
  CMP("CMP"),
  CO("CO"),
  CPS("CPS"),
  CRW("CRW"),
  CTP("CTP"),
  CTR("CTR"),
  DAO("DAO"),
  DAY("DAY"),
  DEP("DEP"),
  DET("DET"),
  DIR("DIR"),
  DIV("DIV"),
  DMB("DMB"),
  DMF("DMF"),
  DML("DML"),
  DMM("DMM"),
  DMP("DMP"),
  DMR("DMR"),
  DMT("DMT"),
  DMU("DMU"),
  DSP("DSP"),
  DST("DST"),
  DTL("DTL"),
  ELE("ELE"),
  FAC("FAC"),
  FAR("FAR"),
  FLO("FLO"),
  FLT("FLT"),
  FOA("FOA"),
  FOR("FOR"),
  FT("FT"),
  FTR("FTR"),
  GAR("GAR"),
  GRP("GRP"),
  HBD("HBD"),
  HHB("HHB"),
  HHC("HHC"),
  HHD("HHD"),
  HHS("HHS"),
  HHT("HHT"),
  HM("HM"),
  HMC("HMC"),
  HQ("HQ"),
  HQC("HQC"),
  HQD("HQD"),
  HQS("HQS"),
  HSB("HSB"),
  HSC("HSC"),
  HSP("HSP"),
  INS("INS"),
  ISP("ISP"),
  IST("IST"),
  LAB("LAB"),
  LIB("LIB"),
  MAA("MAA"),
  MAG("MAG"),
  MAW("MAW"),
  MEB("MEB"),
  MEF("MEF"),
  MER("MER"),
  MEU("MEU"),
  MF("MF"),
  MGR("MGR"),
  MGZ("MGZ"),
  MIS("MIS"),
  MSC("MSC"),
  MSF("MSF"),
  MTF("MTF"),
  MUS("MUS"),
  NSC("NSC"),
  NSL("NSL"),
  OBS("OBS"),
  ODC("ODC"),
  OFC("OFC"),
  OFF("OFF"),
  OIC("OIC"),
  OL("OL"),
  OMC("OMC"),
  PKG("PKG"),
  PKT("PKT"),
  PLN("PLN"),
  PLT("PLT"),
  PO("PO"),
  PRT("PRT"),
  PTY("PTY"),
  PVG("PVG"),
  RCT("RCT"),
  REG("REG"),
  REP("REP"),
  RES("RES"),
  RGN("RGN"),
  RGT("RGT"),
  RLT("RLT"),
  RNG("RNG"),
  SCH("SCH"),
  SCM("SCM"),
  SCO("SCO"),
  SCT("SCT"),
  SEC("SEC"),
  SHP("SHP"),
  SIP("SIP"),
  SQ("SQ"),
  SQD("SQD"),
  SS("SS"),
  SST("SST"),
  STA("STA"),
  STF("STF"),
  STP("STP"),
  STR("STR"),
  SU("SU"),
  SUP("SUP"),
  SVC("SVC"),
  SYD("SYD"),
  SYS("SYS"),
  TE("TE"),
  TF("TF"),
  TG("TG"),
  TM("TM"),
  TML("TML"),
  TRN("TRN"),
  TRP("TRP"),
  TU("TU"),
  U("U"),
  USS("USS"),
  WG("WG"),
  WKS("WKS");
  private final String value;

  ListLC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListLC fromValue(String v) {
    for (ListLC c : ListLC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
