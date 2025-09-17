import java . io . * ;
import java . net . * ;
InetAddress addr = InetAddress.getLocalHost();
System.out.println( "adress=" +addr.getHostName() );

DatagramPacket packet = new DatagramPacket ( data, data.lenght, addr, 1234 );
Datagram Socke sock = new DatagramSocke();
sock.send(packet);
sock.close();
