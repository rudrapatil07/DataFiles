package teatng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3
{
     @Test
	public void test1()
	{
		Reporter.log("Hi My name is Nitesh",true);
	}
     @Test(priority=-2)
 	public void test2()
 	{
 		Reporter.log("I am A electrical Engineer",true);
 	}
 	
     @Test(priority=-3)
 	public void test3()
 	{
 		Reporter.log("From Dhule",true);
 	}
 	
     @Test(priority=-1)
 	public void test4()
 	{
 		Reporter.log("GaRaduation Completed in BaMu",true);
 	}
 	
     @Test(priority=1)
 	public void test5()
 	{
 		Reporter.log("Currently work as Software Tester",true);
 	}
 	
	
	
	
	
	
	
	
	
	
	
	
	
}
