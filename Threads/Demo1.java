
public class Demo1 {
	static void print(){
		System.out.println("This is Print "+Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread());
		print();
	}

}
