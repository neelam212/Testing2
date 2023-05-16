package NaveenSolutions.MavenProject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameDezLearnCom {
	
	
ChromeDriver d;
	String url="https://www.dezlearn.com/nested-iframes-example/";
	
	public void opening_Browser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver(co);
	}
	
	public void Navigate() {
		d.get(url);
		d.manage().window().maximize();
	}
public void url()
{
	System.out.println(d.getCurrentUrl());
}
public void title() {
	System.out.println(d.getTitle());
}

public void frame() throws InterruptedException {
	
d.switchTo().frame("parent_iframe");
Thread.sleep(2000);
d.findElement(By.id("u_5_5")).click();

WebElement text=d.findElement(By.id("processing"));
System.out.println(text.getText());

d.switchTo().frame("iframe1");
Thread.sleep(2000);
d.findElement(By.id("u_5_6")).click();
WebElement text1=d.findElement(By.id("processing"));
System.out.println(text1.getText());
d.switchTo().defaultContent();
Thread.sleep(2000);
}

public void screenshot() throws IOException
{
	//File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src,new File("D://a1.png"));
	
	TakesScreenshot t=(TakesScreenshot)d;//screen shot for whole screen
	File source=t.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+ "\\Screenshots\\app.png");
	FileUtils.copyFile(source, target);
}
public void close()
{
	d.close();
}

	public static void main(String[] args) throws IOException, InterruptedException {
		NestedFrameDezLearnCom a=new NestedFrameDezLearnCom();
		a.opening_Browser();
		a.Navigate();
		a.url();
		a.title();
		a.frame();
		a.screenshot();
		a.close();

	}

}
