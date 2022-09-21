package assignment;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_drive2 
{

	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Dimension d=new Dimension(100,100);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(45,90);
		
		driver.manage().window().setPosition(p);
		
		
		driver.close();
		
		
		
		
		
	}
	
}
