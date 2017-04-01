import java.util.HashSet;
import java.util.LinkedHashSet;

// I want to create N Songs and the List
// must be sorted and it doesn't have repeated songs

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> songs = new LinkedHashSet<>();
		//HashSet<String> songs = new HashSet<>();
		//TreeSet<String> songs = new TreeSet<>();
		songs.add("I got the Power");
		songs.add("Boom Boom");
		songs.add("Boom Boom");
		songs.add("I got the Power");
		songs.add("Bang Bang");
		System.out.println(songs);
		
	}

}
