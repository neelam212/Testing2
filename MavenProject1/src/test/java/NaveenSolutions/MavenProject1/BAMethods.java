package NaveenSolutions.MavenProject1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class BAMethods {
	
  WebDriver d;
  @BeforeMethod
  public void login() {
	  WebDriverManager.chromedriver().setup();
	ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-origin-allows=*");
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d=new ChromeDriver(co);

	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  d.manage().window().maximize();
	 // d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
  @Test
  public void usercreditinals()
  {
	  d.findElement(By.name("username")).sendKeys("Admin");
	  d.findElement(By.name("password")).sendKeys("admin123");
	  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  
  @Test
  public void Admin()
  {
	  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
  }
  @Test
  public void Title()
  {
	  System.out.println(d.getTitle());
  }
  @Test
  public void Url()
  {
	  System.out.println(d.getCurrentUrl());
  }
  
  @AfterMethod
  public void quit() {
	  d.close();
  }

}
