import java.rmi.RemoteException;

import java.rmi.Remote;

public interface Ola extends Remote {
    String digaOla() throws RemoteException;    
}
