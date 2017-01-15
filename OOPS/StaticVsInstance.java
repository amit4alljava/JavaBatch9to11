class T
{
	int p ;  // I will come when object is Created
	static int q; // I Will Come When Class is Loaded
	T(){
		p++;
		q++;
		System.out.println("P is "+p+" and q is "+q);
		
	}
}
class T1 extends T{
	int p;
}
public class StaticVsInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(T.q);
		//System.out.println(T.p);
		T obj= new T();
		T obj2= new T();
		
	}

}
