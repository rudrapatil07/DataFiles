package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3
{

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("mce_0_ifr");
		
		Thread.sleep(2000);
		
		WebElement data = driver.findElement(By.xpath("//body[@id='tinymce']"));
		
		data.sendKeys("=======I Am Ghost Of The Uchiha .....MAdara Uchiha==========");
		
		String di = data.getText();
		
		System.out.println(di);
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[contains(@class,'tox-mbtn ')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
