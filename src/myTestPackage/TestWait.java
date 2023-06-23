package myTestPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestWait {
	public static void main(String[] args) 
				throws InterruptedException {
	
			
			Test test = new Test();
			// Creating a driver object referencing WebDriver interface
			WebDriver driver;
			
			// Setting webdriver.gecko.driver property		
			driver = new ChromeDriver();
			// Using get() method to open a web page
			driver.get("https://www.shoptoyota.ca/ontario/en");
			// Closing the browser
			
			test.wait(10000);
			driver.get("https://www.google.ca");
			
			test.wait(10000);
			driver.navigate().back();
			
			
			test.wait(10000);
			driver.navigate().forward();
			
			  
			  /* driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.get("https://www.google.ca");
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.navigate().back();
						
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				*/driver.navigate().forward();//
			  
		

	}

}
