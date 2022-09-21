package crossbrow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CT 
{
	
	
	
	@Parameters("BrowserName")
    @Test
	public void test(String BrowserName) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		String expected = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).getText();
		String Actual = "Create New Account";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(Actual, expected,"this test 001 Fail");
		
		soft.assertAll();
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
