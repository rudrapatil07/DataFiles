package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Try1 {
	
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
	
		driver.get("https://www.facebook.com/");
		
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
			
		
		id.sendKeys("nitesh patil 1848");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	    pass.sendKeys("143shiva");
	    
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	    Thread.sleep(2000);
	    
	    Alert alrt = driver.switchTo().alert();
		   
		 alrt.accept();
		
	    
	   driver.findElement(By.xpath("//span[text()='Nitesh Patil']")).click();
	    
	    Thread.sleep(2000);
	    

		org.openqa.selenium.chrome.ChromeOptions option =new org.openqa.selenium.chrome.ChromeOptions();
		option.addArguments("--disable--notification");
		
		 driver=new ChromeDriver(option);
	    
	    
	    
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	     String Rstring = RandomString.make();
	    
	   File dest=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\screens"+Rstring+"____myprofile jpg");
	   
	   driver.manage().window().maximize();
	   
	   
	  FileHandler.copy(source, dest);
	  
	  driver.close();
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
