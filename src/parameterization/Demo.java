package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream File=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\html\\Uchiha.xlsx");
		
		 Sheet sheet = WorkbookFactory.create(File).getSheet("Sheet3");	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		
		  WebElement UI = driver.findElement(By.xpath("//input[@name='email']"));
		  
		 String un = sheet.getRow(0).getCell(0).getStringCellValue();
		 
		 UI.sendKeys(un);
		  
		 Thread.sleep(2000);
		 
		  WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		 String ps = sheet.getRow(1).getCell(0).getStringCellValue();
		  
		  pass.sendKeys(ps);
		
	     WebElement zz = driver.findElement(By.xpath("//button[@type='submit']"));
		
		zz.click();		
		
	}
}
