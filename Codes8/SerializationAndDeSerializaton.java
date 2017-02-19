import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id ;
	String name;
	double salary;
	double bonus = 999;
	int PF = 1000;
	Employee(int id, String name, double salary){
		System.out.println("Emp Cons Call...");
		this.id = id;
		this.name = name;
		this.salary =salary;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Salary "+salary+" Bonus "+bonus+" PF "+PF;
	}
}
public class SerializationAndDeSerializaton {

	public static void main(String[] args) throws IOException {
		Employee ram = new Employee(1001,"Ram",9999);
		ram.salary = ram.salary + 5000;
		String path = "/Users/amit/Documents/TestFileHandlingFeb/Emp.dat";
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Object Store. in a file...");
		
		

		
		
		
		
		
	}

}





