package NaveenSolutions.MavenProject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertswindowsframesDeomAutomationTesting {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Alerts.html");
d.manage().window().maximize();

//d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));

//d.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
//d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();

//Alert alt=d.switchTo().alert();
//System.out.println("alert opened");

d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Alert alt=d.switchTo().alert();//alert is a class for that class we are creating a object. d.switch to .alert is we are switchin g from windows to alert.
System.out.println(alt.getText());
alt.accept();//predefined methods.

d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
d.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
Alert alt1=d.switchTo().alert();
System.out.println(alt1.getText());
alt1.dismiss();

WebElement text1=d.findElement(By.id("demo"));
System.out.println(text1.getText());
String Actualvalue =text1.getText();
String Expectedvalue= "You pressed Ok";
		

if(Actualvalue.equals(Expectedvalue))
{
	System.out.println("You pressed ok with no issue");
	
}
else {
	System.out.println("you pressed cancel when user clicks");
}

d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
d.findElement(By.xpath("//*[@class='btn btn-info']")).click();
Alert alt2=d.switchTo().alert();
System.out.println(alt2.getText());
alt2.sendKeys("welcome to Naveen");
alt2.accept();

WebElement text=d.findElement(By.id("demo1"));
System.out.println(text.getText());










	}

}
