import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		final int PORTNO = 9001;
		ServerSocket serverSocket = new ServerSocket(PORTNO);
		System.out.println("Waiting for the Client....");
		Socket socket = serverSocket.accept(); // this is for handshaking
		System.out.println("Here comes the client...");
		System.out.println("Enter the Message to Send..");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		socket.getOutputStream().write(message.getBytes());
		System.out.println("Data Send to the Client...");
		socket.close();
		scanner.close();
//		OutputStream os = socket.getOutputStream();
//		byte bArray []= message.getBytes();
//		os.write(bArray);
		
		
	}

}










