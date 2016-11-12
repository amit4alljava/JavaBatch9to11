/*
 * Abstract Class Acting as a parent class and Object Creation not
 * allowed
 * It may have abstract methods and child need to override the
 * abstract methods , if child not override the abstract methds
 * so child is treated as abstract
 */
abstract class Account
{
	//Generic (Common) Features
	int balance;
	String name;
	void deposit(){
		System.out.println("Deposit Generic Logic...");
	}
	abstract void roi();
}
class SavingAccount extends Account{
	void doorToDoorService(){
		System.out.println("Saving Account has door to door service");
	}
	@Override
	void roi(){
		System.out.println("Saving A/C ROI CALL");
	}
}
class CurrentAccount extends Account{
	void odLimit(){
		System.out.println("Current Account Has OD LImit..");
	}
	@Override
	void roi(){
		System.out.println("Current A/C ROI CALL");
	}
}
class Customer{
	//Account ca = new Account();
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account account = new Account();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.odLimit();
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.doorToDoorService();
	}

}





