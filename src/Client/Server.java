package Client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static void main(String [] args) throws IOException {
		DatagramSocket server = new DatagramSocket(4222);
		byte[] buf = new byte[256];
		
		DatagramPacket pac = new DatagramPacket(buf, buf.length);
		server.receive(pac);
		
		
		String message = new String(pac.getData());
		System.out.println("Message is:" + message);
		server.close();
	}
}
