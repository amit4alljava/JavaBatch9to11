import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORTNO = 9999;
		ServerSocket server = new ServerSocket(PORTNO); 
		// Server is Ready and Listing on Port no 9999
		System.out.println("Server Start and Waiting for the Client");
		Socket socket = server.accept();  // Client Comes and Handshaking Done
		System.out.println("Client Comes");
		System.out.println("Enter the Message Send to Client...");
		String message = new Scanner(System.in).nextLine();
		// Write Bytes on Socket
		socket.getOutputStream().write(message.getBytes());
		System.out.println("Data Send...");
		socket.close();

	}

}
