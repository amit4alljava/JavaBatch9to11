import java.util.HashMap;
import java.util.Map;

public class SystemInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = {30,42, 18 , 44};
		HashMap<String, Integer> tempMap = new HashMap<>();
		tempMap.put("delhi", 18);
		tempMap.put("mumbai",30);
		System.out.println(tempMap.get("delhi"));
		Map<String,String> map = System.getenv();
		//java.specification.version
		//user.name
		//os.name
		//line.separator
		//os.arch
		//sun.boot.library.path
		//user.country.format
		System.out.println("OS "+System.getProperties().getProperty("os.name"));
		System.out.println("Java Version"+System.getProperties().getProperty("java.specification.version"));
		//System.out.println(map);
	}

}
