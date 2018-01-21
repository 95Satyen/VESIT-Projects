import java.net.*;
import java.io.*;

class TCPClient
{

public static void main(String args[])throws Exception
{
String message;
String servername =args[0];//for same comp asssign localhost
int portno = Integer.parseInt(args[1]); //for same comp assign 80
Socket client = new Socket(servername,portno);
BufferedReader b = new BufferedReader(new InputStreamReader(client.getInputStream()));
message = b.readLine();
System.out.println("message is: "+message);
client.close();

}

}