package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleChromeInheritance extends SampleFireFoxInheritance {

	WebDriver d;
			public void chrome() throws InterruptedException
			{
			
				//String path=System.getProperty("user.dir");
				//System.out.println(path);
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
				//System.setProperty("webdriver.ie.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\IEDriverServer.exe");
				WebDriverManager.chromedriver().setup();
				ChromeOptions c=new ChromeOptions();
				c.addArguments("--remote-allow-origins=*");
				 d=new ChromeDriver(c );

				//InternetExplorerDriver d=new InternetExplorerDriver();
			d.get("https://www.amazon.in/");
			d.manage().window().maximize();
			d.findElement(By.id("twotabsearchtextbox")).sendKeys("Apps&Games");
			d.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);

			
		d.close();
		}
			public static void main(String[] args) throws InterruptedException
			{
				SampleChromeInheritance a1=new SampleChromeInheritance();
				a1.firefox();
				a1.chrome();
			}
}
 