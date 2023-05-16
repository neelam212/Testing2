package NaveenSolutions.MavenProject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
WebDriver d;
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\MavenProject1\\Drivers\\chromedriver.exe");
		 d=new ChromeDriver(c);
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		TakesScreenshot t=(TakesScreenshot)d;//screen shot for whole screen
		File source=t.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+ "\\Screenshots\\a1.png");
		FileUtils.copyFile(source, target);
		
			//screenshot for particular element
		WebElement ele=d.findElement(By.xpath("//*[@class='a-link-normal see-more truncate-1line']"));
		 source=ele.getScreenshotAs(OutputType.FILE);
	     target=new File(System.getProperty("user.dir")+ "\\Screenshots\\a2.png");
			FileUtils.copyFile(source, target);

			//screenshot for the header part..
			WebElement logo=d.findElement(By.xpath("//*[@id='nav-belt']"));
			source=logo.getScreenshotAs(OutputType.FILE);
			target=new File(System.getProperty("user.dir")+"\\Screenshots\\a3.png");
			FileUtils.copyFile(source, target);
			
			//screenshot for footer section in the window
			WebElement footer=d.findElement(By.xpath("//*[@id='navFooter']"));
			source=footer.getScreenshotAs(OutputType.FILE);
			target=new File(System.getProperty("user.dir")+"\\Screenshots\\a4.png");
			FileUtils.copyFile(source, target);
	}

}
