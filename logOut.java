package Test1;

import org.openqa.selenium.By;

public class logOut extends logIn{
	
	
	public static void logginOut() throws InterruptedException{
		System.out.println("loggin Out facebook");
		Thread.sleep(3000);
		logIn.driver.findElement(By.xpath("//div[@id='logoutMenu']/a[@id='pageLoginAnchor']")).click();
		Thread.sleep(3000);
		logIn.driver.findElement(By.xpath("//li[@class='_54ni navSubmenu __MenuItem']/a[@href='#']")).click();
	}

}
