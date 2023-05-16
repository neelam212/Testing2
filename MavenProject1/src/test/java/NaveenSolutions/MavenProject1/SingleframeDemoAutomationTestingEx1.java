package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleframeDemoAutomationTestingEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Frames.html");
d.manage().window().maximize();
d.switchTo().frame("singleframe");
d.findElement(By.xpath("//*[@type='text']")).sendKeys("Naveenreddy");
System.out.println("Naveenreddy printed successfully");
Thread.sleep(2000);
d.close();

//System.out.println(text.get);
	}

}
