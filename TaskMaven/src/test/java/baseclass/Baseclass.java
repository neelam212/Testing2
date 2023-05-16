package baseclass;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass
	public void teardown()
	{
	driver.quit();
	
    } 
}