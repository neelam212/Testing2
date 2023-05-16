package NaveenSolutions.MavenProject1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsDemoAutomationTestingExMAIN {

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
	
	Thread.sleep(2000);
	String parent_id1=d.getWindowHandle();
	Thread.sleep(2000);
	System.out.println(parent_id1);
	d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	d.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();

	
	Set<String> child_id1=d.getWindowHandles();
	System.out.println(child_id1);
	
	for(String handle1:child_id1)
	{
	if(!handle1.equals(parent_id1))
	{
		d.switchTo().window(handle1);
		Thread.sleep(2000);
		WebElement Text1=d.findElement(By.id("Layer_1"));
System.out.println(Text1.getText());
	}
	Thread.sleep(2000);
	d.switchTo().window(parent_id);
	
	}
	
	Thread.sleep(2000);
	String parent_id2=d.getWindowHandle();
	System.out.println(parent_id2);
	d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	d.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();

	Set<String> child_id2=d.getWindowHandles();
	System.out.println(child_id2);

	for(String handle2:child_id2)
	{
		if(!handle2.equals(parent_id2))
		{
			d.switchTo().window(handle2);
			Thread.sleep(2000);
			WebElement Text=d.findElement(By.id("logo"));
			//Text.sendKeys("neelamreddy212@gmail.com");
			System.out.println(Text.getText());
		}
		Thread.sleep(2000);
		d.switchTo().window(parent_id);
	}
	
}

	
}
