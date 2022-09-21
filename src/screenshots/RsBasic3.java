package screenshots;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class RsBasic3 {
	
	public static void main(String[]args) throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         String Rstring = RandomString.make();
		
         File dest=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots---Zomato"+Rstring+"_JPg");
		
         
     org.openqa.selenium.io.FileHandler.copy(source, dest);
         
         
         driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
