interface Royal{
	
}
class Rahul implements Royal{
	
}
class Modi {
	
}
public class WhyMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul r = new Rahul();
		if(r instanceof Royal){
			System.out.println("Good Treatment....");
		}
		Modi m = new Modi();
		if(m instanceof Royal){
			System.out.println("Good Treatment....");
			
		}
		else
		{
			System.out.println("Earn Good Treatment....");
		}

	}

}
