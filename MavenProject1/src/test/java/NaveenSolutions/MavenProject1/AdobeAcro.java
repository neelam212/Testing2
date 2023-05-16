package NaveenSolutions.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdobeAcro {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
				 d=new ChromeDriver(co);
				 d.get("https://auth.services.adobe.com/en_US/index.html?callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fadobeid%2Fadobedotcom2%2FAdobeID%2Ftoken%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.adobe.com%252F%2523old_hash%253D%2526from_ims%253Dtrue%253Fclient_id%253Dadobedotcom2%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Cgnav%252Cread_organizations%252Cadditional_info.projectedProductContext%252Cadditional_info.roles%26state%3D%257B%2522ac%2522%253A%2522%2522%252C%2522jslibver%2522%253A%2522v2-v0.38.0-17-g633319d%2522%252C%2522nonce%2522%253A%25224183734203082962%2522%257D%26code_challenge_method%3Dplain%26use_ms_for_expiry%3Dtrue&client_id=adobedotcom2&scope=AdobeID%2Copenid%2Cgnav%2Cread_organizations%2Cadditional_info.projectedProductContext%2Cadditional_info.roles&denied_callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fdenied%2Fadobedotcom2%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.adobe.com%252F%2523old_hash%253D%2526from_ims%253Dtrue%253Fclient_id%253Dadobedotcom2%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Cgnav%252Cread_organizations%252Cadditional_info.projectedProductContext%252Cadditional_info.roles%26response_type%3Dtoken%26state%3D%257B%2522ac%2522%253A%2522%2522%252C%2522jslibver%2522%253A%2522v2-v0.38.0-17-g633319d%2522%252C%2522nonce%2522%253A%25224183734203082962%2522%257D&state=%7B%22ac%22%3A%22%22%2C%22jslibver%22%3A%22v2-v0.38.0-17-g633319d%22%2C%22nonce%22%3A%224183734203082962%22%7D&relay=c70249b0-be86-40f9-96bd-3ce3ac0378d3&locale=en_US&flow_type=token&idp_flow_type=login&ab_test=social-prio-just-white-with-distance%7Csocial-prio-just-white%7Creference&s_p=google%2Cfacebook%2Capple&response_type=token#/");
				 d.manage().window().maximize();
				 //Thread.sleep(2000);
				 d.findElement(By.id("Signup-GoogleButton")).click();
				 d.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div")).click();
				// Thread.sleep(2000);
				// d.findElement(By.xpath("//*[@id=\"EmailForm\"]/section[2]/div[2]/button"));
				// d.findElement(By.name("password")).sendKeys("admin123");
	}

}
