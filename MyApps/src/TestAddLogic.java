import org.junit.Assert;
import org.junit.Test;
public class TestAddLogic {
	@Test
	public void testcase1(){
		MyAddLogic logic = new MyAddLogic();
		int expectedResult = 30;
		int result = logic.add(10, 20);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testcase2(){
		MyAddLogic logic = new MyAddLogic();
		int expectedResult = 30;
		int result = logic.add("10", "20");
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testcase3(){
		MyAddLogic logic = new MyAddLogic();
		int expectedResult = 0;
		int result = logic.add("ten", "two");
		Assert.assertEquals(expectedResult, result);
	}

}
