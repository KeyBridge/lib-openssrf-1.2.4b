package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTIR data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTIR extends AXmlAdapterString {

  public XmlAdapterLISTIR() {
    super(null, 1, false, "R|U|I|O|P|M|N|S|Y");
  }
}
