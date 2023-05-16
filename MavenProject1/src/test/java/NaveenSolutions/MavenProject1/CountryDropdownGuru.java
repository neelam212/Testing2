package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryDropdownGuru {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=+");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver ad1=new ChromeDriver();
		ad1.get("https://demo.guru99.com/test/newtours/register.php/");
		ad1.manage().window().maximize();
		System.out.println(ad1.getTitle());
		System.out.println(ad1.getCurrentUrl());
		
		WebElement ad2=ad1.findElement(By.name("country"));
		List<WebElement>ad=ad2.findElements(By.tagName("option"));
		System.out.println(ad.size());
		
		for(int i=0;i<ad.size();i++) {
			System.out.println(ad.get(i).getText());
		}
		
		
			ad1.close();
	}

}
