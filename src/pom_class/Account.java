package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account
{

	@FindBy(xpath="//a[contains(@class,'_42ft _4')]") private WebElement acc;
	
	@FindBy(xpath="//input[@name='firstname']")private WebElement name;
	
	@FindBy(xpath="//input[@name='lastname']") private WebElement last;
	
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement mail;

	Account(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void acount()
	 {
		 acc.click();
		
	 }
	 public void setname()
	 {
		 name.sendKeys("Nitesh");
		 
	 }
	 public void lastname()
	 {
		 last.sendKeys("Patil");
	 }
	 public void Mail()
	 {
		 mail.sendKeys("rudra143patil@gmail.com");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
