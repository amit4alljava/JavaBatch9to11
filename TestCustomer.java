
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local Var
		Customer ram; // ram is acting a variable of Customer Type
		//ram = new Customer();
		ram = new Customer(1001,"Ram","2222",9999); // ram is a reference variable
		ram.setAlternatePhone("4444");
		ram.setCity("Delhi");
		ram.setBalance(ram.getBalance()+1000);
		System.out.println("Ram New Balance is "+ram.getBalance());
		//System.out.println(ram);
//		System.out.println("Id "+ram.id); // 1222.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Phone "+ram.phone);
//		System.out.println("Balance "+ram.balance);
//		ram.id = -1001;
//		ram.name ="Ram";
//		ram.balance=-9999;
//		ram.phone="2222";
		//ram.takeInput(-1001, "Ram", "2222", -9999);
		ram.print();
//		System.out.println("After Input ....");
//		System.out.println("Id "+ram.id); // 1222.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Phone "+ram.phone);
////		System.out.println("Balance "+ram.balance);
		//Customer shyam = new Customer();
		Customer shyam = new Customer(1002,"Shyam","3333",5555);
		
//		shyam.id = 1002;
//		shyam.name ="Shyam";
//		shyam.balance=29999;
//		shyam.phone="12222";
		//shyam.takeInput(1002, "Shyam", "3333", 4444);
		shyam.print();
//		System.out.println("After Input ....");
//		System.out.println("Id "+shyam.id); // 1222.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Phone "+ram.phone);
//		System.out.println("Balance "+ram.balance);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(ram.hashCode());
		
		// new Customer() it is going to create a new Object
		int x;
		x = 10;

	}

}
