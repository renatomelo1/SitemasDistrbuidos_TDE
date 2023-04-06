import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {

public static void main(String[] args) {
    try {
        Registry registry = LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost:1099/Ola", new OlaImpl());

    } catch (Exception e ) {
        e.printStackTrace();
    }

}
}