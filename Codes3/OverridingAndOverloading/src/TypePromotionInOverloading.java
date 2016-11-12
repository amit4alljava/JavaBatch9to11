// 1st  start with int
// Closest Wideing Win
// Similar Wrapper Win
// var args win

class Example
{
	void show(long ...x){
		System.out.println("Var Args Call");
	}
	void show(byte x){
		System.out.println("byte call");
	}
//	void show(int x){
//		System.out.println("int call");
//	}
//	void show(long x){
//		System.out.println("long call");
//	}
//	void show(double x){
//		System.out.println("double call");
//	}
//	void show(Integer w){
//		System.out.println("Integer Wrapper ");
//	}
	void show(Long l){
		System.out.println("Long Wrapper");
	}
}
public class TypePromotionInOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example= new Example();
		example.show(10);
		
	}

}
