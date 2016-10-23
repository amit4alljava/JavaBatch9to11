 class FinalDemo
{
	int p ;
	double q;
	String t ;
	private final void print(){
		System.out.println("This is Parent class print");
	}
	{
		System.out.println("Init Block Call "+p +" "+q+" "+t);
	}
	FinalDemo(){
		System.out.println("Cons Call "+p +" "+q+" "+t);
	}
//	final int MAX ; // Instance Variables
//	
//	
//	FinalDemo(){
//		MAX = 100;
//	}
}
class FinalChild extends FinalDemo{
	
	void print(){
		System.out.println("Child Class Print...");
	}
}
public class FinalUseDemo {

	public static void main(String[] args) {
		
		final FinalDemo demo = new FinalDemo();
		demo.p++;
		demo.q++;
		//demo = new FinalDemo();
		// TODO Auto-generated method stub
		final double PI=3.14; // To Define Constants
		// Local Varible can have a Modifier called final
//		int x = 10;
//		if(x>2){
//		PI = 3.14;
//		}
		//System.out.println(PI);
		
		
		

	}

}
