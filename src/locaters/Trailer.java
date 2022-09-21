package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trailer 
{

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("patil95smailbox@rediffmail.com");
		
		Thread.sleep(1000);
		
		
	   driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("143shiva");
		
		Thread.sleep(1000);
		
	     driver.findElementByXPath("button[cantains(@id=\"u_0_d_Du\"").click();
	     
	     driver.close();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
