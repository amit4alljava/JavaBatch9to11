package WW;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;



public class Calc {
	static Logger logger = Logger.getLogger(Calc.class);
	static Scanner scanner= new Scanner(System.in);
	static int firstNo=0;
	static int secondNo = 0;
	static int result = 0;
	static String logErrorMessage(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
	static void takeFirstNo(){
		logger.debug("I am Inside the takeFirstNo ");
		try{
			System.out.println("Enter the First No");
			firstNo = scanner.nextInt();  // throw new InputMismatchException();
			}
			catch(InputMismatchException object){
				//System.out.println(object);  // Exception Info Would be Write in Log File
				//logger.error(object.toString());
				System.out.println("Only Number Allowed and U Enter Something else...");
				String errorMessage = logErrorMessage(object);
				logger.error(errorMessage);
				scanner.nextLine();
				takeFirstNo();
			}
		logger.debug("I am At end of this takeFirstNo");
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
//		File file = new File("/Users/amit/Documents/FileHandlingTestingCase/abcd1.txt");
//		try {
//			file.createNewFile();
//			System.out.println("File Created...");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Unable to Create File...");
//		}
		//int p = 10/0;
		takeFirstNo();
		takeSecondNo();
		divide();
		System.out.println("Result is "+result);
		scanner.close();
	}

}
