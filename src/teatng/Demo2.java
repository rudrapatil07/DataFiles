package teatng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 
{

	@BeforeClass
	public void test1()
	{
		Reporter.log("Main Famliy Start from father",true);
		
	}
	@BeforeMethod
	public void test2()
	{
		Reporter.log("MOther name is [Surekha",true);
	}
	
	@Test
	public void test3()
	{
		Reporter.log("MY older brother name is Vivek patil",true);
		
	}
	@AfterMethod
	public void test4()
	{
		Reporter.log("MY name is Nitesh patil",true);
	}
	
	@AfterClass
	public void test5()
	{
		Reporter.log("my Sister in law Shes Name Sunita Patil",true);
	}
	
	
	
	
	
	
}
