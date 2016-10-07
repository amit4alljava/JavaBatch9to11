import java.util.ArrayList;

public class HeapFul {

	public static void main(String[] args) throws InterruptedException {
		
		// How Object is Eligable for G.C
		// 1. object become null
		// 2. assign other object reference in your object
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		Customer shyam = new Customer(1002,"Customer","3333",2222);
		Customer mike  = new Customer(1003,"Customer2","4444",4444);
		mike = shyam;
		System.out.println("Program Going to DIE ....");
		while(true){
			Customer ram = new Customer(1001,"Ram","2222",1000);
			list.add(ram);
			Thread.sleep(50);
			//ram = null;
		}

	}

}
