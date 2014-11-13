package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTTT data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTTT extends AXmlAdapterString {

  public XmlAdapterLISTTT() {
    super(null, 6, false, "TELCIV|TELMIL|TELOTH|FAXCIV|FAXMIL|FAXOTH");
  }
}
