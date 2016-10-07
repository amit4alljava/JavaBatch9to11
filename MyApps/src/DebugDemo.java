
public class DebugDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int starMinus = 0;
		for(int i = 1; i<=7;i++){  // Rows
			for(int j = 1; j<=i-starMinus; j++){  // Stars
				System.out.print("*");
				if(i>=5){
					starMinus++;
				}
			}
			
			System.out.println();
		}

	}

}
