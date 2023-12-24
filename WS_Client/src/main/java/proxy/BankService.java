
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param amount
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertMADToEuro", targetNamespace = "http://services/", className = "proxy.ConvertMADToEuro")
    @ResponseWrapper(localName = "convertMADToEuroResponse", targetNamespace = "http://services/", className = "proxy.ConvertMADToEuroResponse")
    @Action(input = "http://services/BankService/convertMADToEuroRequest", output = "http://services/BankService/convertMADToEuroResponse")
    public Double convertMADToEuro(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountList", targetNamespace = "http://services/", className = "proxy.GetAccountList")
    @ResponseWrapper(localName = "getAccountListResponse", targetNamespace = "http://services/", className = "proxy.GetAccountListResponse")
    @Action(input = "http://services/BankService/getAccountListRequest", output = "http://services/BankService/getAccountListResponse")
    public List<Account> getAccountList();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://services/", className = "proxy.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://services/", className = "proxy.GetAccountResponse")
    @Action(input = "http://services/BankService/getAccountRequest", output = "http://services/BankService/getAccountResponse")
    public Account getAccount(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}