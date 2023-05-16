package Module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class BeforeTestclass2 extends BeforeTestclass1 {
  @Test(priority=2)
  public void url() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=3)
  public void screenshot() throws IOException
  {
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("D://attt.png"));
  }
}
