interface E
{
	int add(int x, int y);
	int add(int x, int y ,int z);
}
interface EE
{
	int add(int x, int y , int z , int m);
}
class E1 implements E, EE
{
	@Override
	public int add(int x, int y ){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int add(int x, int y , int z){
		return x + y + z;
	}
	public int add(int x , int y , int z , int m){
		return x + y + z + m;
	}
}
public class InterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj = new E1();
		//System.out.println(obj.add(10, 20,30,40));
		System.out.println(obj.add(10, 20,30));
		System.out.println(obj.add(10, 20));
		//System.out.println(obj.subtract(10, 20));
	

	}

}
