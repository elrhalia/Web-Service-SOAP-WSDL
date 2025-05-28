package ws;

import com.sun.xml.ws.developer.MemberSubmissionEndpointReference;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
//POJO PLAIN OLD JAVA OBJECT
@WebService(serviceName = "BaqueWS")
public class BanqueService {
    @WebMethod(operationName ="Convert")
    public double convention(@WebParam(name = "montant") double mt ){
                return mt * 10.54;
    }
    @WebMethod()
    public Compte getcompte(@WebParam(name = "code")int code ){
     return new Compte(code, Math.random()*9888,new Date());
    }
    @WebMethod()
   public List<Compte> ListComptes() {
        return List.of(
                new Compte(1, Math.random()*9888,new Date()),
                new Compte(2, Math.random()*9888,new Date()),
                new Compte(3, Math.random()*9888,new Date())
        );
   }
}

