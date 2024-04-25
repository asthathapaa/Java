import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class serverRMI {
    
    public static void main (String [] args){
        try{
            Sample obj= new Sample();
            common stub= (common)UnicastRemoteObject.exportObject(obj, 0);

            Registry reg= LocateRegistry.getRegistry();
            reg.bind("stub", stub);
            System.out.println("Server ready");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
