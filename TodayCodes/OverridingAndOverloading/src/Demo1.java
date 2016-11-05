import java.util.LinkedList;

/*
 * Overriding
 * Inheritance + Signature Must be same
 * Weaker Access Rule - 1
 * Co-Variant Return Type - Rule -2
 * 
 */
class X
{
	int a=10,b=20,c=30;
}
class XPlus extends X
{
	int d=90;
}
class Parent
{
	X print(){
		System.out.println("Parent Class Print...");
		X obj = new X();
		return obj;
	}
}
class Child extends Parent
{
	@Override
	public XPlus print(){
		System.out.println("Child Class Print...");
		XPlus xp = new XPlus();
		return xp;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		Parent parent = new Parent();
		l.add(parent);
		Child c = new Child();
		l.add(c);
		int p = 128;
		byte p1 = (byte)p;  // -128 to 127
		System.out.println(p1);
		Integer pp = 999; // Wrapper Class
		l.add(pp);
		l.add(22222);
		byte q = pp.byteValue(); //xxxValue
		pp.floatValue();
		pp.longValue();
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10));
	}

}
