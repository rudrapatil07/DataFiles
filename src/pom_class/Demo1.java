package pom_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\html\\Uchiha.xlsx");
		
		Sheet doxx = WorkbookFactory.create(file).getSheet("sheet3");
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   FB_log XX=new FB_log(driver);
		   
              Thread.sleep(1000);	
              
            String Id = doxx.getRow(0).getCell(0).getStringCellValue(); 
		   
		     String pass = doxx.getRow(1).getCell(0).getStringCellValue();
		     
		     //function callss
		     
		     XX.setId(Id);
		     
		     Thread.sleep(1000);
		     
		     XX.setpass(pass);
		     
		     Thread.sleep(1000);
		     
		     XX.Clikbt();
		     
		     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
