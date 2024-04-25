import java.net.*;


public class client2 {
    public static void main(String [] args) throws Exception{
        DatagramSocket client= new DatagramSocket();
        String mssg="hello";

        byte[] sdBuffer= mssg.getBytes();
        InetAddress inet= InetAddress.getLocalHost();
        DatagramPacket snPacket= new DatagramPacket(sdBuffer,sdBuffer.length,inet,9000);
        client.send(snPacket);

        byte [] rxBuffer= new byte[1024];
        DatagramPacket rxPacket= new DatagramPacket(rxBuffer, rxBuffer.length);
        client.receive(rxPacket);
 
        String reply= new String(rxPacket.getData());
        System.out.println(reply);
        client.close();
    }
    
}
