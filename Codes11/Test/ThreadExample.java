class Account  // POJO 
{
	
	public static void show(){
		System.out.println("Static....");
	}
	
	public static void show2(){
		System.out.println("Static....");
	}
	public  void withDraw(){
		System.out.println("With Draw...");
	}
}
class Job implements Runnable {
	int instanceVar;
	Account account = new Account();
	@Override
	public  void run(){
		// Logic
		// 50 Lines Logic  (read)
		// 2 Line Logic Update (Synchronized)
		synchronized (Account.class) {
			Account.show();
			Account.show2();
		}
		synchronized (account) {
			account.withDraw();
		}
		synchronized(this){
			instanceVar++;
			// some more calc
		}
		for(int i = 1; i<=5 ; i++){
			System.out.println("I is "+i+" Thread "
		+Thread.currentThread().getName()+" Instance "+instanceVar);
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		synchronized (sb) {
			sb.append("Hi");
			sb.append("Hi");
			sb.append("Hi");
			sb.append("Hi");
			
		}
		// TODO Auto-generated method stub
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		worker.setPriority(Thread.MAX_PRIORITY);
		//worker.setDaemon(true);
		//Job job2 = new Job();
		Thread worker2 = new Thread(job,"shyam");
		worker2.setPriority(Thread.MIN_PRIORITY);
		worker.start();
		worker.join();
		worker2.start();
		//System.out.println("Worker "+worker.isDaemon());
		//System.out.println("Main "+Thread.currentThread().isDaemon());
	}

}
