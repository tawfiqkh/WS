package services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import models.Account;

import java.util.Date;
import java.util.List;

@WebService
public class BankService {
    final int EURO_RATE = 11;
    @WebMethod
    public Double convertMADToEuro(@WebParam(name = "amount") double amount){
        return amount*EURO_RATE;
    }
    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code){
        return new Account(code, Math.random()*1000, new Date());
    }
    @WebMethod
    public List<Account> getAccountList(){

        return List.of(
                new Account(1, Math.random()*1000, new Date()),
                new Account(2, Math.random()*1000, new Date()),
                new Account(3, Math.random()*1000, new Date())
        );
    }
}
