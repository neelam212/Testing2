package Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {
	WebDriver d;
  @Test(groups= {"smoke"})
  public void openingbrowser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	   d=new ChromeDriver();
	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  }
  
  @Test(groups= {"sanity"})
  public void login()
  {
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  d.findElement(By.name("username")).sendKeys("Admin");
	  d.findElement(By.name("password")).sendKeys("admin123");
	  //d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }
  @Test(groups= {"regression"})
  public void title()
  {
	  System.out.println(d.getTitle());
  }
  @Test(groups= {"smoke"})
  public void url()
  {
	  System.out.println(d.getCurrentUrl());
  }
}
