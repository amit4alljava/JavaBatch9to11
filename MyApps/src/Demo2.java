
public class Demo2 {

	public static void main(String[] args) {
		// Big O Notation
		String a = "amit";
		String b = null;
		Runtime r = Runtime.getRuntime();
		//System.nanoTime()
		System.out.println("Total Heap Size "+r.totalMemory());
		System.out.println("Free Heap Size "+r.freeMemory());
		System.out.println("Used Heap Size "+(r.totalMemory()-r.freeMemory()));
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000 ; i++){
			b="amit";
			//b= new String("amit");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("***********************************");
		System.out.println("Total Heap Size "+r.totalMemory());
		System.out.println("Free Heap Size "+r.freeMemory());
		System.out.println("Used Heap Size "+(r.totalMemory()-r.freeMemory()));
		
		System.out.println("Total Time Taken "+(endTime-startTime));
	}

}
