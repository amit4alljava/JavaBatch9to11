
public class MyAddLogic {
	public int add(int x, int y ){
		return x + y;
	}
	public int add(String x, String y ){
		int firstno = 0;
		int secondno = 0;
		try{
			firstno = Integer.parseInt(x);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid First No Only 0-9 Allowed...");
			firstno = 0;
		}
		try{
			secondno = Integer.parseInt(y);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Second No Only 0-9 Allowed...");
			secondno = 0;
		}
		// throw new NumberFormatException();
		return firstno + secondno;
	}

}
