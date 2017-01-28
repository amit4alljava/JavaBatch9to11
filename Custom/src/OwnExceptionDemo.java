import java.util.Scanner;


class Emp
{
	int empno;
	String name;
	Emp(int empno, String name)
	{
		this.empno = empno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + "]";
	}
	
}

// System Exception 
// Business Exception
// POJO (Plain Old Java Object) Class 
// Step - 1 (Inherit the Exception Class)
// Now this class is become Checked Exception


class MinBalanceException extends Exception{ //extends Exception {
	private int amount;
	private int balance;
	MinBalanceException(int amount,int balance){
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String toString(){
		return "Your Balance is "+balance+" Low and U can't do any transaction... Amount is "+amount;
	}
}
public class OwnExceptionDemo {

	public static void main(String[] args) {
		Emp ram =new Emp(1001,"Ram");
		System.out.println(ram);
		// TODO Auto-generated method stub
		//main(null);
		int balance = 0;
		System.out.println("Enter the Amount to WithDraw");
		int amount = new Scanner(System.in).nextInt();
		try{
		if(balance<=0){
			//System.out.println("Balnce is Nil..");
			throw new MinBalanceException(amount,balance);
					}
		// Calc Logic....
		System.out.println("With Draw "+amount);
		}
		catch(MinBalanceException e){
			System.out.println(e);
		}

	}

}






