import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class SortById implements Comparator<Employee>{
	public int compare(Employee firstObject, Employee secondObject){
		return ((Integer)firstObject.getId()).compareTo((Integer)secondObject.getId());
	}
}
class SortByCity implements Comparator<Employee>
{
	public int compare(Employee firstObject, Employee secondObject){
		return firstObject.getCity().compareTo(secondObject.getCity());
	}
}
class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String city;
	@Override
	public int compareTo(Employee object){
		return this.name.compareTo(object.name);
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" City "+city+" \n";
	}
	Employee(int id , String name, String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
public class TreeSetDemo {
	static void takeSet(Set set){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		ArrayList<Employee> empList2 =new ArrayList<>();
		//Set<Employee> employeeSet = new TreeSet<>(); // Upcasting
		//TreeSet<Employee> employeeSet2 = new TreeSet<>(new SortById());
		TreeSet<Employee> employeeSet2 =
				new TreeSet<>((firstObject,secondObject)
				->firstObject.getCity().
				compareTo(secondObject.getCity()));
		Employee emp = new Employee(1001,"Ram","Mumbai");
		employeeSet2.add(emp);
		Employee emp2 = new Employee(1001,"Ram","Mumbai");
		employeeSet2.add(emp2);
		Employee emp3 = new Employee(1002,"Anil","Delhi");
		employeeSet2.add(emp3);
		System.out.println(employeeSet2);
		
		

	}

}








