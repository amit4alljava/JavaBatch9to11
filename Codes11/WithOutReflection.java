import java.util.Scanner;

class BigValueCalculator
{
	BigValueCalculator(){
		System.out.println("BigValueCalculator Cons Call");
	}
	public long add(long x,long y){
		return x + y;
	}
	public long subtract(long x, long y){
		return x - y;
	}
	public long multiply(long x,long y){
		return x * y;
	}
	public long divide(long x,long y){
		return x / y;
	}
}

class Calculator
{
	Calculator(){
		System.out.println("Calculator Cons call");
	}
	private int add(int x,int y){
		return x + y;
	}
	public int subtract(int x,int y){
		return x - y;
	}
	public int multiply(int x,int y){
		return x * y;
	}
	public int divide(int x,int y){
		return x / y;
	}
}

public class WithOutReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type Calculator for int Calc");
		System.out.println("Type BigValueCalculator for long Calc");
		String calcChoice = scanner.next();
		if(calcChoice.equals("Calculator")){
		Calculator calc = new Calculator();
		System.out.println("Type Add for Addition");
		System.out.println("Type Subtract for Subtraction");
		System.out.println("Type Multiply for Multiplication");
		System.out.println("Type Divide for Division");
		
		String choice = scanner.next().toLowerCase();
		switch(choice){
		case "add":
			//System.out.println(calc.add(100, 200));
			break;
		case "subtract":
			System.out.println(calc.subtract(100, 200));
			break;
		case "multiply":
			System.out.println(calc.multiply(100, 200));
			break;
		case "divide":
			System.out.println(calc.divide(100, 200));
			break;
		}
		}
		else
		{
			// BigValue Calculator
		}
		
	}

}
