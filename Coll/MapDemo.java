import java.util.ArrayList;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map is used to store key (No Duplicate) and value (Duplicate)
		TreeMap<String,ArrayList<Integer>> phoneMap = new TreeMap<>();
		ArrayList<Integer> amitPhones = new ArrayList<>();
		amitPhones.add(43435);
		amitPhones.add(23435);
		amitPhones.add(43436);
		amitPhones.add(43437);
		phoneMap.put("amit", amitPhones);
		ArrayList<Integer> ramPhones = new ArrayList<>();
		ramPhones.add(54555);
		ramPhones.add(5555);
		phoneMap.put("ram", ramPhones);
		//phoneMap.put("amit", 32323);
		//phoneMap.put("amit", 22323);
		//phoneMap.put("ram", 12323);
		//phoneMap.put("shyam", 12323);
		System.out.println(phoneMap.get("ram"));
		System.out.println(phoneMap);
		
		
		

	}

}
