
package com.ccf.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ccf.mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoPhoneCardReconResponse_QNAME = new QName("http://webservice.wintone.com/", "doPhoneCardReconResponse");
    private final static QName _DoAllCardReconForUsersResponse_QNAME = new QName("http://webservice.wintone.com/", "doAllCardReconForUsersResponse");
    private final static QName _SearchAllCardAmount_QNAME = new QName("http://webservice.wintone.com/", "searchAllCardAmount");
    private final static QName _SearchPhoneAmount_QNAME = new QName("http://webservice.wintone.com/", "searchPhoneAmount");
    private final static QName _DoAllCardReconForUsers_QNAME = new QName("http://webservice.wintone.com/", "doAllCardReconForUsers");
    private final static QName _DoAllCardReconforPhoneResponse_QNAME = new QName("http://webservice.wintone.com/", "doAllCardReconforPhoneResponse");
    private final static QName _GetVersion_QNAME = new QName("http://webservice.wintone.com/", "getVersion");
    private final static QName _DoAllCardReconResponse_QNAME = new QName("http://webservice.wintone.com/", "doAllCardReconResponse");
    private final static QName _SearchAllCardAmountResponse_QNAME = new QName("http://webservice.wintone.com/", "searchAllCardAmountResponse");
    private final static QName _DoPhoneCardRecon_QNAME = new QName("http://webservice.wintone.com/", "doPhoneCardRecon");
    private final static QName _DoAllCardReconforPhone_QNAME = new QName("http://webservice.wintone.com/", "doAllCardReconforPhone");
    private final static QName _SearchPhoneAmountResponse_QNAME = new QName("http://webservice.wintone.com/", "searchPhoneAmountResponse");
    private final static QName _DoAllCardRecon_QNAME = new QName("http://webservice.wintone.com/", "doAllCardRecon");
    private final static QName _WjbresultResponse_QNAME = new QName("http://webservice.wintone.com/", "wjbresultResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://webservice.wintone.com/", "getVersionResponse");
    private final static QName _Wjbresult_QNAME = new QName("http://webservice.wintone.com/", "wjbresult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ccf.mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoAllCardRecon }
     * 
     */
    public DoAllCardRecon createDoAllCardRecon() {
        return new DoAllCardRecon();
    }

    /**
     * Create an instance of {@link WjbresultResponse }
     * 
     */
    public WjbresultResponse createWjbresultResponse() {
        return new WjbresultResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link Wjbresult }
     * 
     */
    public Wjbresult createWjbresult() {
        return new Wjbresult();
    }

    /**
     * Create an instance of {@link DoAllCardReconforPhoneResponse }
     * 
     */
    public DoAllCardReconforPhoneResponse createDoAllCardReconforPhoneResponse() {
        return new DoAllCardReconforPhoneResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link DoAllCardReconForUsers }
     * 
     */
    public DoAllCardReconForUsers createDoAllCardReconForUsers() {
        return new DoAllCardReconForUsers();
    }

    /**
     * Create an instance of {@link DoPhoneCardReconResponse }
     * 
     */
    public DoPhoneCardReconResponse createDoPhoneCardReconResponse() {
        return new DoPhoneCardReconResponse();
    }

    /**
     * Create an instance of {@link DoAllCardReconForUsersResponse }
     * 
     */
    public DoAllCardReconForUsersResponse createDoAllCardReconForUsersResponse() {
        return new DoAllCardReconForUsersResponse();
    }

    /**
     * Create an instance of {@link SearchAllCardAmount }
     * 
     */
    public SearchAllCardAmount createSearchAllCardAmount() {
        return new SearchAllCardAmount();
    }

    /**
     * Create an instance of {@link SearchPhoneAmount }
     * 
     */
    public SearchPhoneAmount createSearchPhoneAmount() {
        return new SearchPhoneAmount();
    }

    /**
     * Create an instance of {@link SearchPhoneAmountResponse }
     * 
     */
    public SearchPhoneAmountResponse createSearchPhoneAmountResponse() {
        return new SearchPhoneAmountResponse();
    }

    /**
     * Create an instance of {@link DoAllCardReconResponse }
     * 
     */
    public DoAllCardReconResponse createDoAllCardReconResponse() {
        return new DoAllCardReconResponse();
    }

    /**
     * Create an instance of {@link DoAllCardReconforPhone }
     * 
     */
    public DoAllCardReconforPhone createDoAllCardReconforPhone() {
        return new DoAllCardReconforPhone();
    }

    /**
     * Create an instance of {@link DoPhoneCardRecon }
     * 
     */
    public DoPhoneCardRecon createDoPhoneCardRecon() {
        return new DoPhoneCardRecon();
    }

    /**
     * Create an instance of {@link SearchAllCardAmountResponse }
     * 
     */
    public SearchAllCardAmountResponse createSearchAllCardAmountResponse() {
        return new SearchAllCardAmountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPhoneCardReconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doPhoneCardReconResponse")
    public JAXBElement<DoPhoneCardReconResponse> createDoPhoneCardReconResponse(DoPhoneCardReconResponse value) {
        return new JAXBElement<DoPhoneCardReconResponse>(_DoPhoneCardReconResponse_QNAME, DoPhoneCardReconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardReconForUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardReconForUsersResponse")
    public JAXBElement<DoAllCardReconForUsersResponse> createDoAllCardReconForUsersResponse(DoAllCardReconForUsersResponse value) {
        return new JAXBElement<DoAllCardReconForUsersResponse>(_DoAllCardReconForUsersResponse_QNAME, DoAllCardReconForUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAllCardAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "searchAllCardAmount")
    public JAXBElement<SearchAllCardAmount> createSearchAllCardAmount(SearchAllCardAmount value) {
        return new JAXBElement<SearchAllCardAmount>(_SearchAllCardAmount_QNAME, SearchAllCardAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPhoneAmount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "searchPhoneAmount")
    public JAXBElement<SearchPhoneAmount> createSearchPhoneAmount(SearchPhoneAmount value) {
        return new JAXBElement<SearchPhoneAmount>(_SearchPhoneAmount_QNAME, SearchPhoneAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardReconForUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardReconForUsers")
    public JAXBElement<DoAllCardReconForUsers> createDoAllCardReconForUsers(DoAllCardReconForUsers value) {
        return new JAXBElement<DoAllCardReconForUsers>(_DoAllCardReconForUsers_QNAME, DoAllCardReconForUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardReconforPhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardReconforPhoneResponse")
    public JAXBElement<DoAllCardReconforPhoneResponse> createDoAllCardReconforPhoneResponse(DoAllCardReconforPhoneResponse value) {
        return new JAXBElement<DoAllCardReconforPhoneResponse>(_DoAllCardReconforPhoneResponse_QNAME, DoAllCardReconforPhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "getVersion")
    public JAXBElement<GetVersion> createGetVersion(GetVersion value) {
        return new JAXBElement<GetVersion>(_GetVersion_QNAME, GetVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardReconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardReconResponse")
    public JAXBElement<DoAllCardReconResponse> createDoAllCardReconResponse(DoAllCardReconResponse value) {
        return new JAXBElement<DoAllCardReconResponse>(_DoAllCardReconResponse_QNAME, DoAllCardReconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAllCardAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "searchAllCardAmountResponse")
    public JAXBElement<SearchAllCardAmountResponse> createSearchAllCardAmountResponse(SearchAllCardAmountResponse value) {
        return new JAXBElement<SearchAllCardAmountResponse>(_SearchAllCardAmountResponse_QNAME, SearchAllCardAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPhoneCardRecon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doPhoneCardRecon")
    public JAXBElement<DoPhoneCardRecon> createDoPhoneCardRecon(DoPhoneCardRecon value) {
        return new JAXBElement<DoPhoneCardRecon>(_DoPhoneCardRecon_QNAME, DoPhoneCardRecon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardReconforPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardReconforPhone")
    public JAXBElement<DoAllCardReconforPhone> createDoAllCardReconforPhone(DoAllCardReconforPhone value) {
        return new JAXBElement<DoAllCardReconforPhone>(_DoAllCardReconforPhone_QNAME, DoAllCardReconforPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPhoneAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "searchPhoneAmountResponse")
    public JAXBElement<SearchPhoneAmountResponse> createSearchPhoneAmountResponse(SearchPhoneAmountResponse value) {
        return new JAXBElement<SearchPhoneAmountResponse>(_SearchPhoneAmountResponse_QNAME, SearchPhoneAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAllCardRecon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "doAllCardRecon")
    public JAXBElement<DoAllCardRecon> createDoAllCardRecon(DoAllCardRecon value) {
        return new JAXBElement<DoAllCardRecon>(_DoAllCardRecon_QNAME, DoAllCardRecon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WjbresultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "wjbresultResponse")
    public JAXBElement<WjbresultResponse> createWjbresultResponse(WjbresultResponse value) {
        return new JAXBElement<WjbresultResponse>(_WjbresultResponse_QNAME, WjbresultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "getVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wjbresult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.wintone.com/", name = "wjbresult")
    public JAXBElement<Wjbresult> createWjbresult(Wjbresult value) {
        return new JAXBElement<Wjbresult>(_Wjbresult_QNAME, Wjbresult.class, null, value);
    }

}
