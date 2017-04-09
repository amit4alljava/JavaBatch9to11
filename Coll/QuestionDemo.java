import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
class Order
{
	int id;
	String name;
	ArrayList<Product> productList = new ArrayList<>();
}
class Product
{
	int id;
	String name;
	double price;
}
class Address implements Comparable<Address>{
	String state;
	String city;
	String streetAddress;
	public int compareTo(Address address){
		return this.city.compareTo(address.city);
	}
	Address(String state, String city, String streetAddress){
		this.state = state;
		this.city = city;
		this.streetAddress = streetAddress;
	}
	public String toString(){
	return "State "+state + " City "+city +" StreetAddress "+streetAddress;
	}
}
class OnlineCustomer
{
	int id;
	String name;
	HashMap<String,TreeSet<Address>> addressmap = new HashMap<>();
	HashMap<Integer,Order> orderMap = new HashMap<>();
	OnlineCustomer(int id , String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "id "+id +" Name "+name+"\n";
	}
}
public class QuestionDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in)
;		HashMap<String,OnlineCustomer> customerMap = new HashMap<>();
		OnlineCustomer customer = new OnlineCustomer(1001,"ram");
		Address address11 = new Address("Delhi","Delhi","Roop nagar");
		Address address22 = new Address("MH","Mumbai","Ved nagar");
		Address address33 = new Address("Delhi","Delhi","Roop nagar");
		TreeSet<Address> resAddressSet = new TreeSet<>();
		resAddressSet.add(address11);
		resAddressSet.add(address22);
		resAddressSet.add(address33);
		Address address1 = new Address("Delhi","Delhi","Shakti nagar");
		Address address2 = new Address("MH","Mumbai","Ved nagar");
		Address address3 = new Address("Delhi","Delhi","Shakti nagar");
		TreeSet<Address> officeSet = new TreeSet<>();
		officeSet.add(address2);
		officeSet.add(address1);
		officeSet.add(address3);
		
		HashMap<String,TreeSet<Address>> addressMap = new HashMap<>();
		addressMap.put("office", officeSet);
		addressMap.put("res", resAddressSet);
		customer.addressmap = addressMap;
		customerMap.put(customer.name, customer);
		OnlineCustomer customer2 = new OnlineCustomer(1002,"shyam");
		customerMap.put(customer2.name, customer2);
		System.out.println("Enter the Customer name to search");
		String name = scanner.next();
		OnlineCustomer object = customerMap.get(name);
		System.out.println(object);
		System.out.println("Enter the Address Type office , res");
		String addressType = scanner.next();
		System.out.println(addressType+" Address "+object.addressmap.get(addressType));
		// TODO Auto-generated method stub

	}

}






