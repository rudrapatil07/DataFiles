package locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classna {
	
	
	public static void main(String[]args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/html/fbpge.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByClassName("abc").sendKeys("nitesh");
		
		driver.findElementByClassName("abc").sendKeys("143shiva");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
