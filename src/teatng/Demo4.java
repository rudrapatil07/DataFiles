package teatng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4
{

	@Test(enabled=false)
	public void test1()
	{
		Reporter.log("Hello there ...",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Hello GUyss",true);
	}
	@Test(enabled=false)
	public void test3()
	{
		Reporter.log("Hello Girls ...",true);
	}
	@Test
	public void test4()
	{
		Reporter.log("good evening Ladies and Gentalman ...",true);
	}
	@Test
	public void test5()
	{
		Reporter.log("Good Evening MY Brother and Sisters",true);
	}
	
	
	
}
