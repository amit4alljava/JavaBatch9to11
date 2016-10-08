import java.util.Scanner;

public class AddLogic {
	// Java 5  (Var - Args)
	public int add(String ...x){
		int sum = 0;
		if(x!=null && x.length>0){
		//System.out.println("Var Args Call "+x[0]+" "+x[1]);
//		for(int i = 0 ; i<x.length; i++){
//			String t = x[i];
//		}
			// Enhance For Loop (Java 1.5)
		for(String i : x){
			sum = sum + Integer.parseInt(i);
		}
		}
//		else
//		{
//			System.out.println("Var Args Call But U Not Pass any arguments");
//		}
		return sum;
	}
	public int add(String firstNo, String secondNo){
		int num1 = 0;
		int num2=0;
		try
		{
			//throw new NumberFormatException();
			num1 = Integer.parseInt(firstNo);
		}
		catch(NumberFormatException e){
			num1 = 0;
		}
		try
		{
			//throw new NumberFormatException();
			num2 = Integer.parseInt(secondNo);
		}
		catch(NumberFormatException e){
			num2 = 0;
		}
		return num1 + num2;
		
	}

}
