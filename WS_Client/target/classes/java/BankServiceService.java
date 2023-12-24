
package java;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BankServiceService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080?wsdl")
public class BankServiceService
    extends Service
{

    private static final URL BANKSERVICESERVICE_WSDL_LOCATION;
    private static final WebServiceException BANKSERVICESERVICE_EXCEPTION;
    private static final QName BANKSERVICESERVICE_QNAME = new QName("http://services/", "BankServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKSERVICESERVICE_WSDL_LOCATION = url;
        BANKSERVICESERVICE_EXCEPTION = e;
    }

    public BankServiceService() {
        super(__getWsdlLocation(), BANKSERVICESERVICE_QNAME);
    }

    public BankServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKSERVICESERVICE_QNAME, features);
    }

    public BankServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANKSERVICESERVICE_QNAME);
    }

    public BankServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKSERVICESERVICE_QNAME, features);
    }

    public BankServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort() {
        return super.getPort(new QName("http://services/", "BankServicePort"), BankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "BankServicePort"), BankService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKSERVICESERVICE_EXCEPTION!= null) {
            throw BANKSERVICESERVICE_EXCEPTION;
        }
        return BANKSERVICESERVICE_WSDL_LOCATION;
    }

}
