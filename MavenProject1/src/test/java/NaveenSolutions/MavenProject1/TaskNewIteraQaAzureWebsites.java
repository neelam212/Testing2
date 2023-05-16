package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskNewIteraQaAzureWebsites {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver(co);
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		d.findElement(By.id("name")).sendKeys("Naveenreddy");
		d.findElement(By.id("phone")).sendKeys("9398228784");
		d.findElement(By.id("email")).sendKeys("neelamreddy212@gmail.com");
		d.findElement(By.id("address")).sendKeys("Naveenreddy,GirisastrivariKandriga");
		d.findElement(By.id("password")).sendKeys("Naveenreddy@123");
		

d.findElement(By.id("male")).click();
d.findElement(By.id("friday")).click();

Select ctr=new Select(d.findElement(By.xpath("//*[@class='custom-select']")));
ctr.selectByVisibleText("Spain");

d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();

d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();

WebElement link=d.findElement(By.xpath("//*[@id='inputGroupFile02']"));
link.sendKeys("D://a1.png");
System.out.println("browsed file");

d.findElement(By.xpath("//*[@class='input-group-text']"));
System.out.println("uploaded successfully");

d.findElement(By.name("submit")).click();
System.out.println("submitted successfully");



	}

}
