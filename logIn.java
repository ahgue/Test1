package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  logIn {
	static String user 	= "";
	static String password = "";
	static WebDriver driver = new FirefoxDriver();
	
	public static void loggingIn(){
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		//login into facebook
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
		
		
	}

}
