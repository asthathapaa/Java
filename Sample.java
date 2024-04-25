import java.rmi.*;

public class Sample implements common{
    public String sayHello() throws RemoteException{
        return "Hello world";
    }
}
