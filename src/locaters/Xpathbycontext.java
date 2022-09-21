package locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontext {

	public static void main(String[]args)
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		 driver.get("https://www.zomato.com/");
		
		driver.findElementByXPath( "//p[contains(text(),'Dining Out')]").click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
