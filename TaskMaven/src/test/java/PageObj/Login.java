package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
	@FindBy(name="username")
	WebElement txtUsername;
	

	@FindBy(name="password")
	WebElement txtPassword;
	
		
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnsubmit;
	
	public void setusername(String fname)
	{
		txtUsername.sendKeys(fname);
	}
	
	public void setpassword(String pword)
	{
		txtPassword.sendKeys(pword);
	}

	public void clickcontinue()
	{
		btnsubmit.click();
	}
	
}