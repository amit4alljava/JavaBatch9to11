import static java.lang.System.out;
import static java.lang.Math.pow;
class A1
{
	static int x;
	int y;
	private A1(){
		x++; 
		y++;
		
		System.out.println("X "+x+" and Y "+y);
	}
	static{
		System.out.println(" I am Static Block"
				+ " and Call When Class is Loaded... "+x);
	}
	static void print(){
		System.out.println(" iam static method ");
	}
}
interface A2
{
	static void show(){
		System.out.println("I am Static ...");
	}
}
class OuterClass{
	static class NestedClass{
		static void print(){
			System.out.println("Nested Class Print...");
		}
	}
}
// Utility Class = private cons + static methods
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.NestedClass.print();
		out.println(A1.x);
		A1.print();
		//Math math = new Math();
		pow(2, 3);
		//A1 obj = new A1();
		//A1 obj2 = new A1();
		
	}

}
