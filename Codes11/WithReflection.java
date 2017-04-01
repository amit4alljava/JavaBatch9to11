import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class WithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type Calculator for int Calc");
		System.out.println("Type BigValueCalculator for long Calc");
		String calcChoice = scanner.next();
		Object object = Class.forName(calcChoice).newInstance();
		System.out.println("Type Add for Addition");
		System.out.println("Type Subtract for Subtraction");
		System.out.println("Type Multiply for Multiplication");
		System.out.println("Type Divide for Division");
		String operationName = scanner.next().toLowerCase();
		Method method = object.getClass()
				.getDeclaredMethod(operationName,
						int.class, int.class);
		method.setAccessible(true);
		Object result = method.invoke(object, 100,200);
		int expectedResult = 300;
		System.out.println(result);
		if(operationName.equals("add")){
		if(((Integer)result).intValue() == expectedResult){
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		}
		
		
		
		
		
	}

}
