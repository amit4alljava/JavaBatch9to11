class A
{
	int x=10,y;
	void display(){
		System.out.println("A Disp Call");
	}
	void print(){
		System.out.println("A Print Call");
	}
}
class B extends A{
	int z;
	int x=20;
	@Override
	void print(){
		super.print();
		System.out.println("B Print Call");
	}
	void show(){
		System.out.println("B Show Call");
	}
}
public class ISADemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(); //Upcasting
		obj.print();
		System.out.println(obj.x);
		//obj.display();
		//B b1 = (B) obj; // Downcasting
		//b1.show();
		

	}

}
