import java.util.Scanner;

public class AddLogic {
	
	public int add(String ...x){
		return 0;
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
