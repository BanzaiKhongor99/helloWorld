package myTestPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Homework {
	public static void main(String[] args) throws Exception{
		WebDriver driver;
		driver= new ChromeDriver();
		 
		driver.get("https://elearn.mnlct.org/login/index.php");
		WebElement txtBxUserName = driver.findElement(By.id("username"));
		txtBxUserName.sendKeys("kotgon");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Rich$9999");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement loginBtn=driver.findElement(By.id("loginbtn"));
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.quit();
		
		
	}
	

}
