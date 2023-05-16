package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonEchoechoApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://echoecho.com/htmlforms10.htm");
d.manage().window().maximize();
//d.findElement(By.name("group1")).click();
//d.findElement(By.name("group2")).click();
WebElement rc=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>rc1=rc.findElements(By.tagName("input"));
System.out.println(rc1.size());

for(int i=0;i<rc1.size();i++)
{
	System.out.println(rc1.get(i).getAttribute("value")+" " + rc1.get(i).getAttribute("checked"));
}
//d.close();

	}  
}
