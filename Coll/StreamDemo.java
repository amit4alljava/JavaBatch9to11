import java.util.ArrayList;

class CashCustomer{
	int id ;
	String name;
	double balance;
	CashCustomer(int id , String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name + "balance "+balance+"\n";
	}
}
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		for(int i = 1 ; i<=10 ; i++){
			l.add(i);
		}
		int intSum = l.stream().
				filter((current)->current>5)
				.mapToInt((current)->current).sum();
		System.out.println(intSum);
		ArrayList<CashCustomer> customerList = new ArrayList<>();
		for(int i = 1; i<=10; i++){
			customerList.add(new CashCustomer(i, "Ram"+i, 1000*i));
		}
		System.out.println(customerList);
		double sum = customerList.stream()
				.filter((currentObject)->currentObject.balance>5000
						&& currentObject.name.equals("ram"))
				.mapToDouble((current)->current.balance).sum();
		System.out.println("Sum is "+sum);
	}

}





