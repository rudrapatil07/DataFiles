package teatng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{

	
	@Test
	public void test1()
	{
		
		
		String Msg=null;
		
		Assert.assertNull(Msg, "THis Msg Is NOt Null");
		
		System.out.println("MSg is Null ");
 System.out.println("===================================================================");
		String msg="Nitesh";
		
		Assert.assertNotNull(msg, "This object value is null");
		
		System.out.println("not null test is passed");
		
System.out.println("===================================================================");
		boolean login = true;
		
		Assert.assertTrue(login, "LOgin button is not working");
		
		System.out.println("button is working");
		
System.out.println("===================================================================");
		boolean value = false;
		
		Assert.assertFalse(value, "Value is not false");
		
		System.out.println("value is false");
		

System.out.println("===================================================================");	
		String act="Nitesh";
		String exp="Nite";
		
		Assert.assertEquals(act, exp,"This names are NOt matching");

		System.out.println("This NameS Are Matching");
		

System.out.println("===================================================================");


       String Act="Nitesh";
       String Exp="Vidhi";
       
       Assert.assertNotEquals(Act, Exp,"This name are matching");
       
       System.out.println("This is names are diffrent");
       
 System.out.println("===================================================================");

 
      // Assert.fail("Meri MurZi Mai Chahe Jo Karu.....");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
