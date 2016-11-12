import java.util.LinkedList;
import java.util.TreeSet;
class Employee{
	int id;
	String name;
	double salary;
}

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp [] = new Employee[3];
		// I want to Store N Number of Songs
		// I Want No Duplicate Song
		// And Song Must be Sorted in Ascending Order
		TreeSet<String> set = new TreeSet<String>();
		set.add("It's My Life");
		set.add("Boom Boom");
		set.add("Boom Boom");
		set.add("Bang Bang");
		set.add("It's My Life");
	//	set.add(new Employee());
		System.out.println(set);
		// Java 1.5 AutoBoxing
		int p = 100;
		int q = 200;
		Integer a1 = 100; //Boxing
		Integer a2 = 200;
		Integer a3 = a1 + a2;
		System.out.println("AutoBoxing "+a3);
		// Java 1.4
		
		Integer k= new Integer(p); //Boxing
		Integer k2 = new Integer(q);
		//int i = k.intValue();  //xxxValue
		int sum = k.intValue() + k2.intValue(); // UnBoxing
		Integer sum2 = new Integer(sum); // Boxing
		System.out.println("Sum "+sum);
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(k);
		list.add(k2);
		list.add(sum2);
		
		//Integer y = p;
		

	}

}
