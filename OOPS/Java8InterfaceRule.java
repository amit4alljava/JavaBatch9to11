interface Q1
{
	void print();
	default void show(){
		System.out.println("Q1 SHow Call");
	}
}
interface W1
{
	default void show(){
		System.out.println("W1 Show Call");
	}
}
class Q2 implements Q1,W1
{
	@Override
	public void show(){
		Q1.super.show();
		W1.super.show();
		System.out.println("Q2 Show....");
	}
	public void print(){
		System.out.println("Print Call...");
	}
}
public class Java8InterfaceRule {

	public static void main(String[] args) {
		Q2 obj = new Q2();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

}
