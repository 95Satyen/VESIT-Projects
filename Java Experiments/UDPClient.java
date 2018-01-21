import java.net.*;
import java.io.*;

class UDPClient
{

public static void main(String args[])throws Exception
{
String message;
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
DatagramSocket s2= new DatagramSocket(1055);                            //random port number
DatagramPacket p2;

System.out.println("Enter message");
message=b.readLine();
p2=new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"),80);
s2.send(p2);
s2.close();


}

}