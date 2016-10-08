class Account
{
	double balance=10000;
	int accountNo;
	void checkBalance(){
		System.out.println("balance is "+balance);
	}
	void roi(){}
	void withDraw(){
		System.out.println("Common WithDraw..");
	}
	void deposit(){
		System.out.println("Account Class Deposit...");
	}
}
class SavingAccount extends Account
{
	@Override
	void roi(){
		System.out.println("Saving AC ROI Call");
	}
	// Annontation
	@Override
	void withDraw(){
		System.out.println("Saving Account Limit for withdraw...");
	}
}
class CurrentAccount extends Account{
	void odLimit(){
		System.out.println("CA OD Limit...");
	}
	@Override
	void roi(){
		System.out.println("Current AC ROI Call");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.checkBalance();
		sa.deposit();
		sa.withDraw();
		sa.roi();
		System.out.println("**********************");
		CurrentAccount ca = new CurrentAccount();
		ca.checkBalance();
		ca.deposit();
		ca.withDraw();
		ca.roi();
		ca.odLimit();
		
	}

}









