package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {
	WebDriver d;
	@BeforeClass
	//@Test
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
  @Test(priority=2)
  public void url()
  {
	  System.out.println(d.getCurrentUrl());
  }

  @AfterClass
  //@Test
  public void close()
  {
	  d.close();
	  System.out.println("closed");
  }
  }
