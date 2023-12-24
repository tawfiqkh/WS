import jakarta.xml.ws.Endpoint;
import services.BankService;

public class Server {

    public static void main(String[] args){
        final int PORT = 8080;
        final String URL = "http://localhost:"+PORT+"/";

        Endpoint.publish(URL, new BankService());

        System.out.println(String.format("server is running on %s", URL));
    }
}
