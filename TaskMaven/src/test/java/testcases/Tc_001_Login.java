package testcases;

//import java.time.Duration;

//import org.junit.AfterClass;
import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import baseclass.Baseclass;
//import io.github.bonigarcia.wdm.WebDriverManager;
import PageObj.Login;

public class Tc_001_Login extends Baseclass
{

	@Test
	public void test_acc_login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		Login lpage=new Login(driver);
		
		lpage.setusername("Admin");
		
		lpage.setpassword("admin123");
		
		lpage.clickcontinue();
		   if(driver.getTitle().equals("OrangeHRM"))  
		   {
			Assert.assertTrue(true);
		   }
		  else
		{
			Assert.assertTrue(false);
		}
		
	}
	
}