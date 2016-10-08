import java.util.Scanner;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddTester {
	
	@Test(timeout=1)
	public void shouldAddNNumbers(){
		AddLogic logic = new AddLogic();
		//logic.add("1000","200","1","2","5");
		int result = logic.add("1","2","3","4","5","6","7","8","9","10");
		//int result = logic.add();
		int expectedResult = 55;
		Assert.assertEquals(expectedResult, result);
	}
	
	Scanner scanner =new Scanner(System.in);
	@Ignore
	@Test
	public void shouldAddTwoEnglishStrings(){
		// I Need to take Input From the User
				//System.in - Input is very slow Process in Computer
				// Scanner - Scanner is a Buffer (Scanner is Predefine Class)
		
		System.out.println("Enter the String Form");
		String firstNo = scanner.next();
		System.out.println("Enter the String number");
		String secondno = scanner.next();
		AddLogic logic = new AddLogic(); // Create Object
		int result = logic.add(firstNo, secondno);
		//scanner.close();
		int expectedResult = 100;
		Assert.assertEquals(expectedResult, result);
	}
	
	
	@Ignore
	@Test
	public void shouldAddTwoStrings(){
		// I Need to take Input From the User
				//System.in - Input is very slow Process in Computer
				// Scanner - Scanner is a Buffer (Scanner is Predefine Class)
		//Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Number");
		String firstNo = scanner.next();
		System.out.println("Enter the second number");
		String secondno = scanner.next();
		AddLogic logic = new AddLogic(); // Create Object
		int result = logic.add(firstNo, secondno);
		//scanner.close();
		int expectedResult = 30;
		Assert.assertEquals(expectedResult, result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
