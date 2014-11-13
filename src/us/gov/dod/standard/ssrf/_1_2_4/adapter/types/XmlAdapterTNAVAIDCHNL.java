package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF TNAVAIDCHNL data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterTNAVAIDCHNL extends AXmlAdapterString {

  public XmlAdapterTNAVAIDCHNL() {
    super(null, null, false, "[0-1][0-9]{2}(X|Y|W|Z)");
  }
}
