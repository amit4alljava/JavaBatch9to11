interface X
{
	int A=10;
	void show();
	void print();
}
interface Y{
	int A = 20;
	void show();
}
interface Z extends X,Y{
	void add();
}
class ZImpl implements Z{

	@Override
	public void show() {
		System.out.println(X.A + Y.A);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
