package locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xbypathconatain {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
       driver.get("https://www.zomato.com/");
       
       //WebElement un = driver.findElementByXPath("//input[contains(@placeholder=\"Search for restaurant, cuisine or a dish\")]");

		//un.sendKeys("chiken");
		
		
       driver.manage().window().maximize();
       
       
       
		driver.findElementByXPath("//img[contains(@class,'sc-s1isp7-5 fyZwWD')]").click();
		
		Thread.sleep(1000);
		
		
		
	    driver.findElementByXPath("//img[contains(@class,'sc-s1isp7-5 fyZwWD\')]").click();    //class="sc-s1isp7-5 fyZwWD"
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
