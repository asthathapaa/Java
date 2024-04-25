import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class clientRMI {
    public static void main(String [] args){
        try{
            Registry reg= LocateRegistry.getRegistry();
            common obj= (common)reg.lookup("stub");
            System.out.println(obj.sayHello());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
