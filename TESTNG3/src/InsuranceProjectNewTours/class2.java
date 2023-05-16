package InsuranceProjectNewTours;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class2 extends class1{
  @Test
  public void Home() {
	  d.findElement(By.id("ui-id-1")).click();
	  System.out.println("home page opened");
  }
  @Test
  public void  RequestQuotation()
  {
	  d.findElement(By.id("ui-id-2")).click();
  }
  @Test
  public void  retrivequatation()
  {
	  d.findElement(By.id("ui-id-3")).click();
  }
  @Test
  public void  profile()
  {
	  d.findElement(By.id("profile")).click();
  }
  @Test
  public void  EditProfile()
  {
	  d.findElement(By.id("ui-id-5")).click();
  }
  public void logout()
  {
	  d.findElement(By.xpath("/html/body/div[3]/form/input")).click();
  }
  
}
