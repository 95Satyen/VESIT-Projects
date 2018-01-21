import java.net.*;
import java.io.*;
class UDPServer{
public static void main(String args[])throws Exception
{
byte[] rmessage= new byte[1024];
byte[] smessage= new byte[1024];
DatagramSocket s1;
DatagramPacket p1;

s1=new DatagramSocket(80);

while(true)	
{
p1=new DatagramPacket(smessage,smessage.length);
s1.receive(p1);
String msg = new String(p1.getData());
System.out.println(msg);
System.out.println("Server Disconnected");

}	

}
}