import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class T implements Serializable
{
	int z ;
	T(){
		z = 1000;
	}
}
class Parent implements Serializable
{
	String name = new String("Hello");
	int x ;
	//T obj = new T();  // Has - A
	Parent(){
		x = 100;
		System.out.println("Parent Cons call");
	}
	
}
class Child extends Parent //implements Serializable
{
	int y;
	Child(){
		y = 200;
		System.out.println("Child Cons Call");
	}
}
public class SerializeInISA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Child obj= new Child();
		obj.x = obj.x + 100;
		obj.y = obj.y + 200;
		String path ="/Users/amit/Documents/TestFileHandlingFeb/ISa.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(obj);
		os.close();
		fs.close();
		System.out.println("Object Write...");
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Child ch = (Child)oi.readObject();
		System.out.println(ch.x + " "+ch.y+" "+ch.name);
		oi.close();
		fi.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
