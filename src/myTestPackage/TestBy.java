package myTestPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TestBy {	

		public static void main(String[] args) {
			
         WebDriver driver;
		
			
			driver = new ChromeDriver();     
			// Using get() method to open a web page
			driver.get("https://hp.com");
   WebElement shoppingCartBtn = driver.findElement(By.id("shopping widget"));
   		
   shoppingCartBtn.click();

}
	}
