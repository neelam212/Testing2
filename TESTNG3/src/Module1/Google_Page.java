package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Page {
	WebDriver d;
  @Test(priority=1)
  public void opening_Browser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://google.com");
	  d.manage().window().maximize();
  }
  @Test(priority=2)
  public void title()
  {
	  System.out.println(d.getTitle());
  }
  @Test(priority=3)
  public void url()
  {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=4)
  public void close()
  {
	  d.close();
  }
  
}
