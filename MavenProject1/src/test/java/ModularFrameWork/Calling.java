package ModularFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Calling {
	
	
	static WebDriver driver1=null;

	public static void main(String[] args) {

	ChromeOptions co=new ChromeOptions();
	co.addArguments("---remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver driver1=new ChromeDriver(co);
driver1.manage().window().maximize();
driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
login_action.execute(driver1);
driver1.quit();


//FileInputStream f=new FileInputStream("D:\\write1.xlsx");

//xssfworkbook wb=new XSSFWorkbook(f);
//XSSFSheet ws=wb.getSheet("sheet2"); 

Row r=null;
Cell c=null;

System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/register.php");
d.manage().window().maximize();
WebElement drop=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]"));
List<WebElement>drop1=drop.findElements(By.tagName("option"));
System.out.println(drop1.size());

for(int i=0;i<drop1.size();i++)
{
	System.out.println(drop1.get(i).getText());

//r=ws.createRow(i);
r.createCell(0).setCellValue(drop1.get(i).getText());
drop1.get(i).click();

if(drop1.get(i).isSelected())
{
	r.createCell(1).setCellValue("pass");
}
else
{
	r.createCell(1).setCellValue("fail");
}
}

//FileOutputStream f1=new FileOutputStream("D:\\write1.xlsx");

//wb.write(f1);
//f1.close();
}
}

  
	
