package us.gov.dod.standard.ssrf._1_2_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.administrative.Codes;
import us.gov.dod.standard.ssrf._1_2_4.administrative.Deletion;
import us.gov.dod.standard.ssrf._1_2_4.administrative.Response;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.BSMPlan;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.CEOI;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.Dictionary;
import us.gov.dod.standard.ssrf._1_2_4.common.ExtReference;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.Route;
import us.gov.dod.standard.ssrf._1_2_4.interference.IntfMitigation;
import us.gov.dod.standard.ssrf._1_2_4.location.LocationSet;
import us.gov.dod.standard.ssrf._1_2_4.refdata.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Compartment;
import us.gov.dod.standard.ssrf._1_2_4.shared.Remarks;
import us.gov.dod.standard.ssrf._1_2_4.sspt.OpClearance;
import us.gov.dod.standard.ssrf._1_2_4.sspt.OpClearanceRequest;
import us.gov.dod.standard.ssrf._1_2_4.ssrf.Header;
import us.gov.dod.standard.ssrf._1_2_4.txrx.SignalDescr;
import us.gov.dod.standard.ssrf._1_2_4.txrx.TxRx;

/**
 * SSRF
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
  "header",
  "body"
})
@XmlRootElement(name = "SSRF")
public class SSRF {

  @XmlElement(name = "Header", required = true)
  protected Header header;

  @XmlElement(name = "Body", required = true)
  protected SSRF.Body body;

  /**
   * Get
   * <p>
   * @return a {@link Header} instance
   * @since 3.1.0
   */
  public Header getHeader() {
    return header;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Header} instance
   * @since 3.1.0
   */
  public void setHeader(Header value) {
    this.header = value;
  }

  public boolean isSetHeader() {
    return (this.header != null);
  }

  public SSRF.Body getBody() {
    return body;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SSRF} instance
   * @since 3.1.0
   */
  public void setBody(SSRF.Body value) {
    this.body = value;
  }

  public boolean isSetBody() {
    return (this.body != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Header}
   * @return The current SSRF object instance
   * @since 3.1.0
   */
  public SSRF withHeader(Header value) {
    setHeader(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SSRF.Body}
   * @return The current SSRF object instance
   * @since 3.1.0
   */
  public SSRF withBody(SSRF.Body value) {
    setBody(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "compartment",
    "remarks",
    "extReference",
    "deletion",
    "administrative",
    "response",
    "codes",
    "note",
    "bandUser",
    "bandApplication",
    "antStd",
    "chnlPlan",
    "coordStd",
    "curveStd",
    "emsMaskStd",
    "emsStd",
    "rxStd",
    "organisation",
    "contact",
    "role",
    "location",
    "locationSet",
    "toa",
    "signalDescr",
    "txRx",
    "antenna",
    "ssRequest",
    "ssReply",
    "asgnAllot",
    "intfReport",
    "intfMitigation",
    "jrfl",
    "route",
    "forceElement",
    "feDeployment",
    "bsmPlan",
    "dictionary",
    "ceoi",
    "opClearanceRequest",
    "opClearance"
  })
  @SuppressWarnings("PublicInnerClass")
  public static class Body {

    @XmlElement(name = "Compartment")
    protected Set<Compartment> compartment;
    /**
     * remarks - Links to Data Item Remarks (Optional)
     * <p>
     * A list of Common/Remarks idx values applicable to the current data item.
     * <p>
     * Format is List of UN6
     * <p>
     * @since 3.1.0
     */
    @XmlElement(name = "Remarks")
    protected Set<Remarks> remarks;
    /**
     * extReferences - Links to External References (Optional)
     * <p>
     * A list of Conmmon/ExtReferenceRef idx values applicable to the current
     * data item.
     * <p>
     * Format is List of UN6
     * <p>
     * @since 3.1.0
     */
    @XmlElement(name = "ExtReference")
    protected Set<ExtReference> extReference;

    @XmlElement(name = "Deletion")
    protected Set<Deletion> deletion;

    @XmlElement(name = "Administrative")
    protected Set<Administrative> administrative;

    @XmlElement(name = "Response")
    protected Set<Response> response;

    @XmlElement(name = "Codes")
    protected Set<Codes> codes;

    @XmlElement(name = "Note")
    protected Set<Note> note;

    @XmlElement(name = "BandUser")
    protected Set<BandUser> bandUser;

    @XmlElement(name = "BandApplication")
    protected Set<BandApplication> bandApplication;

    @XmlElement(name = "AntStd")
    protected Set<AntStd> antStd;

    @XmlElement(name = "ChnlPlan")
    protected Set<ChnlPlan> chnlPlan;

    @XmlElement(name = "CoordStd")
    protected Set<CoordStd> coordStd;

    @XmlElement(name = "CurveStd")
    protected Set<CurveStd> curveStd;

    @XmlElement(name = "EmsMaskStd")
    protected Set<EmsMaskStd> emsMaskStd;

    @XmlElement(name = "EmsStd")
    protected Set<EmsStd> emsStd;

    @XmlElement(name = "RxStd")
    protected Set<RxStd> rxStd;

    @XmlElement(name = "Organisation")
    protected Set<Organisation> organisation;

    @XmlElement(name = "Contact")
    protected Set<Contact> contact;

    @XmlElement(name = "Role")
    protected Set<Role> role;

    @XmlElement(name = "Location")
    protected Set<Location> location;

    @XmlElement(name = "LocationSet")
    protected Set<LocationSet> locationSet;

    @XmlElement(name = "TOA")
    protected Set<TOA> toa;

    @XmlElement(name = "SignalDescr")
    protected Set<SignalDescr> signalDescr;

    @XmlElement(name = "TxRx")
    protected Set<TxRx> txRx;

    @XmlElement(name = "Antenna")
    protected Set<Antenna> antenna;

    @XmlElement(name = "SSRequest")
    protected Set<SSRequest> ssRequest;

    @XmlElement(name = "SSReply")
    protected Set<SSReply> ssReply;

    @XmlElement(name = "AsgnAllot")
    protected Set<AsgnAllot> asgnAllot;

    @XmlElement(name = "IntfReport")
    protected Set<IntfReport> intfReport;

    @XmlElement(name = "IntfMitigation")
    protected Set<IntfMitigation> intfMitigation;

    @XmlElement(name = "JRFL")
    protected Set<JRFL> jrfl;

    @XmlElement(name = "Route")
    protected Set<Route> route;

    @XmlElement(name = "ForceElement")
    protected Set<ForceElement> forceElement;

    @XmlElement(name = "FEDeployment")
    protected Set<FEDeployment> feDeployment;

    @XmlElement(name = "BSMPlan")
    protected Set<BSMPlan> bsmPlan;

    @XmlElement(name = "Dictionary")
    protected Set<Dictionary> dictionary;

    @XmlElement(name = "CEOI")
    protected Set<CEOI> ceoi;

    @XmlElement(name = "OpClearanceRequest")
    protected Set<OpClearanceRequest> opClearanceRequest;

    @XmlElement(name = "OpClearance")
    protected Set<OpClearance> opClearance;

    /**
     * Get
     * <p>
     * @return a {@link Compartment} instance
     * @since 3.1.0
     */
    public Set<Compartment> getCompartment() {
      if (compartment == null) {
        compartment = new HashSet<>();
      }
      return this.compartment;
    }

    public boolean isSetCompartment() {
      return ((this.compartment != null) && (!this.compartment.isEmpty()));
    }

    /**
     * Clear the Compartment field. This sets the field to null.
     */
    public void unsetCompartment() {
      this.compartment = null;
    }

    /**
     * Get a list of Common/Remarks idx values applicable to the current data
     * item.
     * <p>
     * @return a {@link Remarks} instance
     * @since 3.1.0
     */
    public Set<Remarks> getRemarks() {
      if (remarks == null) {
        remarks = new HashSet<>();
      }
      return this.remarks;
    }

    public boolean isSetRemarks() {
      return ((this.remarks != null) && (!this.remarks.isEmpty()));
    }

    /**
     * Clear the Remarks field. This sets the field to null.
     */
    public void unsetRemarks() {
      this.remarks = null;
    }

    /**
     * Get a list of Conmmon/ExtReferenceRef idx values applicable to the
     * current data item.
     * <p>
     * @return a {@link ExtReference} instance
     * @since 3.1.0
     */
    public Set<ExtReference> getExtReference() {
      if (extReference == null) {
        extReference = new HashSet<>();
      }
      return this.extReference;
    }

    public boolean isSetExtReference() {
      return ((this.extReference != null) && (!this.extReference.isEmpty()));
    }

    /**
     * Clear the ExtReference field. This sets the field to null.
     */
    public void unsetExtReference() {
      this.extReference = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Deletion} instance
     * @since 3.1.0
     */
    public Set<Deletion> getDeletion() {
      if (deletion == null) {
        deletion = new HashSet<>();
      }
      return this.deletion;
    }

    public boolean isSetDeletion() {
      return ((this.deletion != null) && (!this.deletion.isEmpty()));
    }

    /**
     * Clear the Deletion field. This sets the field to null.
     */
    public void unsetDeletion() {
      this.deletion = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Administrative} instance
     * @since 3.1.0
     */
    public Set<Administrative> getAdministrative() {
      if (administrative == null) {
        administrative = new HashSet<>();
      }
      return this.administrative;
    }

    public boolean isSetAdministrative() {
      return ((this.administrative != null) && (!this.administrative.isEmpty()));
    }

    /**
     * Clear the Administrative field. This sets the field to null.
     */
    public void unsetAdministrative() {
      this.administrative = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Response} instance
     * @since 3.1.0
     */
    public Set<Response> getResponse() {
      if (response == null) {
        response = new HashSet<>();
      }
      return this.response;
    }

    public boolean isSetResponse() {
      return ((this.response != null) && (!this.response.isEmpty()));
    }

    /**
     * Clear the Response field. This sets the field to null.
     */
    public void unsetResponse() {
      this.response = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Codes} instance
     * @since 3.1.0
     */
    public Set<Codes> getCodes() {
      if (codes == null) {
        codes = new HashSet<>();
      }
      return this.codes;
    }

    public boolean isSetCodes() {
      return ((this.codes != null) && (!this.codes.isEmpty()));
    }

    /**
     * Clear the Codes field. This sets the field to null.
     */
    public void unsetCodes() {
      this.codes = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Note} instance
     * @since 3.1.0
     */
    public Set<Note> getNote() {
      if (note == null) {
        note = new HashSet<>();
      }
      return this.note;
    }

    public boolean isSetNote() {
      return ((this.note != null) && (!this.note.isEmpty()));
    }

    /**
     * Clear the Note field. This sets the field to null.
     */
    public void unsetNote() {
      this.note = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link BandUser} instance
     * @since 3.1.0
     */
    public Set<BandUser> getBandUser() {
      if (bandUser == null) {
        bandUser = new HashSet<>();
      }
      return this.bandUser;
    }

    public boolean isSetBandUser() {
      return ((this.bandUser != null) && (!this.bandUser.isEmpty()));
    }

    /**
     * Clear the BandUser field. This sets the field to null.
     */
    public void unsetBandUser() {
      this.bandUser = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link BandApplication} instance
     * @since 3.1.0
     */
    public Set<BandApplication> getBandApplication() {
      if (bandApplication == null) {
        bandApplication = new HashSet<>();
      }
      return this.bandApplication;
    }

    public boolean isSetBandApplication() {
      return ((this.bandApplication != null) && (!this.bandApplication.isEmpty()));
    }

    /**
     * Clear the BandApplication field. This sets the field to null.
     */
    public void unsetBandApplication() {
      this.bandApplication = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link AntStd} instance
     * @since 3.1.0
     */
    public Set<AntStd> getAntStd() {
      if (antStd == null) {
        antStd = new HashSet<>();
      }
      return this.antStd;
    }

    public boolean isSetAntStd() {
      return ((this.antStd != null) && (!this.antStd.isEmpty()));
    }

    /**
     * Clear the AntStd field. This sets the field to null.
     */
    public void unsetAntStd() {
      this.antStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link ChnlPlan} instance
     * @since 3.1.0
     */
    public Set<ChnlPlan> getChnlPlan() {
      if (chnlPlan == null) {
        chnlPlan = new HashSet<>();
      }
      return this.chnlPlan;
    }

    public boolean isSetChnlPlan() {
      return ((this.chnlPlan != null) && (!this.chnlPlan.isEmpty()));
    }

    /**
     * Clear the ChnlPlan field. This sets the field to null.
     */
    public void unsetChnlPlan() {
      this.chnlPlan = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link CoordStd} instance
     * @since 3.1.0
     */
    public Set<CoordStd> getCoordStd() {
      if (coordStd == null) {
        coordStd = new HashSet<>();
      }
      return this.coordStd;
    }

    public boolean isSetCoordStd() {
      return ((this.coordStd != null) && (!this.coordStd.isEmpty()));
    }

    /**
     * Clear the CoordStd field. This sets the field to null.
     */
    public void unsetCoordStd() {
      this.coordStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link CurveStd} instance
     * @since 3.1.0
     */
    public Set<CurveStd> getCurveStd() {
      if (curveStd == null) {
        curveStd = new HashSet<>();
      }
      return this.curveStd;
    }

    public boolean isSetCurveStd() {
      return ((this.curveStd != null) && (!this.curveStd.isEmpty()));
    }

    /**
     * Clear the CurveStd field. This sets the field to null.
     */
    public void unsetCurveStd() {
      this.curveStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link EmsMaskStd} instance
     * @since 3.1.0
     */
    public Set<EmsMaskStd> getEmsMaskStd() {
      if (emsMaskStd == null) {
        emsMaskStd = new HashSet<>();
      }
      return this.emsMaskStd;
    }

    public boolean isSetEmsMaskStd() {
      return ((this.emsMaskStd != null) && (!this.emsMaskStd.isEmpty()));
    }

    /**
     * Clear the EmsMaskStd field. This sets the field to null.
     */
    public void unsetEmsMaskStd() {
      this.emsMaskStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link EmsStd} instance
     * @since 3.1.0
     */
    public Set<EmsStd> getEmsStd() {
      if (emsStd == null) {
        emsStd = new HashSet<>();
      }
      return this.emsStd;
    }

    public boolean isSetEmsStd() {
      return ((this.emsStd != null) && (!this.emsStd.isEmpty()));
    }

    /**
     * Clear the EmsStd field. This sets the field to null.
     */
    public void unsetEmsStd() {
      this.emsStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link RxStd} instance
     * @since 3.1.0
     */
    public Set<RxStd> getRxStd() {
      if (rxStd == null) {
        rxStd = new HashSet<>();
      }
      return this.rxStd;
    }

    public boolean isSetRxStd() {
      return ((this.rxStd != null) && (!this.rxStd.isEmpty()));
    }

    /**
     * Clear the RxStd field. This sets the field to null.
     */
    public void unsetRxStd() {
      this.rxStd = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Organisation} instance
     * @since 3.1.0
     */
    public Set<Organisation> getOrganisation() {
      if (organisation == null) {
        organisation = new HashSet<>();
      }
      return this.organisation;
    }

    public boolean isSetOrganisation() {
      return ((this.organisation != null) && (!this.organisation.isEmpty()));
    }

    /**
     * Clear the Organisation field. This sets the field to null.
     */
    public void unsetOrganisation() {
      this.organisation = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Contact} instance
     * @since 3.1.0
     */
    public Set<Contact> getContact() {
      if (contact == null) {
        contact = new HashSet<>();
      }
      return this.contact;
    }

    public boolean isSetContact() {
      return ((this.contact != null) && (!this.contact.isEmpty()));
    }

    /**
     * Clear the Contact field. This sets the field to null.
     */
    public void unsetContact() {
      this.contact = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Role} instance
     * @since 3.1.0
     */
    public Set<Role> getRole() {
      if (role == null) {
        role = new HashSet<>();
      }
      return this.role;
    }

    public boolean isSetRole() {
      return ((this.role != null) && (!this.role.isEmpty()));
    }

    /**
     * Clear the Role field. This sets the field to null.
     */
    public void unsetRole() {
      this.role = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Location} instance
     * @since 3.1.0
     */
    public Set<Location> getLocation() {
      if (location == null) {
        location = new HashSet<>();
      }
      return this.location;
    }

    public boolean isSetLocation() {
      return ((this.location != null) && (!this.location.isEmpty()));
    }

    /**
     * Clear the Location field. This sets the field to null.
     */
    public void unsetLocation() {
      this.location = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link LocationSet} instance
     * @since 3.1.0
     */
    public Set<LocationSet> getLocationSet() {
      if (locationSet == null) {
        locationSet = new HashSet<>();
      }
      return this.locationSet;
    }

    public boolean isSetLocationSet() {
      return ((this.locationSet != null) && (!this.locationSet.isEmpty()));
    }

    /**
     * Clear the LocationSet field. This sets the field to null.
     */
    public void unsetLocationSet() {
      this.locationSet = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link TOA} instance
     * @since 3.1.0
     */
    public Set<TOA> getTOA() {
      if (toa == null) {
        toa = new HashSet<>();
      }
      return this.toa;
    }

    public boolean isSetTOA() {
      return ((this.toa != null) && (!this.toa.isEmpty()));
    }

    /**
     * Clear the TOA field. This sets the field to null.
     */
    public void unsetTOA() {
      this.toa = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link SignalDescr} instance
     * @since 3.1.0
     */
    public Set<SignalDescr> getSignalDescr() {
      if (signalDescr == null) {
        signalDescr = new HashSet<>();
      }
      return this.signalDescr;
    }

    public boolean isSetSignalDescr() {
      return ((this.signalDescr != null) && (!this.signalDescr.isEmpty()));
    }

    /**
     * Clear the SignalDescr field. This sets the field to null.
     */
    public void unsetSignalDescr() {
      this.signalDescr = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link TxRx} instance
     * @since 3.1.0
     */
    public Set<TxRx> getTxRx() {
      if (txRx == null) {
        txRx = new HashSet<>();
      }
      return this.txRx;
    }

    public boolean isSetTxRx() {
      return ((this.txRx != null) && (!this.txRx.isEmpty()));
    }

    /**
     * Clear the TxRx field. This sets the field to null.
     */
    public void unsetTxRx() {
      this.txRx = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Antenna} instance
     * @since 3.1.0
     */
    public Set<Antenna> getAntenna() {
      if (antenna == null) {
        antenna = new HashSet<>();
      }
      return this.antenna;
    }

    public boolean isSetAntenna() {
      return ((this.antenna != null) && (!this.antenna.isEmpty()));
    }

    /**
     * Clear the Antenna field. This sets the field to null.
     */
    public void unsetAntenna() {
      this.antenna = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link SSRequest} instance
     * @since 3.1.0
     */
    public Set<SSRequest> getSSRequest() {
      if (ssRequest == null) {
        ssRequest = new HashSet<>();
      }
      return this.ssRequest;
    }

    public boolean isSetSSRequest() {
      return ((this.ssRequest != null) && (!this.ssRequest.isEmpty()));
    }

    /**
     * Clear the SSRequest field. This sets the field to null.
     */
    public void unsetSSRequest() {
      this.ssRequest = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link SSReply} instance
     * @since 3.1.0
     */
    public Set<SSReply> getSSReply() {
      if (ssReply == null) {
        ssReply = new HashSet<>();
      }
      return this.ssReply;
    }

    public boolean isSetSSReply() {
      return ((this.ssReply != null) && (!this.ssReply.isEmpty()));
    }

    /**
     * Clear the SSReply field. This sets the field to null.
     */
    public void unsetSSReply() {
      this.ssReply = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link AsgnAllot} instance
     * @since 3.1.0
     */
    public Set<AsgnAllot> getAsgnAllot() {
      if (asgnAllot == null) {
        asgnAllot = new HashSet<>();
      }
      return this.asgnAllot;
    }

    public boolean isSetAsgnAllot() {
      return ((this.asgnAllot != null) && (!this.asgnAllot.isEmpty()));
    }

    /**
     * Clear the AsgnAllot field. This sets the field to null.
     */
    public void unsetAsgnAllot() {
      this.asgnAllot = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link IntfReport} instance
     * @since 3.1.0
     */
    public Set<IntfReport> getIntfReport() {
      if (intfReport == null) {
        intfReport = new HashSet<>();
      }
      return this.intfReport;
    }

    public boolean isSetIntfReport() {
      return ((this.intfReport != null) && (!this.intfReport.isEmpty()));
    }

    /**
     * Clear the IntfReport field. This sets the field to null.
     */
    public void unsetIntfReport() {
      this.intfReport = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link IntfMitigation} instance
     * @since 3.1.0
     */
    public Set<IntfMitigation> getIntfMitigation() {
      if (intfMitigation == null) {
        intfMitigation = new HashSet<>();
      }
      return this.intfMitigation;
    }

    public boolean isSetIntfMitigation() {
      return ((this.intfMitigation != null) && (!this.intfMitigation.isEmpty()));
    }

    /**
     * Clear the IntfMitigation field. This sets the field to null.
     */
    public void unsetIntfMitigation() {
      this.intfMitigation = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link JRFL} instance
     * @since 3.1.0
     */
    public Set<JRFL> getJRFL() {
      if (jrfl == null) {
        jrfl = new HashSet<>();
      }
      return this.jrfl;
    }

    public boolean isSetJRFL() {
      return ((this.jrfl != null) && (!this.jrfl.isEmpty()));
    }

    /**
     * Clear the JRFL field. This sets the field to null.
     */
    public void unsetJRFL() {
      this.jrfl = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Route} instance
     * @since 3.1.0
     */
    public Set<Route> getRoute() {
      if (route == null) {
        route = new HashSet<>();
      }
      return this.route;
    }

    public boolean isSetRoute() {
      return ((this.route != null) && (!this.route.isEmpty()));
    }

    /**
     * Clear the Route field. This sets the field to null.
     */
    public void unsetRoute() {
      this.route = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link ForceElement} instance
     * @since 3.1.0
     */
    public Set<ForceElement> getForceElement() {
      if (forceElement == null) {
        forceElement = new HashSet<>();
      }
      return this.forceElement;
    }

    public boolean isSetForceElement() {
      return ((this.forceElement != null) && (!this.forceElement.isEmpty()));
    }

    /**
     * Clear the ForceElement field. This sets the field to null.
     */
    public void unsetForceElement() {
      this.forceElement = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link FEDeployment} instance
     * @since 3.1.0
     */
    public Set<FEDeployment> getFEDeployment() {
      if (feDeployment == null) {
        feDeployment = new HashSet<>();
      }
      return this.feDeployment;
    }

    public boolean isSetFEDeployment() {
      return ((this.feDeployment != null) && (!this.feDeployment.isEmpty()));
    }

    /**
     * Clear the FEDeployment field. This sets the field to null.
     */
    public void unsetFEDeployment() {
      this.feDeployment = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link BSMPlan} instance
     * @since 3.1.0
     */
    public Set<BSMPlan> getBSMPlan() {
      if (bsmPlan == null) {
        bsmPlan = new HashSet<>();
      }
      return this.bsmPlan;
    }

    public boolean isSetBSMPlan() {
      return ((this.bsmPlan != null) && (!this.bsmPlan.isEmpty()));
    }

    /**
     * Clear the BSMPlan field. This sets the field to null.
     */
    public void unsetBSMPlan() {
      this.bsmPlan = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link Dictionary} instance
     * @since 3.1.0
     */
    public Set<Dictionary> getDictionary() {
      if (dictionary == null) {
        dictionary = new HashSet<>();
      }
      return this.dictionary;
    }

    public boolean isSetDictionary() {
      return ((this.dictionary != null) && (!this.dictionary.isEmpty()));
    }

    /**
     * Clear the Dictionary field. This sets the field to null.
     */
    public void unsetDictionary() {
      this.dictionary = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link CEOI} instance
     * @since 3.1.0
     */
    public Set<CEOI> getCEOI() {
      if (ceoi == null) {
        ceoi = new HashSet<>();
      }
      return this.ceoi;
    }

    public boolean isSetCEOI() {
      return ((this.ceoi != null) && (!this.ceoi.isEmpty()));
    }

    /**
     * Clear the CEOI field. This sets the field to null.
     */
    public void unsetCEOI() {
      this.ceoi = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link OpClearanceRequest} instance
     * @since 3.1.0
     */
    public Set<OpClearanceRequest> getOpClearanceRequest() {
      if (opClearanceRequest == null) {
        opClearanceRequest = new HashSet<>();
      }
      return this.opClearanceRequest;
    }

    public boolean isSetOpClearanceRequest() {
      return ((this.opClearanceRequest != null) && (!this.opClearanceRequest.isEmpty()));
    }

    /**
     * Clear the OpClearanceRequest field. This sets the field to null.
     */
    public void unsetOpClearanceRequest() {
      this.opClearanceRequest = null;
    }

    /**
     * Get
     * <p>
     * @return a {@link OpClearance} instance
     * @since 3.1.0
     */
    public Set<OpClearance> getOpClearance() {
      if (opClearance == null) {
        opClearance = new HashSet<>();
      }
      return this.opClearance;
    }

    public boolean isSetOpClearance() {
      return ((this.opClearance != null) && (!this.opClearance.isEmpty()));
    }

    /**
     * Clear the OpClearance field. This sets the field to null.
     */
    public void unsetOpClearance() {
      this.opClearance = null;
    }

    public SSRF.Body withCompartment(Compartment... values) {
      if (values != null) {
        getCompartment().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withCompartment(Collection<Compartment> values) {
      if (values != null) {
        getCompartment().addAll(values);
      }
      return this;
    }

    public SSRF.Body withRemarks(Remarks... values) {
      if (values != null) {
        getRemarks().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withRemarks(Collection<Remarks> values) {
      if (values != null) {
        getRemarks().addAll(values);
      }
      return this;
    }

    public SSRF.Body withExtReference(ExtReference... values) {
      if (values != null) {
        getExtReference().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withExtReference(Collection<ExtReference> values) {
      if (values != null) {
        getExtReference().addAll(values);
      }
      return this;
    }

    public SSRF.Body withDeletion(Deletion... values) {
      if (values != null) {
        getDeletion().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withDeletion(Collection<Deletion> values) {
      if (values != null) {
        getDeletion().addAll(values);
      }
      return this;
    }

    public SSRF.Body withAdministrative(Administrative... values) {
      if (values != null) {
        getAdministrative().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withAdministrative(Collection<Administrative> values) {
      if (values != null) {
        getAdministrative().addAll(values);
      }
      return this;
    }

    public SSRF.Body withResponse(Response... values) {
      if (values != null) {
        getResponse().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withResponse(Collection<Response> values) {
      if (values != null) {
        getResponse().addAll(values);
      }
      return this;
    }

    public SSRF.Body withCodes(Codes... values) {
      if (values != null) {
        getCodes().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withCodes(Collection<Codes> values) {
      if (values != null) {
        getCodes().addAll(values);
      }
      return this;
    }

    public SSRF.Body withNote(Note... values) {
      if (values != null) {
        getNote().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withNote(Collection<Note> values) {
      if (values != null) {
        getNote().addAll(values);
      }
      return this;
    }

    public SSRF.Body withBandUser(BandUser... values) {
      if (values != null) {
        getBandUser().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withBandUser(Collection<BandUser> values) {
      if (values != null) {
        getBandUser().addAll(values);
      }
      return this;
    }

    public SSRF.Body withBandApplication(BandApplication... values) {
      if (values != null) {
        getBandApplication().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withBandApplication(Collection<BandApplication> values) {
      if (values != null) {
        getBandApplication().addAll(values);
      }
      return this;
    }

    public SSRF.Body withAntStd(AntStd... values) {
      if (values != null) {
        getAntStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withAntStd(Collection<AntStd> values) {
      if (values != null) {
        getAntStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withChnlPlan(ChnlPlan... values) {
      if (values != null) {
        getChnlPlan().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withChnlPlan(Collection<ChnlPlan> values) {
      if (values != null) {
        getChnlPlan().addAll(values);
      }
      return this;
    }

    public SSRF.Body withCoordStd(CoordStd... values) {
      if (values != null) {
        getCoordStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withCoordStd(Collection<CoordStd> values) {
      if (values != null) {
        getCoordStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withCurveStd(CurveStd... values) {
      if (values != null) {
        getCurveStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withCurveStd(Collection<CurveStd> values) {
      if (values != null) {
        getCurveStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withEmsMaskStd(EmsMaskStd... values) {
      if (values != null) {
        getEmsMaskStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withEmsMaskStd(Collection<EmsMaskStd> values) {
      if (values != null) {
        getEmsMaskStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withEmsStd(EmsStd... values) {
      if (values != null) {
        getEmsStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withEmsStd(Collection<EmsStd> values) {
      if (values != null) {
        getEmsStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withRxStd(RxStd... values) {
      if (values != null) {
        getRxStd().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withRxStd(Collection<RxStd> values) {
      if (values != null) {
        getRxStd().addAll(values);
      }
      return this;
    }

    public SSRF.Body withOrganisation(Organisation... values) {
      if (values != null) {
        getOrganisation().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withOrganisation(Collection<Organisation> values) {
      if (values != null) {
        getOrganisation().addAll(values);
      }
      return this;
    }

    public SSRF.Body withContact(Contact... values) {
      if (values != null) {
        getContact().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withContact(Collection<Contact> values) {
      if (values != null) {
        getContact().addAll(values);
      }
      return this;
    }

    public SSRF.Body withRole(Role... values) {
      if (values != null) {
        getRole().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withRole(Collection<Role> values) {
      if (values != null) {
        getRole().addAll(values);
      }
      return this;
    }

    public SSRF.Body withLocation(Location... values) {
      if (values != null) {
        getLocation().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withLocation(Collection<Location> values) {
      if (values != null) {
        getLocation().addAll(values);
      }
      return this;
    }

    public SSRF.Body withLocationSet(LocationSet... values) {
      if (values != null) {
        getLocationSet().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withLocationSet(Collection<LocationSet> values) {
      if (values != null) {
        getLocationSet().addAll(values);
      }
      return this;
    }

    public SSRF.Body withTOA(TOA... values) {
      if (values != null) {
        getTOA().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withTOA(Collection<TOA> values) {
      if (values != null) {
        getTOA().addAll(values);
      }
      return this;
    }

    public SSRF.Body withSignalDescr(SignalDescr... values) {
      if (values != null) {
        getSignalDescr().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withSignalDescr(Collection<SignalDescr> values) {
      if (values != null) {
        getSignalDescr().addAll(values);
      }
      return this;
    }

    public SSRF.Body withTxRx(TxRx... values) {
      if (values != null) {
        getTxRx().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withTxRx(Collection<TxRx> values) {
      if (values != null) {
        getTxRx().addAll(values);
      }
      return this;
    }

    public SSRF.Body withAntenna(Antenna... values) {
      if (values != null) {
        getAntenna().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withAntenna(Collection<Antenna> values) {
      if (values != null) {
        getAntenna().addAll(values);
      }
      return this;
    }

    public SSRF.Body withSSRequest(SSRequest... values) {
      if (values != null) {
        getSSRequest().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withSSRequest(Collection<SSRequest> values) {
      if (values != null) {
        getSSRequest().addAll(values);
      }
      return this;
    }

    public SSRF.Body withSSReply(SSReply... values) {
      if (values != null) {
        getSSReply().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withSSReply(Collection<SSReply> values) {
      if (values != null) {
        getSSReply().addAll(values);
      }
      return this;
    }

    public SSRF.Body withAsgnAllot(AsgnAllot... values) {
      if (values != null) {
        getAsgnAllot().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withAsgnAllot(Collection<AsgnAllot> values) {
      if (values != null) {
        getAsgnAllot().addAll(values);
      }
      return this;
    }

    public SSRF.Body withIntfReport(IntfReport... values) {
      if (values != null) {
        getIntfReport().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withIntfReport(Collection<IntfReport> values) {
      if (values != null) {
        getIntfReport().addAll(values);
      }
      return this;
    }

    public SSRF.Body withIntfMitigation(IntfMitigation... values) {
      if (values != null) {
        getIntfMitigation().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withIntfMitigation(Collection<IntfMitigation> values) {
      if (values != null) {
        getIntfMitigation().addAll(values);
      }
      return this;
    }

    public SSRF.Body withJRFL(JRFL... values) {
      if (values != null) {
        getJRFL().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withJRFL(Collection<JRFL> values) {
      if (values != null) {
        getJRFL().addAll(values);
      }
      return this;
    }

    public SSRF.Body withRoute(Route... values) {
      if (values != null) {
        getRoute().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withRoute(Collection<Route> values) {
      if (values != null) {
        getRoute().addAll(values);
      }
      return this;
    }

    public SSRF.Body withForceElement(ForceElement... values) {
      if (values != null) {
        getForceElement().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withForceElement(Collection<ForceElement> values) {
      if (values != null) {
        getForceElement().addAll(values);
      }
      return this;
    }

    public SSRF.Body withFEDeployment(FEDeployment... values) {
      if (values != null) {
        getFEDeployment().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withFEDeployment(Collection<FEDeployment> values) {
      if (values != null) {
        getFEDeployment().addAll(values);
      }
      return this;
    }

    public SSRF.Body withBSMPlan(BSMPlan... values) {
      if (values != null) {
        getBSMPlan().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withBSMPlan(Collection<BSMPlan> values) {
      if (values != null) {
        getBSMPlan().addAll(values);
      }
      return this;
    }

    public SSRF.Body withDictionary(Dictionary... values) {
      if (values != null) {
        getDictionary().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withDictionary(Collection<Dictionary> values) {
      if (values != null) {
        getDictionary().addAll(values);
      }
      return this;
    }

    public SSRF.Body withCEOI(CEOI... values) {
      if (values != null) {
        getCEOI().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withCEOI(Collection<CEOI> values) {
      if (values != null) {
        getCEOI().addAll(values);
      }
      return this;
    }

    public SSRF.Body withOpClearanceRequest(OpClearanceRequest... values) {
      if (values != null) {
        getOpClearanceRequest().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withOpClearanceRequest(Collection<OpClearanceRequest> values) {
      if (values != null) {
        getOpClearanceRequest().addAll(values);
      }
      return this;
    }

    public SSRF.Body withOpClearance(OpClearance... values) {
      if (values != null) {
        getOpClearance().addAll(Arrays.asList(values));
      }
      return this;
    }

    public SSRF.Body withOpClearance(Collection<OpClearance> values) {
      if (values != null) {
        getOpClearance().addAll(values);
      }
      return this;
    }

  }

  /**
   * Get a string representation of this SSRF instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSRF {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSRF} requires {@link null Body}, {@link null Header}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetBody() && isSetHeader();
  }

}
