import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
class Song
{
	double price;
	String name;
	String albumName;
	int duration;
}
public class ArrayListDemo {
// CRUD 
	// 1. Create 2. Read  3. Update  4. Delete
	// 5. Search 6. Sort
	public static void main(String[] args) {
		// Add / Delete Operation Frequent
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("amit");
		linkedList.addFirst("ram");
		linkedList.addLast("shyam");
		linkedList.removeLast();
		linkedList.removeFirst();
		linkedList.remove(0);

		
		ArrayList<String> l = new ArrayList<>();
		List<String> l2 = Collections.synchronizedList(l);
		l2.add("amit");
//		synchronized (l) {
//			l.add("ram");
//		}
		
		// Synchronized 
		// More Methods (Old + New ArrayList)
		Vector<String> vector = new Vector<>();  // Legacy Class (1.2)
		vector.addElement("ram");
		vector.add("shyam");
		
		
		int e ;
		Song song ; 
		ArrayList<Song> songs = new ArrayList<Song>();
		// TODO Auto-generated method stub
		ArrayList<String> songList = new ArrayList<String>();
		songList.add("Boom Boom");  // Create
		songList.add("Bang bang");
		//System.out.println(songList);
		//System.out.println(songList.toString());
		songList.add(1,"It's My life");
		songList.set(0, "I Got the Power");  // Update
		//songList.remove(0);  // Delete
		System.out.println(songList);  // Read
		boolean isFound = songList.contains("Bang bang"); // Searching
		if(isFound){
			System.out.println("Song Found..");
		}
		else
		{
			System.out.println("Song Not Found..");
		}
		
		// Sorting
		Collections.sort(songList);
		System.out.println("After Sort");
		System.out.println(songList);
	}

}
