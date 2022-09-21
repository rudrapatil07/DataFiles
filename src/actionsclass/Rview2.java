package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rview2
{

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("one plus nord 2 mobile");
		   
		   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		   
		   Thread.sleep(2000);
		   
		  WebElement Moblie = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		  
		 System.out.println(Moblie.getText());
		 
		 Thread.sleep(2000);
		 
		 WebElement data = driver.findElement(By.xpath("//div[@class='_3pLy-c row']"));
		
		 System.out.println("================================");
		
		System.out.println(data.getText());
		
		System.out.println("==========================================");
		
		Thread.sleep(2000);
		
		
		WebElement mob2 = driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])[2]"));
		
		System.out.println(mob2.getText());
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
