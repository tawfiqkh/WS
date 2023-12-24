import proxy.Account;
import proxy.BankService;
import proxy.BankServiceService;

public class Main {

    public static void main(String[] args){

        BankService proxy = new BankServiceService().getBankServicePort();

        System.out.println( "the conversion of 12 MAD ro euro is: \t"+ proxy.convertMADToEuro(12 ));

        Account account = proxy.getAccount(12);
        System.out.println( "\nAccount 12 details: \n");
        System.out.println( "code: \t"+ account.getCode());
        System.out.println( "Amount: \t"+ account.getAmount());
        System.out.println( "creation date\t"+ account.getCreatedAt());

        System.out.println("show Account list:\n");

        proxy.getAccountList().forEach(it -> {
            System.out.println("*************************\n");
            System.out.println( "code: \t"+ it.getCode());
            System.out.println( "Amount: \t"+ it.getAmount());
            System.out.println( "creation date\t"+ it.getCreatedAt());
        } );



    }
}
