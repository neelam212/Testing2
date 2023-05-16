package InsuranceProjectNewTours;

import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;

public class class3 extends class2 {
  @AfterTest
  public void close() {
	  d.close();
  }
}
