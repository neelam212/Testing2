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

public class WalmartTask {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver(co);
		d.get("https://www.walmart.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//*[@class='flex items-center no-underline ph3 white desktop-header-trigger lh-title lh-solid']")).click();
		
		d.findElement(By.xpath("//*[@class='dark-gray db f6 no-underline nowrap desktop-header-flyout-link mb3']")).click();
		
		d.findElement(By.xpath("//*[@id=\"maincontent\"]/main/section[2]/div/div/div/div/div[1]/div/div/a")).click();
		
		
		d.findElement(By.name("Email Address")).sendKeys("neelamreddy212@gmail.com");
		
		d.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button")).click();
		
		d.findElement(By.name("firstName")).sendKeys("Naveenreddy");
		d.findElement(By.name("lastName")).sendKeys("Neelam");
		d.findElement(By.name("newPassword")).sendKeys("Naveenreddy@123");
		d.findElement(By.name("Create Account")).click();
		
		d.findElement(By.xpath("//*[@class='w_hhLG w_8nsR w_jDfj pointer bn sans-serif b ph2 flex items-center justify-center w-auto shadow-1']")).click();
		
		TakesScreenshot t=(TakesScreenshot)d;
		File source=t.getScreenshotAs(OutputType.FILE);
				File target=new File(System.getProperty("user.dir")+"\\screenshots\\pp1.png");
				
				FileUtils.copyFile(source, target);
		

		

		
	}
}
