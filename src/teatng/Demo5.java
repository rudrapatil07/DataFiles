package teatng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5
{

	@Test(timeOut=2100)
	public void test1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("HEloo there=",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("MY self nitesh",true);
	}
	
	
	
	
	
	
	
	
	
}
