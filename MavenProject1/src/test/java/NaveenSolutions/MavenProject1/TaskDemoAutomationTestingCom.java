package NaveenSolutions.MavenProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDemoAutomationTestingCom {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver(co);
d.get("https://demo.automationtesting.in/Register.html");
d.manage().window().maximize();
d.manage().deleteAllCookies();
Thread.sleep(2000);

//d.switchTo().alert();
d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Naveenreddy");
d.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")).sendKeys("Neelam");
d.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Girisastrivari kandriga");
d.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("neelamreddy212@gmail.com");
d.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9398228784");

//d.findElement(By.xpath("//input[@value='male'")).click();
d.findElement(By.name("radiooptions")).click();
WebElement dd=d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div"));
List <WebElement>dd1=dd.findElements(By.name("radiooptions"));
System.out.println(dd1.size());

for (int i=0;i<dd1.size();i++)
{
	System.out.println(dd1.get(i).getAttribute("value")+" "+dd1.get(i).getAttribute("checked"));
}

d.findElement(By.id("checkbox1")).click();
d.findElement(By.id("checkbox2")).click();
d.findElement(By.id("checkbox3")).click();

//to get the count
WebElement dod=d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div"));
List<WebElement> dod1=dod.findElements(By.tagName("input"));
System.out.println(dod1.size());

for(int i=0;i<dod1.size();i++)
{
	System.out.println(dod1.get(i).getAttribute("value")+" "+dod1.get(i).getAttribute("checked"));
}
Thread.sleep(2000);
//Select lang=new Select(d.findElement(By.id("msdd")));
//lang.selectByVisibleText("English");

Select skill=new Select(d.findElement(By.id("Skills")));
skill.selectByVisibleText("Android");

//Select ctr=new Select(d.findElement(By.id("countries")));
//ctr.selectByVisibleText("Select Country");

//Select ctr1=new Select(d.findElement(By.xpath("//span[@id='select2-country-container']")));
//ctr1.selectByVisibleText("India");

//Select ctry2= new Select(d.findElement(By.xpath("//span[@id='select2-country-container']")));
//ctry2.selectByVisibleText("India");
Thread.sleep(2000);

Select yr =new Select(d.findElement(By.xpath("//select[@id='yearbox']")));
yr.selectByVisibleText("1997");
Thread.sleep(2000);

Select mnt =new Select(d.findElement(By.xpath("//select[@placeholder='Month']")));
mnt.selectByVisibleText("july");
Thread.sleep(2000);


Select dt =new Select(d.findElement(By.xpath("//select[@id='daybox']")));
dt.selectByVisibleText("11");
Thread.sleep(2000);

WebElement pwd= d.findElement(By.xpath("//input[@id='firstpassword']"));
pwd.sendKeys("reddy123"); 
Thread.sleep(2000);

WebElement cnfp= d.findElement(By.xpath("//input[@id='secondpassword']"));
cnfp.sendKeys("reddy123"); 
Thread.sleep(2000);

d.findElement(By.xpath("//button[@id='submitbtn']")).click();


	}

}
