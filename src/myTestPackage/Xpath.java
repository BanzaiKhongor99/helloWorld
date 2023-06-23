
	package myTestPackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath {
		public static void main(String[] args) {
			// Creating a driver object referencing WebDriver interface
			WebDriver driver;
			driver = new ChromeDriver();

			driver.get("https://google.ca");

			// Locate elements by ID
			WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			googleSearchBox.click();

			googleSearchBox.sendKeys("Hello World");

		}

	}

/*package myTestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {
	public static void main(String[] args) {
		// Creating a driver object referencing WebDriver interface
		WebDriver driver;		
		driver = new FirefoxDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		////*[text()=’Google Search’]
		WebElement wikipediaLoginBtn = driver.findElement(By.xpath("//*[text()='Log in']"));
		wikipediaLoginBtn.click();
		
		package myTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {
	public static void main(String[] args) {
		// Creating a driver object referencing WebDriver interface
		WebDriver driver;		
		driver = new FirefoxDriver();
		
		driver.get("https://google.ca");
		
		//Locate elements by ID
		WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		googleSearchBox.click();
		
		googleSearchBox.sendKeys("Hello World");
		
		WebElement googleSearchBtn = driver.findElement(By.xpath("//*[@value='Google Search']"));
		googleSearchBtn.click();
			
	}

}
			
	}

}*/
