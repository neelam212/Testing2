package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameDemoAutomationTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Frames.html");
d.manage().window().maximize();

d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

d.switchTo().frame("Multiple");
System.out.println("Parent frame openeed");

WebElement text=d.findElement(By.xpath("//*[@class='iframe-container']"));
System.out.println(text.getText());

/*d.switchTo().frame("iFrame Demo");
WebElement text1=d.findElement(By.xpath("//*[@type='text']"));
text1.sendKeys("don don");
Thread.sleep(2000);
d.close();*/

	}

}
