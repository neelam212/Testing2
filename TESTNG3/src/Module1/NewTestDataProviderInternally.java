package Module1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTestDataProviderInternally {
  @Test(dataProvider = "dp")
  public void login(String uname,String pwd) throws InterruptedException {
	  String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  ChromeDriver d=new ChromeDriver();
	  d.get(baseurl);
	  d.manage().window().maximize();
	  Thread.sleep(3000);
	  d.findElement(By.name("username")).sendKeys(uname);
	  d.findElement(By.name("password")).sendKeys(pwd);
	  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  d.close();
  }


  @DataProvider
  public Object[][] dp() {
    Object[][] data=new Object[2][2];
      
    	data[0][0]="admin";
    	data[0][1]="Admin123";
    	
    	data[1][0]="admin";
    	data[1][1]="Admin234";
    	
    	return data;
  }
  }


