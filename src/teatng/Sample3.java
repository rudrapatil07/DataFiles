package teatng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{
    @Test
	public void test1()
	{
    	
    	//Assert.fail("This test is failed");
		Reporter.log("test 1 is running");
	}
    @Test
	public void test2()
	{
		Reporter.log("test 2 is running");
	}
    @Test
	public void test3()
	{
    	
    	
		Reporter.log("test 3 is running");
	}
    @Test
	public void test4()
	{
		Reporter.log("test 4 is running");
	}
    @Test
	public void test5()
	{
    	//Assert.fail("This test is failed");
		Reporter.log("test 5 is running");
	}
    
	
	
	
	
}
