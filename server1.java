import java.net.*;
import java.io.*;
import java.util.Scanner;

public class server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4200);
        System.out.println("Server running on 4200");
        System.out.println("Waiting for client");

        while (true) {
            Socket s = ss.accept();
            System.out.println("Client connected");

            clientHandler ch = new clientHandler(s);
            ch.start();
        }
    }

    static class clientHandler extends Thread {
        Socket s;

        public clientHandler(Socket s) {
            this.s = s;
        }

        public void run() {
            try {
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                Scanner scan = new Scanner(System.in);

                while (true) {
                    System.out.println("Client connected: " + s.getPort());
                    String msg = dis.readUTF();
                    System.out.println("Client msg=" + msg);

                    if (msg.equalsIgnoreCase("bye")) {
                        break;
                    }

                    System.out.println("Enter a reply");
                    String reply = scan.nextLine();
                    dos.writeUTF(reply);
                }

                dis.close();
                dos.close();
                scan.close();
               
             s.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
