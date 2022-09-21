package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Sample2 {
	
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.amazon.in/");
		
			driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
			
			WebElement Amzid = driver.findElement(By.xpath("//input[@name='email']"));
		
		  Amzid.sendKeys("8208432733");
		  
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1495nitesh");
		
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		    Thread.sleep(2000);
		    
		   Alert alrt = driver.switchTo().alert();
		   
		   alrt.accept();
		
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\screens___amzlog=JPg");
		
		FileHandler.copy(source, Dest);
			
	}
	
}
