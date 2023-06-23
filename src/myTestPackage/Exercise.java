package myTestPackage;

    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import java.time.Duration;
import java.time.*;
    
    public class Exercise {

		public static void main(String[] args) {

			// Creating a driver object referencing WebDriver interface
			WebDriver driver;

			// Setting webdriver.gecko.driver property
			driver = new ChromeDriver();

			// 1) Go to the web site
			// visiting the desired web site
			driver.get("https://www.saucedemo.com/");
			//wait until web site loaded 100%
            //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			

			// 2) write user name

			// identify the user name text box
			WebElement txtBxUserName = driver.findElement(By.id("user-name"));

			// type the user name
			txtBxUserName.sendKeys("standard_user");

			// 3) write Password

			// identify the password text box
			WebElement txtBxPassword = driver.findElement(By.id("password"));

			// type the password
			txtBxPassword.sendKeys("secret_sauce");

			// 4) Click Login Button
			// identify the login btn
			WebElement btnLogin = driver.findElement(By.id("login-button"));
			btnLogin.click();

		}

	}


