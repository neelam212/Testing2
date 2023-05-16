package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestclass1 {
	WebDriver d;
	@BeforeTest
		public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
	}
  @Test(priority=1)
  public void verifytitle() 
  {
	  String expectedtitle="googlepage";
	  String actualresult=d.getTitle();
	  if(expectedtitle.equals(actualresult))
	  {
		  System.out.println("similartitle");
	  }
	  else
	  {
		  System.out.println("not similar");
  }
  }
}