package NaveenSolutions.MavenProject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Walmart1Task {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver(co);
		d.get("https://www.walmart.com/");
		d.manage().window().maximize();
		

		WebElement link=d.findElement(By.xpath("//div[@class='sub-nav-link-container h3 flex-wrap justify-end cg-2 overflow-hidden flex-auto f6-m b']"));
		java.util.List <WebElement> links=link.findElements(By.tagName("a"));		
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
			}
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[normalize-space()='Home']")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("//button[contains(text(),'Furniture')]")).click();
		
		d.findElement(By.xpath("//h2[normalize-space()='Office Furniture']")).click();
		
		TakesScreenshot t=(TakesScreenshot)d;
		File source=t.getScreenshotAs(OutputType.FILE);
				File target=new File(System.getProperty("user.dir")+"\\screenshots\\pp.png");
				
				FileUtils.copyFile(source, target);
		
		

	}
}
