package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF FREQM data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterFREQM extends AXmlAdapterNumber {

  public XmlAdapterFREQM() {
    super(16, 6, 0, null);
  }
}
