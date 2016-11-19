class Employee{
	Account account ;
//	Employee(){
//		System.out.println("Employee Born...");
//		account = new Account(); // Composition
//	}
	Employee(Account account){
		System.out.println("Employee Born...");
	this.account = account;
	}
	@Override
	public void finalize(){
		System.out.println("Good Bye Employee...");
	}
}
class Account
{
	Account(){
		System.out.println("Account Born....");
	}
	@Override
	public void finalize(){
		System.out.println("Good Bye Account...");
	}
}
public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Employee ram = new Employee(account);
//		if(10>2)
//		{
//			Employee ram = new Employee();
//		}
//		}
//		Employee shyam = new Employee();
		//ram = shyam;
		ram = null;
		System.gc(); 
		for(int i = 1;i<=10 ; i++){
			System.out.println("I is "+i);
		}
	}

}
