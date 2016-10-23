/*
 * Rule-1 Weaker Access Rule
 * Rule-2 Covariant Return type
 * Rule-3 Sub Checked Exception Rule
 */
class T1
{
	void show(){
		System.out.println("T Show");
	}
}
class T2 extends T1
{
	@Override
	void show(){
		System.out.println("T Show Override");
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
