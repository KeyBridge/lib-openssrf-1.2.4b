package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTPR data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTPR extends AXmlAdapterString {

  public XmlAdapterLISTPR() {
    super(null, 6, false, "DFNORM|DFHIGH|P[012][23]S[235]O|P[012]HARM|VHF|UHF");
  }
}
