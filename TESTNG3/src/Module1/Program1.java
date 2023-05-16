package Module1;

import org.testng.annotations.Test;

public class Program1 {
  @Test(priority=1)
  public void add() {
	  int a=20;
	  int b=30;
	  int z=a+b;
	  System.out.println("addition of two values:" +z);
  }
  @Test(priority=2)
  public void sub() {
	  int a=20;
	  int b=30;
	  int z=a-b;
	  System.out.println("substraction of two values:" +z);
  }
  @Test(priority=3)//enabled=false..for skip the method.
  public void mul() {
	  int a=20;
	  int b=30;
	  int z=a*b;
	  System.out.println("multiplication of two values:" +z);
  }
  @Test(priority=4)
  public void div() {
	  int a=20,b=30,z=a/b;
	  System.out.println("division of two values:" +z);
  }
}
