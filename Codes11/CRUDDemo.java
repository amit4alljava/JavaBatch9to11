import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;
// What is Utility Class
// All methods are static and Constructor is private 
// and class is final
// Utility Interface
//interface CustomerOperations{
final class CustomerOperations{
	
	private CustomerOperations(){}
	// It is a generic ArrayList , it hold the customer objects
	 static final ArrayList<Customer> customerList = new ArrayList<>();
	public static void addNewCustomer(int id , String name, double salary){
		Customer customer = new Customer(id ,name ,salary);
		customerList.add(customer);
		System.out.println("Record Added...");
	}
	
	public static boolean deleteRecord(Customer deleteObject){
		int index = customerList.indexOf(deleteObject);
		if(index>=0){
			customerList.remove(index);
			return true;
		}
		return false;
	}
	
	public static boolean isFound(Customer searchObject){
		return customerList.contains(searchObject);
	}
	
	
	static double totalSalary = 0.0;
	public static double getTotalSalary(){
		// Traverse the ArrayList
		// 1st Way (Traditional Style)
		//int ee [] = new int[10];
		//System.out.println(ee.length);
		
//		for(int i = 0 ; i<customerList.size(); i++){
//			Customer customerCurrentObject = customerList.get(i);
//			totalSalary = totalSalary + customerCurrentObject.getSalary();
//		}
		// 1.4 (Iterator) 2nd Way
		Iterator<Customer> customerIterator = customerList.iterator();
		while(customerIterator.hasNext()){
			// next() - get the current object and move to next object
			Customer customerObject = customerIterator.next();
			totalSalary = totalSalary + customerObject.getSalary();
			//customerIterator.remove();
		}
		
		// 1.4 ListIterator  3rd Way
		ListIterator<Customer> customerListIterator = customerList.listIterator();
		while(customerListIterator.hasNext()){
			Customer customerObject = customerListIterator.next();
			totalSalary = totalSalary + customerObject.getSalary();
		}
		while(customerListIterator.hasPrevious()){
			// give current object and move to previous object
			Customer customerObject = customerListIterator.previous();
			totalSalary = totalSalary + customerObject.getSalary();
		}
		// 4th Way (Enhance For Loop (Java 1.5))
		for(Customer customerObject : customerList){
			totalSalary = totalSalary + customerObject.getSalary();
		}
		//5th Way forEach function (Java 1.8)
		customerList.forEach((customerObject)
				->totalSalary+=customerObject.getSalary());
		
		
		return totalSalary;
	}
}
class Customer{
	private int id;
	private String name;
	private double salary;
	Customer(int id, String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object object){
		boolean isFound = false;
		if(object instanceof Customer){
		Customer customer = (Customer) object; // Downcasting
		if(this.id == customer.id && 
				this.name.equals(customer.name)
				&& this.salary == customer.salary){
			isFound = true;
		}
		}
			return isFound;
	}
	
	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id "+id + "Name "+name+" Salary "+salary+"\n";
	}
	
	
}
public class CRUDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		while(true){
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Search");
		System.out.println("4. Update");
		System.out.println("6. Read");
		System.out.println("7. Total Salary");
		System.out.println("5. Exit");
		int choice = scanner.nextInt();
		if(choice ==1){
			System.out.println("Enter the Id");
			int id = scanner.nextInt();
			System.out.println("Enter the Name");
			String name = scanner.next();
			System.out.println("Enter the Salary");
			double salary = scanner.nextDouble();
			CustomerOperations.addNewCustomer(id, name, salary);		
		}
		else
		if(choice == 6){	
			System.out.println(CustomerOperations.customerList);
		}
		else
		if(choice ==2){	
		
			System.out.println("Enter the Id  To Delete");
			int id = scanner.nextInt();
			System.out.println("Enter the Name to Delete");
			String name = scanner.next();
			System.out.println("Enter the Salary to Delete");
			double salary = scanner.nextDouble();
			Customer deleteObject = new Customer(id ,name, salary);
			if(CustomerOperations.deleteRecord(deleteObject)){
				System.out.println("Record Delete");
				System.out.println(CustomerOperations.customerList);
			}
			else
				System.out.println("Record Not Found Can't Delete");
			
		}
		else
		if(choice == 7){
			System.out.println(CustomerOperations.getTotalSalary());
		}
		else
		if(choice == 3){
			System.out.println("Enter the Id  To Search");
			int id = scanner.nextInt();
			System.out.println("Enter the Name to Search");
			String name = scanner.next();
			System.out.println("Enter the Salary to Search");
			double salary = scanner.nextDouble();
			Customer searchCustomerObject = new Customer(id, name,salary);
			if(CustomerOperations.isFound(searchCustomerObject)){
				System.out.println("Customer Found...");
			}
			else
			{
				System.out.println("Customer Not Found...");
			}
		}
		}
		

	}

}








