package Test1;


public class openingFirefox {
	
	public static void main(String args[]) throws InterruptedException{  	
	    /*
	    //publicando en facebook
	    //driver.findElement(By.xpath("//textarea[@title='¿Qué estás pensando?']")).sendKeys("probando selenium...");
	    //driver.findElement(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).click();
	    
	    //saliendo de facebook
	    driver.findElement(By.id("userNavigationLabel")).click();
	    //driver.findElement(By.xpath("//div[@cass='_5lxt']")).click();
	    driver.findElement(By.xpath("//input[@id='logout_menu_click']")).click();
	    */

		logIn.loggingIn();
		logOut.logginOut();
		Thread.sleep(5000);
		logIn.driver.quit();	
	    

	}  
}
