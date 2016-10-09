class Account
{
	double balance=10000;
	int accountNo;
	void checkBalance(){
		System.out.println("balance is "+balance);
	}
	void roi(){
		System.out.println("COMMON ROI....");
	}
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
		super.roi();
		System.out.println("Saving AC ROI 4% Call");
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
		System.out.println("Current AC 6% ROI Call");
	}
}
class CallAccount{
	//Man man = new NormalMan();
	//Man man = new SuperMan();
	//Account account = new SavingAccount();
	public void doCall(Account account){
		account.checkBalance();
		account.deposit();
		account.withDraw();
		account.roi();
		if(account instanceof CurrentAccount){
			CurrentAccount ca = (CurrentAccount) account; // Downcasting
			ca.odLimit();
		}
		//account.odLimit();
		System.out.println("******************************");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallAccount callAccount = new CallAccount();
		callAccount.doCall(new SavingAccount());
		callAccount.doCall(new CurrentAccount());
		//Account account = new SavingAccount();  //Upcasting
		//callAccount.doCall(account);
		//SavingAccount sa = new SavingAccount();
		//int a = 1000;
//		account.checkBalance();
//		account.deposit();
//		account.withDraw();
//		account.roi();
		
		//System.out.println("**********************");
		//account = new CurrentAccount(); //Upcasting
//		account.checkBalance();
//		account.deposit();
//		account.withDraw();
//		account.roi();
		//ca.odLimit();
		
	}

}









