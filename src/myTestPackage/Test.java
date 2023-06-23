package myTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) {
		// Creating a driver object referencing WebDriver interface
		WebDriver driver;
	
		// Setting webdriver.gecko.driver property
		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\KhongorzulOtgon\\Desktop\\geckodriver.exe")
		
		

		// Instantiating driver object and launching browser

		driver = new ChromeDriver();     
		// Using get() method to open a web page
		driver.get("https://google.ca");
		// Closing the browser
		WebElement googleSearchbar = driver.findElement(By.xpath("//*[@id=\"content\"]/dom-if[1]\n"
				+ "}"));
		googleSearchbar.sendKeys("Hello Zoe");
		
		//driver.quit();
		
		try {
		  Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
		

	
	
