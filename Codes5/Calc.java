import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
	static Scanner scanner= new Scanner(System.in);
	static int firstNo=0;
	static int secondNo = 0;
	static int result = 0;
	static void takeFirstNo(){
		try{
			System.out.println("Enter the First No");
			firstNo = scanner.nextInt();  // throw new InputMismatchException();
			}
			catch(InputMismatchException object){
				System.out.println("Only Number Allowed and U Enter Something else...");
				scanner.nextLine();
				takeFirstNo();
			}
	}
	static void divide(){
		
		try{
		result = firstNo/ secondNo;
		}
		catch(ArithmeticException e){
		System.out.println("U Divide a Number with Zero ");
		takeSecondNo();
		divide();
		}
		
	}
	static void takeSecondNo(){
		try{
			System.out.println("Enter the Second No");
			secondNo = scanner.nextInt();  // throw new InputMismatchException();
			}
			catch(InputMismatchException object){
				System.out.println("Only Number Allowed and U Enter Something else...");
				scanner.nextLine();
				takeSecondNo();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c:\\abcd\\xyz\\abcd.txt
		File file = new File("/Users/amit/Documents/FileHandlingTestingCase/abcd1.txt");
		try {
			file.createNewFile();
			System.out.println("File Created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to Create File...");
		}
		int p = 10/0;
		takeFirstNo();
		takeSecondNo();
		divide();
		System.out.println("Result is "+result);
		scanner.close();
	}

}
