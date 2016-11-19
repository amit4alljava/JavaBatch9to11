class T
{
	void print(){
		 int pp=100;
		System.out.println("T Print Call..");
		class E
		{
			void display(){
				//pp++;
				//System.out.println("E Display Call..."+pp);
			}
		} // class end
		pp++;
		System.out.println("PP is "+pp);
		E obj = new E();
		obj.display();
	} // method end
}
class A
{
	static class B
	{
		static void show(){
			System.out.println("B Show...");
		}
	}
}

class Outer
{
	 int x =10; 
	 Outer(){
		 System.out.println("Outer Class Cons Call");
		 // 1st Way
		 //Inner inner = new Inner();
	 }
	 
	 interface P
	 {
		 void print();
	 }
	 class Parent implements P{
		 int x  = 100;
		 Parent(){
			 System.out.println("I am Paren Class");
		 }
		 public void print(){
			 System.out.println("Parent Print Call");
		 }
	 }
	 
	// Member Class
	 class Inner extends Parent
	{
		 int x=20 ;
		Inner(){
			System.out.println("Inner Class Cons Call");
		}
		Inner(int x){
			int z = Outer.this.x + this.x + x + super.x;
			System.out.println("Z is "+z);
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		//Outer outer =new Outer();
		// 2nd way
		//Outer.Inner inner = outer.new Inner();
		// 3rd Way
//		Outer.Inner obj = new Outer().new Inner(90);
//		// TODO Auto-generated method stub
//		Outer.Parent p = new Outer().new Parent();
//		A.B.show();
		T obj = new T();
		obj.print();
	}

}
