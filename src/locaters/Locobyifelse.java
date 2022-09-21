package locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locobyifelse {

	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement xyz = driver.findElementByXPath("//h2[@class='_8eso']");
		
		System.out.println(xyz.getText());
		
	 String act=xyz.getText();
	 
	 String www=("Facebook helps you connect and share with the people in your life.");
	 
	 if(act.equals(www))
	 {
		 System.out.println("This text is correct");
	 }
	 else
	 {
		 System.out.println("This text is incorrect");
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
