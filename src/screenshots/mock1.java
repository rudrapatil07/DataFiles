package screenshots;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class mock1
{

	
  public static void main(String[]args) throws InterruptedException, IOException
  {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File file=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots___Filpkart__jpg");
		  
		  FileHandler.copy(source, file);
		  
		 driver.close();
		   
		
	  
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
