package Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class BAMethods {
		
		  WebDriver d;
		  @BeforeMethod
		  public void login() {
			//  WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			  co.addArguments("--remote-origin-allows=*");
			  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			  d=new ChromeDriver(co);

			  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  d.manage().window().maximize();  
			  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  }
		  @Test
		  public void usercreditinals()
		  {
			  d.findElement(By.name("username")).sendKeys("Admin");
			  d.findElement(By.name("password")).sendKeys("admin123");
			  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  }
		  
		  @Test (priority=1)
		  public void Admin()
		  {
			  d.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		  }
		  @Test (priority=2)
		  public void Title()
		  {
			  System.out.println(d.getTitle());
		  }
		  @Test (priority=3)
		  public void Url()
		  {
			  System.out.println(d.getCurrentUrl());
		  }
		  
		  @AfterMethod
		  public void quit() {
			  d.close();
			  System.out.println("closed successfully");
		  }

		}
