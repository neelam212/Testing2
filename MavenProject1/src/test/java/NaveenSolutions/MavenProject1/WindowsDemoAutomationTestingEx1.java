package NaveenSolutions.MavenProject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsDemoAutomationTestingEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Windows.html");
d.manage().window().maximize();

Thread.sleep(2000);
String parent_id=d.getWindowHandle();
System.out.println(parent_id);
d.findElement(By.xpath("//*[@id=\"Tabbed\"]/a")).click();

Set<String> child_id=d.getWindowHandles();
System.out.println(child_id);

for(String handle:child_id)
{
	if(!handle.equals(parent_id))
	{
		d.switchTo().window(handle);
		Thread.sleep(2000);
		WebElement Text=d.findElement(By.id("Layer_1"));
		System.out.println(Text.getText());
	}
	Thread.sleep(2000);
	d.switchTo().window(parent_id);
}
	}

}
