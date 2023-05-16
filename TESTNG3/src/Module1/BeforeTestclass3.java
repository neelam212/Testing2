package Module1;

import org.testng.annotations.AfterTest;

public class BeforeTestclass3 extends BeforeTestclass2{
  @AfterTest
  public void close() {
	  d.close();
	  System.out.println("closed");
  }
}
