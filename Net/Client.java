import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ipAddress = "localhost";
		final int PORTNO = 9001;
		Socket socket = new Socket(ipAddress, PORTNO);
		System.out.println("Client Join...");
		InputStream is = socket.getInputStream();
		int singleByte = is.read();
		final int EOF = -1;
		System.out.println("Data Comes from the Server...");
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		System.out.println();
		is.close();
		socket.close();

	}

}






