package NaveenSolutions.MavenProject1;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFireFoxInheritance {

	//public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		//ChromeDriver d=new ChromeDriver();
	FirefoxDriver d;
		public void firefox() throws InterruptedException 
		{
			String path=System.getProperty("user.dir");
			System.out.println(path);
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions f=new FirefoxOptions();
			f.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.firefox.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\geckodriver.exe");
		 d=new FirefoxDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("manualtesting");
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);

		d.findElement(By.name("btnK")).click();
	d.close();
	}

}
