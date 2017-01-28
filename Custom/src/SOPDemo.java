import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SOPDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/"
				+ "FileHandlingTestingCase/a/myoutput.txt";
		System.setOut(new PrintStream(path));
		System.out.println("Hello Java");

	}

}
