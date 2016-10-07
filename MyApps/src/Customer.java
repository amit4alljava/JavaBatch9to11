// OOPS
// OOAD  
// S O L I D
/*
 * Class is a Collection of Memeber Variables and Member Methods
 * Encapsulation - Data Binding 
 * Binding data with Methods
 * e.g. of Encapsulation - class is an example of Encapsulation
 * Good Encapsulation - private Member Variables (Data Hiding)
 *  and public methods
 * are called Good Encapsulation
 */


//S -  SRP - Single Responsiblity Principle
// D - Don't Repeat YourSelf
public class Customer  {
// Instance Variables (Divide in 2 Category)
	// 1. Primary Instance Variables
	// 2. Secondary Instance Variables
	private int id; //  Instance Variables Member Variables
private String name;
private String phone;
private double balance;
private String companyName;
private String alternatePhone;
private String city;
private String state;
private String pinCode;



// Constructor is always same as class name
// Constructor not return any thing 
// it is only used to initialize the values
// We cannot create object without calling constructor
// Every class by default has default construtor
// If u create any constructor so the default is kill automatically



public String getName() {
	return name;
}

public int getId() {
	return id;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getAlternatePhone() {
	return alternatePhone;
}

public void setAlternatePhone(String alternatePhone) {
	this.alternatePhone = alternatePhone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPinCode() {
	return pinCode;
}

public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}

// Parametrized Constructor
// Take Local Variables Value and Give it to Instance Variable 
Customer(int id, String name , String phone , double balance){
	this();
	this.id = id*companyName.length();
	this.name = name;
	this.phone = phone;
	this.balance = balance;
}

//{
//	System.out.println("Init Block I am Call Before Cons Call id "+id+ " Name "+name);
//}

// this is default constructor
Customer(){
	//System.out.println("I am a Constructor");
	companyName = "FlipKart";
////	id = 1001;
////	name = "Ram";
////	phone ="2222";
////	balance = 7777;
}

// i , n  , p , b - Local Variables
public void takeInput(int i , String n , String p , double b){
	if(i>0 && b>0){
	id = i;
	name = n ;
	phone = p;
	balance = b;
	}
	else{
		System.out.println("Invalid Input");
	}
			
}

public void print(){
	System.out.println("Id "+this.id); // 1222.id
	System.out.println("Name "+name);
	System.out.println("Phone "+phone);
	System.out.println("Balance "+balance);
	System.out.println("Company Name "+companyName);
}
}










