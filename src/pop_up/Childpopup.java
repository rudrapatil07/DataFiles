package pop_up;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Childpopup
{

	public static void main(String[]args) throws InterruptedException
	{
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
		Set<String> id = driver.getWindowHandles();
		
	     ArrayList<String>windows=new ArrayList<String>(id);
	     
	     
	     String Homepage = windows.get(0);
	    String newwindow = windows.get(1);
	    
	    System.out.println("First id is=="+Homepage);
	    System.out.println("Second id is=="+newwindow);
	    
	    
	    driver.switchTo().window(newwindow);
	    
	    driver.findElement(By.xpath("//span[text()='Training']")).click();
	    
	    Thread.sleep(1000);
	    
	   driver.switchTo().window(Homepage);
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	    
	    driver.manage().window().maximize();
	    
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable--notification");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\March_001\\Browser\\chromedriver.exe");
		
		 driver=new ChromeDriver(option);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
