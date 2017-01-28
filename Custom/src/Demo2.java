
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the default capacity of StringBuffer is 16 
		// And once the capacity is overflow
		// new capacity = old capacity * 2 + 2
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("How are you i am fine ");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(500);
		System.out.println("Now New Capacity is "+sb.capacity());
		

	}

}
