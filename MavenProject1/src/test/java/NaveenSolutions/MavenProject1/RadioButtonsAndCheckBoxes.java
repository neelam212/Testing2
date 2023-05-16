package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsAndCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.guru99.com/test/radio.html");
d.manage().window().maximize();
System.out.println(d.getCurrentUrl());
System.out.println(d.getTitle());

//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();


//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();

d.findElement(By.id("vfb-7-2")).click();
d.findElement(By.id("vfb-6-0")).click();

WebElement RandC=d.findElement(By.xpath("/html/body/div[4]"));
List<WebElement> R1andC=RandC.findElements(By.tagName("input"));
System.out.println(R1andC.size());

for(int i=0;i<R1andC.size();i++)
{
	System.out.println(R1andC.get(i).getAttribute("value")+" " + R1andC.get(i).getAttribute("checked"));
}
Thread.sleep(2000);
d.close();
	}

}
