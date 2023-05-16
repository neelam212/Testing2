package ModularFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	 
	static WebElement element=null;

	//public static void main(String[] args) {
		public static WebElement txt_username(WebDriver driver1)
		{
			element=driver1.findElement(By.name("username"));
			return element;
			
		}
		public static WebElement txt_password(WebDriver driver1)
		{
			element=driver1.findElement(By.name("password"));
			return element;
		}
		public static WebElement txt_button(WebDriver driver1)
		{
			element=driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			return element;
		}
		
		public static WebElement txt_button1(WebDriver driver1)
		{
			element=driver1.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			return element;
			
		}
		
	}

