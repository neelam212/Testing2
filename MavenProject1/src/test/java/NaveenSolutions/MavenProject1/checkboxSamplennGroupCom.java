package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxSamplennGroupCom {

	public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
  ChromeOptions co=new ChromeOptions();
  co.addArguments("--remote-allow-origins=*");
  
  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
  ChromeDriver d=new ChromeDriver(co);
  d.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
  d.manage().window().maximize();
  d.manage().deleteAllCookies();
// d.findElement(By.id("three")).click();
 d.findElement(By.id("three")).click();

  WebElement dd=d.findElement(By.xpath("//*[@id=\"articleBody\"]/ol[2]/li[3]/div/form"));
  List <WebElement> dd1=dd.findElements(By.name("sample"));
  System.out.println(dd1.size());
  for(int i=0;i<dd1.size();i++)
  {
	  System.out.println(dd1.get(i).getAttribute("value")+" "+dd1.get(i).getAttribute("checked"));
  }
  
		
	}

}
