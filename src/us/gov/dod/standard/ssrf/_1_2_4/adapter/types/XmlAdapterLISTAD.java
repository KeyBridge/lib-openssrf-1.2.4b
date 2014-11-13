package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTAD data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTAD extends AXmlAdapterString {

  public XmlAdapterLISTAD() {
    super(null, 3, false, "DIR|ND|ROT|STR|SSH|SSV|TRK|UNK");
  }
}
