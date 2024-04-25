import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    
    public static void main(String [] args) throws Exception{
        Socket s= new Socket("localhost",4000);
        Scanner scan= new Scanner(System.in);

        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        
        System.out.println("Enter string");
        String cc= scan.nextLine();
     

        
        dos.writeUTF(cc);

String reply= dis.readUTF();
         System.out.println("Server says=="+reply);

         dos.close();
         dis.close();
         scan.close();
         s.close();

    }
}
