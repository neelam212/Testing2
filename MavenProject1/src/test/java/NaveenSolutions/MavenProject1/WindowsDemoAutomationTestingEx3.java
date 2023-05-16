package NaveenSolutions.MavenProject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsDemoAutomationTestingEx3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Windows.html");
d.manage().window().maximize();

		Thread.sleep(2000);
		String parent_id2=d.getWindowHandle();
		System.out.println(parent_id2);
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		d.findElement(By.xpath("//*[@id='Multiple']/button")).click();

		Set<String> child_id2=d.getWindowHandles();
		System.out.println(child_id2);
		for(String handle2:child_id2)
		{
			if(!handle2.equals(parent_id2))
			{
				d.switchTo().window(handle2);
				Thread.sleep(2000);
				WebElement Text=d.findElement(By.id("email"));
				Text.sendKeys("neelamreddy212@gmail.com");
				System.out.println(Text.getText());
			}  
			Thread.sleep(2000);
			d.switchTo().window(parent_id2);
		}
	}

}
