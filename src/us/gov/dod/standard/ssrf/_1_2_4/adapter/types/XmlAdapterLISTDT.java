package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTDT data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTDT extends AXmlAdapterString {

  public XmlAdapterLISTDT() {
    super(null, 2, false, "AL|AN|AS|BS|CD|CE|CL|CN|CR|DE|DI|DP|DR|EX|FD|FE|HD|HO|IF|IM|JR|LA|LG|LT|MS|NT|OR|RA|RC|RH|RM|RN|RO|RP|RR|RT|RU|RV|SD|SR|TA|TR");
  }
}
