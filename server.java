import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;;


public class server{

    public static void main(String [] args) throws Exception{
        ServerSocket ss= new ServerSocket(4000);
        System.out.println("Server running on 4000");

         Socket s= ss.accept();


         System.out.println("Client connected yaya"+s.getPort());
         
         Scanner scan= new Scanner(System.in);
         DataInputStream dis= new DataInputStream(s.getInputStream());
         DataOutputStream dos= new DataOutputStream(s.getOutputStream());

         //System.out.println("Enter a string");
         String msg= dis.readUTF();

         System.out.println("C says="+msg);
         System.out.println("Reply===");
         String reply= scan.nextLine();
         dos.writeUTF(reply);
         dos.close();
         dis.close();
         scan.close();
         scan.close();
         ss.close();
         s.close();



    }
   
}