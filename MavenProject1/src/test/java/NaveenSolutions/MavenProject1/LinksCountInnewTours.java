package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksCountInnewTours {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver(co);
	d.get("https://demo.guru99.com/test/newtours/");
	d.manage().window().maximize();

	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	WebElement l1=d.findElement(By.id("navbar-brand-centered"));
	List<WebElement>l2=l1.findElements(By.tagName("a"));
	System.out.println(l2.size());
	for(int i=0;i<l2.size();i++)
	{
		System.out.println(l2.get(i).getText());
		
	}
		
	}

}
