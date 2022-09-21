package screenshots;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Dsample 
{

	  public static void main(String[]args) throws InterruptedException, IOException
	  {
		  
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  
	      Thread.sleep(2000);
		  
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String Rstring = RandomString.make();
		
		
		File dest=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots "+Rstring+"amzon_jpg");
		
		FileHandler.copy(source, dest);
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
