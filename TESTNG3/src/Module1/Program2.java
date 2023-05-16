package Module1;

import org.testng.annotations.Test;

public class Program2 {
  @Test(priority=1)
  public void login() {
	  
	  System.out.println("logged in successfully");
  }
  
  @Test(priority=2)
 public void customer_Details() {
	  System.out.println("customer details are updated");
  }
  @Test(priority=3)
  public void productDetails()
  {
	  System.out.println("product details are updated");
  }
  @Test(priority=4)
  public void paymentdetaisl()
  {
	  System.out.println("payment done successfully");
  }
  @Test(priority=5)
  public void logoff()
  {
	  System.out.println("logged off successfully");
  }
}
