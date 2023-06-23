package myTestPackage;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Css {

		public static void main(String[] args) {

			// Creating a driver object referencing WebDriver interface
			WebDriver driver;

			// Setting webdriver.gecko.driver property
			driver = new ChromeDriver();
			
			

			// 1) Go to the website
			// visiting the desired website
			driver.get("file:///Users/khongorzulotgon/Desktop/myFirstWebSite.html");

	        //creating the wait condition with 10 seconds of maximum delay
			
			//clicking on the link after the wait
			WebElement txtBox = driver.findElement(By.cssSelector("input#fname"));
			txtBox.sendKeys("Hello!");

		}

	}


