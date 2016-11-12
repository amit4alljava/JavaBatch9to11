class Calc
{
	int sum(int ...x){
		int result = 0;
		for(int i : x){
			result = result + i;
		}
		return result ;
	}
}
public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		System.out.println(calc.sum());
		System.out.println(calc.sum(10));
		System.out.println(calc.sum(10,20));
		System.out.println(calc.sum(10,20,30));
		System.out.println(calc.sum(10,20,30,40));
		System.out.println(calc.sum(10,20,30,40,50));
		System.out.println(calc.sum(10,20,30,40,50,60));
		
		
		
	}

}
