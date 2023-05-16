package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoxAndCoxAppliEco {

	public static void main(String[] args) throws InterruptedException {
WebDriver d;
WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		 d=new ChromeDriver(co);
		 d.get("https://www.coxandcox.co.uk/customer/account/create/");
		 d.manage().window().maximize();
		 d.findElement(By.id("firstname")).sendKeys("Naveenreddy");
		 d.findElement(By.id("lastname")).sendKeys("Neelam");
	WebElement link=d.findElement(By.id("email_address"));
			link.sendKeys("neelamreddy212@gmail.com");
			d.findElement(By.id("password")).sendKeys("Naveenreddy@123");
			d.findElement(By.id("password-confirmation")).sendKeys("Naveenreddy@123");
			//d.findElement(By.name("is_subscribed")).click();
			/*WebElement c=d.findElement(By.xpath("//*[@id=\"form-validate\"]/fieldset[2]/div[4]"));
			List<WebElement>c1=c.findElements(By.tagName("input"));
			System.out.println(c1.size());
			for(int i=0;i<c1.size();i++)
			{
				System.out.println(c1.get(i).getAttribute("value")+ " "+ c1.get(i).getAttribute("checked"));
			}*/
		 Thread.sleep(2000);
			d.findElement(By.xpath("//*[button='Create an Account']")).click();
	}

}
