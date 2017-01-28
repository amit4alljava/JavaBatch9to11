import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class IWantToPool{
	int age;
	String name;
	static ArrayList<IWantToPool> pool = new ArrayList<>();
	
	public static IWantToPool intern(int age, String  name){
		boolean isFound = false;
		if(pool.size()==0){
			IWantToPool obj = new IWantToPool(age,name);
			pool.add(obj);
			
			System.out.println("Pool is Empty and Now A Fresh Object is Added..");
			return obj;
		}
		else
		{
			for(IWantToPool obj : pool){
				if(obj.age==age && obj.name ==name){
					System.out.println("This Object is Present in a Pool");
					isFound=true;
					return obj;
					//break;
				}
			}
			if(!isFound){
				IWantToPool obj = new IWantToPool(age, name); 
				pool.add(obj);
				System.out.println("New Object Added in a Pool");
				return obj;
			}
		}
		return null;
	}
	
	private IWantToPool(int age, String name)
	{
		this.age = age;
		this.name  = name;
	}
	
}

final class MyImmutableClass{
	private final int x;
	private final int y;
	
	
	
	public MyImmutableClass(int x , int y) {
		this.x = x ;
		this.y = y;
	}
	public int getX(){
		return x;
		
	}
	public int getY(){
		return y;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// LoadFactor 0.5
		
		
		//IWantToPool pool[] = new IWantToPool[10];
		MyImmutableClass obj = new MyImmutableClass(100, 200);
		// it will create 0 or 1 Object in Memory
		String name2 = "amit".intern();
		String name = "amit"; // String Literal
		// it will create 2 or 1 Object
		String name3 = new String("ram");
		String name4 = new String("amit");
		name = "shyam";
		Date date = new Date();
		System.out.println(date);
		
		String e = "amit".intern();
		String e1 = "amit".intern();
		if(e==e1){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		String e2 = "ram".intern();
		if(e==e2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		//IWantToPool obj2 = new IWantToPool(21,"Ram");
		System.out.println("************************************");
		IWantToPool obj3 = IWantToPool.intern(21, "Ram");
		IWantToPool obj4 =IWantToPool.intern(21, "Ram");
		IWantToPool obj5 =IWantToPool.intern(22, "Ramesh");
		if(obj3 == obj4){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		if(obj3==obj5){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		/*
		 * String is a final class in Java
		 * String is Immutable Class
		 * String maintain String Pool
		 * String Internally as a Character Array
		 * String Methods
		 */
		String t = "amit";
		System.out.println(t.length());
		String t2 = t.toUpperCase();
		System.out.println(t2 + " "+t);
		System.out.println(t.toLowerCase());
		if("amit".equals(t)){
			System.out.println("Same Amit");
		}
		if("AMIT".equalsIgnoreCase(t)){
			System.out.println("Same Amit");
		}
		String y = "Dr Ram Kumar";
		if(y.startsWith("Dr")){
			System.out.println("Hello Doctor ");
		}
		else
		{
			System.out.println("Hi");
		}
		if(y.endsWith("Kumar")){
			System.out.println("Hello Kumar");
		}
		String email = "a_mi_t@gmail.com";
		int index = email.indexOf("@");  // email.lastIndexOf("_");
		if(index>=0){
			System.out.println("Valid Email");
			
		}
		else
		{
			System.out.println("Invalid Email");
		}
		boolean result= email.contains("gmail");
		email = email.replace("gmail", "yahoo");
		index = 2;
		int pos = 4;
		String subStringValue = "amit".substring(index, pos);
		System.out.println(subStringValue);
		String myname = "           amit      srivastava        ";
		myname = myname.trim();
		char array [] = myname.toCharArray();
		Arrays.sort(array);
		myname = new String(array);
		System.out.println("Now After Sort "+myname);
		char t3 = myname.charAt(0);
		String r = ""+t3;
		r.concat(String.valueOf(t3));
		String msg = "Hello How are You";
		String ar[] = msg.split(" ");
		System.out.println("Word Count "+ar.length);
		/*if(t!=null && t.equals("amit")){
			System.out.println("Same Amit");
		}*/
		

	}

}
