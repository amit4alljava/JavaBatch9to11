import java.util.ArrayList;
import java.util.HashMap;

class Stack<T,E>
{
	T data;
	HashMap<T,E> map = new HashMap<>();
	ArrayList<T> list = new ArrayList<>();
	void push(T data){
		this.data = data;
		list.add(this.data);
	}
	void peep(){
		for(int i = list.size()-1; i>=0;i--){
			System.out.println(list.get(i));
		}
	}
	
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String,Integer> myStack = new Stack<>();
		myStack.push("ram");
		myStack.push("shyam");
		//myStack.push(1000);
		myStack.peep();
		Stack<Integer,Integer> myStack2 = new Stack<>();
		Stack<Double,Float> myStack3 = new Stack<>();
		Stack<Float,Long> myStack4 = new Stack<>();
	}

}




