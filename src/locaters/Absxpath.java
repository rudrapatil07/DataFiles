package locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Absxpath {
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/html/fbpge.html");
		
		driver.findElementByXPath("html/body/input").sendKeys("nitesh");
		
		driver.findElementByXPath("html/body/input[2]").sendKeys("PSLV37");
		
		Thread.sleep(1000);
		
		
		
		driver.findElementByPartialLinkText("Forgot Password").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
