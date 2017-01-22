
public class StringBadUse {

	public static void main(String[] args) {
		// StringBuffer Methods
		// CUD (Create (Add) , Update , Delete)
		// H e l l o
		StringBuilder sb2 = new StringBuilder(); // Java 5 Onwards
		// There is no synchronized method in StringBuilder
		// StringBuffer all methods are synchronized
		//StringBuffer sb2 = new StringBuffer();
		sb2.append("Hello"); // Append at End
		sb2.reverse();
		//sb2.insert(0, "Hi");
		//sb2.deleteCharAt(0);  // Single Char delete
		sb2.delete(1, 3); // 1st is index and 3 is position
		sb2.setCharAt(0, 'T'); // Update
		System.out.println(sb2);
		// Advance Search
		//String x = "hello"+"bye";
		double price = 9000;
		String brand = "nokia";
		//String sql = "select * from product";
		StringBuffer sb = new StringBuffer("select * from product");
		if(price>0){
			sb.append("where price>=").append(price);
			//sql = sql + " where price>="+price;
		}
		if(brand!=null && brand.length()>0){
			sb.append("and brand='").append(brand).append("'");
			//sql = sql +" and brand='"+brand+"'";
		}

	}
	
	
	
	
	

}
