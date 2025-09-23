// ClientTCP3.java
import java.io.*;
import java.net.*;

public class ClientTCP3
{
	public static void main (String[] args)
	{
		try {
		Socket socket = new Socket("localhost", 2016);
		DataOutputStream dIn = new DataInputStream(socket.getInputStream());
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeUTF(args[0]);
		String rep = dIn.readUTF();
		System.out.println("Réponse serveur: "+rep);
		socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
