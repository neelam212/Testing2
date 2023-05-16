package InsuranceProjectNewTours;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class class1 {
	WebDriver d;
  @BeforeTest
  public void opening_Browser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://demo.guru99.com/insurance/v1/index.php");
	  d.manage().window().maximize();
  }
  @Test
  public void loginPage()
  {
	  d.findElement(By.id("email")).sendKeys("neelamreddy212@gmail.com");
	  d.findElement(By.id("password")).sendKeys("Naveenreddy@123");
	  d.findElement(By.name("submit")).click();
  }
}
