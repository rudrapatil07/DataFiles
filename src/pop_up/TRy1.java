package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRy1 {
	
	public static void main(String[]args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		
		driver.get("https://www.javatpoint.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@alt='java']")).click();
		
		
		
	 WebElement iframe = driver.findElement(By.partialLinkText("Test it Now"));
	    
		 iframe.click();
		 
		Thread.sleep(2000);
		
		driver.switchTo().frame(iframe);
		
		
	driver.findElement(By.xpath("\"//p[text()=' Output ']\"")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
