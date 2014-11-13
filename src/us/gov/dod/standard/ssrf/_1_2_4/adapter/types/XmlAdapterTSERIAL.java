package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF TSERIAL data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterTSERIAL extends AXmlAdapterString {

  public XmlAdapterTSERIAL() {
    super(null, 28, false, "[A-Z0-9]{1,4}:\\w{0,4}:[A-Z]{2}:\\S{1,15}");
  }
}
