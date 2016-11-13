// SAM Interface
interface T11{
	void show();
}
@FunctionalInterface
interface Calculator {
	int calc(int x, int y);
	//int add(int x, int y);
}
// 1st Way 
// Create a Class and then implement the interface and override
// the methods and then create the object of a class
class MyCalc implements Calculator{
	@Override
	public int calc(int x, int y){
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			return a+b;
		};
		System.out.println(c.calc(90, 20));
		
//		if(10>2){
//		Calculator calcObj = new Calculator(){
//			@Override
//			public int calc(int x, int y){
//				return x + y;
//			}
//		};
//		int result = calcObj.calc(10, 20);
//		System.out.println(result);
//		}
		
//		Calculator calc = new MyCalc(); // Upcasting
//		int sum = calc.calc(90, 100);
//		System.out.println("Sum is "+sum);
	}

}










