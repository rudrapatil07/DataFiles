package teatng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 
{

	@Test
	public void test()
	{
		
		String act="nitesh";
		String exp="nite";
		  
		boolean login = true;
	
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(act, exp,"Names are Not matching");
		
		System.out.println("This Names are matching");
		
		soft.assertTrue(login,"button is not working");
		
		System.out.println("login Button is working");
		
     soft.assertAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
