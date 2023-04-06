
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class Cliente {
    public static void main(String[] args) {
        try {
            Ola stub = (Ola)Naming.lookup("rmi://localhost:1099/Ola");
            System.out.println(stub.digaOla());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
