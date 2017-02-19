import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/TestFileHandlingFeb/Emp.dat";
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Employee emp = (Employee)oi.readObject();
		System.out.println(emp);
		oi.close();
		fi.close();

	}

}
