package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF DIGESTCODE data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterDIGESTCODE extends AXmlAdapterString {

  public XmlAdapterDIGESTCODE() {
    super(1, 512, false, "[0-9A-F]{1,512}");
  }
}
