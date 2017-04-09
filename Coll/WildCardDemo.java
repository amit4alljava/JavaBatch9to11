import java.util.ArrayList;
interface S{}
class T implements S{}
class A extends T{}
class C extends A{}
class B extends A{}
class D{}
public class WildCardDemo {
	// this function can take same type and sub types
	static void print(ArrayList<? extends S> list){
	//static void print(ArrayList<? super A> list){
	//static void print(ArrayList<Object> list){
	//static void print(ArrayList<?> list){
	}
	public static void main(String[] args) {
		Object temp = "Amit";
		temp = 10.20;
		temp = true;
		temp = 100;
		//String r = "Amit";
		//r = 100;
		// TODO Auto-generated method stub
		ArrayList<A> l = new ArrayList<>(); //  Generic (It only Allow A)
		print(l);
		ArrayList<T> l5 = new ArrayList<>();
		print(l5);
		ArrayList<B> l2 = new ArrayList<>();
		ArrayList<C> l3 = new ArrayList<>();
		ArrayList<D> l4 = new ArrayList<>();
		print(l2);
		print(l3);
		//print(l4);
		A [] arr = {new A(), new B(), new C()}; // it can same type and sub type
		A obj = new B();

	}

}
