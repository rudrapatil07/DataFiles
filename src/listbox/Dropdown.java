package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Thread.sleep(1000);
		
		Select D=new Select(day);
		
		D.selectByValue("2");
		
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Thread.sleep(1000);
		
		Select M=new Select(month);
		
		M.selectByValue("9");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Thread.sleep(1000);
		
		Select Y=new Select(year);
		
		Y.selectByValue("1995");
		
		
		
		boolean verifylistbox = D.isMultiple();
		         
				boolean verifylisbox1 = M.isMultiple();
		
		boolean verifylistbox2 = Y.isMultiple();
		
		
		System.out.println("day is listox=="+verifylistbox);
		
		
		System.out.println("MOnth is listbox=="+verifylisbox1);
		
		System.out.println("year is listbox=="+verifylistbox2);
		
		
		List<WebElement> days = D.getOptions();
		
		List<WebElement> months = M.getOptions();
		
		List<WebElement> years = Y.getOptions();
		
		int size=days.size();
		int size1=months.size();
		int size2=years.size();
		
		
		System.out.println("size of day=="+size);
		
		System.out.println("size of month=="+size1);
		
		System.out.println("size year=="+size2);
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
