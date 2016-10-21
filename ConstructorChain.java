 /*WeakerAccess Rule
  CoVariant Return type 
*/
class Parent
{
	final int MIN_AGE;
	 int x=20,y;
	void print(){
		final int P;
		if(x>2){
		P=100;
		}
		else{
			P=999;
		}
		System.out.println("Print Call of Parent "+P);
	}
	void display(){
		System.out.println("Display call of parent");
	}
	 void show(){
		System.out.println("Parent Show call");
	}
	Parent(){
		MIN_AGE=18;
		System.out.println("Parent class Default cons call");
		//x = 1200;
		y = 2000;
	}
	Parent(int x, int y){
		this();
		System.out.println("Parent class Param cons call");
		this.x = x;
		this.y = y;
	}
	
}
class Child extends Parent
{
	int x =1;
	int y = 2222;
	int z;
	void output(){
		System.out.println("Child class output call");
	}
	@Override
	 void print(){
		System.out.println("Child Print Call");
	}
	@Override
	void show(){
		super.show();
		System.out.println("Child Show Call");
	}
	Child(){
		//super(10,20);
		// super(); // this will calll parent class default cons
		z = 300 + this.x+ super.x + y;
		System.out.println("Child class default cons call"+z);
	}
	Child(int z ){
		//this();
		//super(100,200);
		this.z = z + x + y;
		System.out.println("Child Class Param Cons Call "+this.z);
		
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent child = new Child();
		child.show();
		child.print();
		child.display();
		//child.output();
		System.out.println(child.x+" "+child.y);
		//child.print();
		final int P = 90;
		final Child child2 = new Child();
		child2.x++;
		//child2 = new Child();
	}

}
