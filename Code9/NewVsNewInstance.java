import java.util.Scanner;

class C
{
	static {
		System.out.println("C Class Loaded..");
	}
	C(){
		System.out.println("C Class Cons Call");
	}
}
class B
{
	static int p ;
	static{
		System.out.println(" I will call when class is loaded..");
	}
	B(){
		System.out.println("B Cons Call");
	}
}
public class NewVsNewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		Class.forName(className).newInstance();
		//B.p= 20;

	}

}











