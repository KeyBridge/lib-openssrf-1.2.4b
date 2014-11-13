package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTSE data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTSE extends AXmlAdapterString {

  public XmlAdapterLISTSE() {
    super(null, 5, false, "SN|SINAD|BER|MDS|MTR");
  }
}
