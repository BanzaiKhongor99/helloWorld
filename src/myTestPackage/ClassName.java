package myTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	
	public static void main(String[] args) {

	 WebDriver driver;

	  driver = new ChromeDriver();     
		// Using get() method to open a web page
		driver.get("https://hp.com");// driver.navigate("   ");
 
		 WebElement signBtn = driver.findElement(By.className("wpr-signin"));
		  signBtn.click();
		 //WebDriver driver;
			
			// Setting webdriver.gecko.driver property		
			driver = new ChromeDriver();
			// Using get() method to open a web page
			driver.get("https://www.shoptoyota.ca/ontario/en");
			// Closing the browser
			
			  WebElement lblHomeMessage =
			  driver.findElement(By.className("home_message"));
			  String homeMessage =lblHomeMessage.getText();
			  
			  System.out.println(homeMessage);

}
}