package NaveenSolutions.MavenProject1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZeroComLogin {

	public static void main(String[] args) throws InterruptedException {
	//@Test
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
				 d=new ChromeDriver(co);
				 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				 d.manage().window().maximize();
				 Thread.sleep(2000);
				 d.findElement(By.name("username")).sendKeys("Admin");
				 d.findElement(By.name("password")).sendKeys("admin123");
				WebElement link= d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				 link.click();
				 
				 
				 WebElement dashboard=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
				//dashboard.sendKeys("OrangeHRM, Inc");
				 dashboard.click();
				// dashboard.getText();
				// System.out.println(dashboard.getText());

				 
				 
				/* String actualResult=dashboard.getText();
				 
				 String ExpectedResult="about";

				 
				// Assert.assertEquals(ExpectedResult, actualResult);
				 
				 if(actualResult==ExpectedResult)
				 {
					 System.out.println("testcase passed");
				 }
				 else
					 System.out.println("testcase failed");*/

				 
	}

}
