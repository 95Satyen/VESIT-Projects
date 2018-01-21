import java.net.*;
import java.io.*;
class TCPServer{
public static void main(String args[])throws Exception
{
String sendmessage;

ServerSocket s = new ServerSocket(80);                                    //where 80 is port number assigned to the server

while(true) // for multiple client connection
  { 
Socket server = s.accept();                                              //creates a new socket for newly created connection
System.out.println("Just connected to "+server.getRemoteSocketAddress());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the message");
sendmessage=br.readLine();
PrintStream p = new PrintStream(server.getOutputStream());             // sends message in bytes
p.println(sendmessage);

	
	}


}
}