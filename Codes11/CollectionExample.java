import java.util.ArrayList;
class MyInteger
{
int value1;
int value2;
}
public class CollectionExample {

	public static void main(String[] args) {
		// List 
		// List has 3 Flavours
		// 50% Size Increase
		int t = 10;
		Integer t1 = new Integer(10); //boxing
		int mm = t1.intValue(); // unboxing
		Integer nn = 100; // AutoBoxing
		int tttt = nn; // AutoBoxing
		String n ="mike";
		Object temp = "mike";  // Upcasting
		Object t7 = new String("mike"); // Upcasting
		temp = 1000;
		temp = 10.20;
		// It is a non generic type and it can take anything
		// so type casting is requried
		//ArrayList list = new ArrayList();
		// this is the generic type and it can take only Integer
		ArrayList<Integer> list = new ArrayList<Integer>();  
		//list.add("amit");
		list.add(1001);
		list.add(1002);
		int k = list.get(0);
		//list.add(true);
		//list.add(1,"ram");
		list.remove(0);
		//String name = (String)list.get(0);  // Downcasting
		Integer t12 = (Integer)list.get(1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
