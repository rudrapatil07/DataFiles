package teatng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {

	@Test(groups="login")
	public void test1()
	{
		Reporter.log("test1 is pass",true);
	}
	@Test(groups="login")
	public void test2()
	{
		Reporter.log("test2 is pass",true);
	}
	@Test(groups="search")
	public void test3()
	{
		Reporter.log("test3 is pass",true);
	}
	@Test(groups="search")
	public void test4()
	{
		Reporter.log("test4 is pass",true);
	}
	@Test(groups="logout")
	public void test5()
	{
		Reporter.log("test5 is pass",true);
	}
	@Test(groups="logout")
	public void test6()
	{
		Reporter.log("test6 is pass",true);
	}
	@Test(groups="home")
	public void test7()
	{
		Reporter.log("test7 is pass",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
