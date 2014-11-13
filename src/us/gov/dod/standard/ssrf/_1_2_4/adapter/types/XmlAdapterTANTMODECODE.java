package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF TANTMODECODE data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterTANTMODECODE extends AXmlAdapterString {

  public XmlAdapterTANTMODECODE() {
    super(null, null, false, "[0-9]{4}");
  }
}
