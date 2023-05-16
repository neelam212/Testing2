package ModularFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class login_action {

	//public static void main(String[] args) {

		public static void execute(WebDriver driver1)
		{
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Login1.txt_username(driver1).sendKeys("Admin");
			Login1.txt_password(driver1).sendKeys("admin123");
			Login1.txt_button(driver1).click();
			
			Login1.txt_button1(driver1).click();
			
			System.out.println("login page opened succesffully");
		}
		

	
	}


