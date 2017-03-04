class X extends Object implements Cloneable
{
	int r, p;
	X(){
		r = 100;
		p = 200;
		System.out.println("Cons Call");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		X obj = new X();
		obj.r  = obj.r * 10;
		obj.p = obj.r + obj.p;
		X obj2 = (X)obj.clone();
		System.out.println("After Clone "+obj2.r+" "+obj2.p);
		System.out.println(obj==obj2?"Same Ref":"not Same Ref");
		//X obj2 = obj;

	}

}












