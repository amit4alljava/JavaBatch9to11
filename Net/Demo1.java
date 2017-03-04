import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		InetAddress inet2[]  = 
				InetAddress.getAllByName("flipkart.com");
		for(InetAddress inetAdd : inet2){
			System.out.println(inetAdd.getHostAddress());
		}
		
		
		

	}
	
	
	
	
	

}
