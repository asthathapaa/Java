import java.net.*;

public class serverUdp {
    public static void main(String [] args) throws Exception{
        DatagramSocket server= new DatagramSocket(9000);
        System.out.println("Running on 9000");

        byte [] rxBuffer= new byte[1024];

        DatagramPacket rPacket= new DatagramPacket(rxBuffer, rxBuffer.length);
        server.receive(rPacket);

        String mssg= new String(rPacket.getData());
        System.out.println("ClIENT MSSG="+mssg);

        byte [] sdBuffer= mssg.toUpperCase().getBytes();

        InetAddress clientAddress=rPacket.getAddress();
        int clientPort= rPacket.getPort();

        DatagramPacket sPacket= new DatagramPacket(sdBuffer, sdBuffer.length,clientAddress,clientPort);
        server.send(sPacket);

        server.close();
    }
    
}
