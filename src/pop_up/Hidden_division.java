package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division 
{

	
	public static void main(String[]args) throws InterruptedException
	{
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	      Thread.sleep(2000);
		
		WebElement id = driver.findElement(By.xpath("//input[contains(@class,'_2IX_')][1]"));
		
		
		id.sendKeys("abcd");
		
		 WebElement pass = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mct')]"));
		
		pass.sendKeys("1234");
		
		WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l')]"));
		
		Thread.sleep(1000);
		
		
		close.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
