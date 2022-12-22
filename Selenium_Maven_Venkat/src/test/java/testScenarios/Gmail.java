package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com/account/about");
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.linkText("Create an account")).click();
		  driver.findElement(By.name("firstName")).sendKeys("venkat");
		  driver.findElement(By.name("lastName")).sendKeys("reddy");
		  driver.findElement(By.id("username")).sendKeys("venkatreddy11");
		  driver.findElement(By.id("password")).sendKeys("12345678");
	}

}
