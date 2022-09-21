package listwebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{

	public static void main(String[]args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formstone.it/components/checkbox/");
		 
		Thread.sleep(1000);
		
		List<WebElement> checkbx = driver.findElements(By.xpath("//div[contains(@class,'fs-checkbox ')]"));
		
		System.out.println(checkbx.size());
		
		driver.manage().window().maximize();
		
		for(WebElement bt:checkbx)
		{
			 bt.click();
			 
			 Thread.sleep(1000);
			
		}
		
		for( WebElement b:checkbx)
		{
			b.click();
			Thread.sleep(1000);
		}
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
