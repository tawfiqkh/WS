
package java;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertMADToEuro_QNAME = new QName("http://services/", "convertMADToEuro");
    private static final QName _ConvertMADToEuroResponse_QNAME = new QName("http://services/", "convertMADToEuroResponse");
    private static final QName _GetAccount_QNAME = new QName("http://services/", "getAccount");
    private static final QName _GetAccountList_QNAME = new QName("http://services/", "getAccountList");
    private static final QName _GetAccountListResponse_QNAME = new QName("http://services/", "getAccountListResponse");
    private static final QName _GetAccountResponse_QNAME = new QName("http://services/", "getAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertMADToEuro }
     * 
     * @return
     *     the new instance of {@link ConvertMADToEuro }
     */
    public ConvertMADToEuro createConvertMADToEuro() {
        return new ConvertMADToEuro();
    }

    /**
     * Create an instance of {@link ConvertMADToEuroResponse }
     * 
     * @return
     *     the new instance of {@link ConvertMADToEuroResponse }
     */
    public ConvertMADToEuroResponse createConvertMADToEuroResponse() {
        return new ConvertMADToEuroResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountList }
     * 
     * @return
     *     the new instance of {@link GetAccountList }
     */
    public GetAccountList createGetAccountList() {
        return new GetAccountList();
    }

    /**
     * Create an instance of {@link GetAccountListResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountListResponse }
     */
    public GetAccountListResponse createGetAccountListResponse() {
        return new GetAccountListResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMADToEuro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertMADToEuro }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "convertMADToEuro")
    public JAXBElement<ConvertMADToEuro> createConvertMADToEuro(ConvertMADToEuro value) {
        return new JAXBElement<>(_ConvertMADToEuro_QNAME, ConvertMADToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMADToEuroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertMADToEuroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "convertMADToEuroResponse")
    public JAXBElement<ConvertMADToEuroResponse> createConvertMADToEuroResponse(ConvertMADToEuroResponse value) {
        return new JAXBElement<>(_ConvertMADToEuroResponse_QNAME, ConvertMADToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAccountList")
    public JAXBElement<GetAccountList> createGetAccountList(GetAccountList value) {
        return new JAXBElement<>(_GetAccountList_QNAME, GetAccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAccountListResponse")
    public JAXBElement<GetAccountListResponse> createGetAccountListResponse(GetAccountListResponse value) {
        return new JAXBElement<>(_GetAccountListResponse_QNAME, GetAccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

}
