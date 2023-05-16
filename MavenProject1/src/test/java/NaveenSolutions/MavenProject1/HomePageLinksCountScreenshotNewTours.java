package NaveenSolutions.MavenProject1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageLinksCountScreenshotNewTours {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver(co);
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();


		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());

		WebElement link=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		System.out.println(links.size());//7
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		TakesScreenshot t=(TakesScreenshot)d;
		File source=t.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshots\\a11.png");
		FileUtils.copyFile(source,target);
		
		//File src=((TakesScreenshot)d).getscreenshotas(OutputType.FILE);
		//FileUtils.copyFile(src,new File("D://a1.png"));
		
		
		



			}

		}

	


