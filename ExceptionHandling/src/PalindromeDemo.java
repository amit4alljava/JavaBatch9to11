import org.omg.Messaging.SyncScopeHelper;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer org = new StringBuffer("nitin");
		StringBuffer dup =new StringBuffer("nitin");
		dup.reverse();
		System.out.println("Org "+org +" dup "+dup);
		if(org.toString().equals(dup.toString())){
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}

	}

}
