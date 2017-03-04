import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ipAddress = "localhost";
		final int PORTNO = 9999;
		Socket socket = new Socket(ipAddress,PORTNO);
		System.out.println("Client Connected....");
		InputStream in = socket.getInputStream();
		int singleByte = in.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = in.read();
		}
		in.close();
		socket.close();
	}

}
