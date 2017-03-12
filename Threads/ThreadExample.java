class Job implements Runnable {
	@Override
	public void run(){
		// Logic
		for(int i = 1; i<=5 ; i++){
			System.out.println("I is "+i+" Thread "
		+Thread.currentThread().getName());
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		worker.setDaemon(true);
		Job job2 = new Job();
		Thread worker2 = new Thread(job2,"shyam");
		
		worker.start();
		worker2.start();
		System.out.println("Worker "+worker.isDaemon());
		//System.out.println("Main "+Thread.currentThread().isDaemon());
	}

}
