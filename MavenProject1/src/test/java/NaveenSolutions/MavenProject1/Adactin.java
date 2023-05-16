package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				//System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
				 d=new ChromeDriver(co);
				 d.get("https://adactinhotelapp.com/index.php");
				 d.manage().window().maximize();
				 //Thread.sleep(2000);
				 
				 d.findElement(By.id("username")).sendKeys("naveenneelam");
				 d.findElement(By.id("password")).sendKeys("Naveenreddy@123");
				 
				 d.findElement(By.id("login")).click();
				// Thread.sleep(3000);
				WebElement link=d.findElement(By.id("username_show"));
				link.getAttribute("value");
				// System.out.println(link.getText());
				 String ActualValue=link.getAttribute("value");
				 String ExpectedValue="Hello naveenneelam!";
				 
				 if(ActualValue.equals(ExpectedValue))
				 {
					 System.out.println("Test case passed");
				 }
				 else
					 System.out.println("Test Case failed");
				 
				 
				 
			/*	Thread.sleep(2000);
				 WebElement link1=d.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]"));
				 link1.click();
				 d.close();
				 System.out.println("booked iternary opened succesfully");*/
				 
				 
				 
			/*	 WebElement link1=d.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[1]"));
                 link1.getAttribute("");
				String ActualValue=link1.getText();
				 String ExpectedValue="Welcome to Adactin Group of Hotels";
				 
				// Assert.assertEquals(ExpectedValue, ActualValue);
				 
				// System.out.println("expected and actual results are same");
				 
				if(ActualValue==ExpectedValue)
				 {
					 System.out.println("Test case passed");
				 }
				 else
				 {
					 System.out.println("Test Case failed");*/
	
	}
}


