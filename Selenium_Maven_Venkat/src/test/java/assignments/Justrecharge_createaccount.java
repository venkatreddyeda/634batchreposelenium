package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrecharge_createaccount {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.justrechargeit.com");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Create New Account")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("signup_name")).sendKeys("venkat reddy");
	    
	    driver.findElement(By.id("signup_mobileno")).sendKeys("9000012345");
	    
	    driver.findElement(By.id("signup_email")).sendKeys("venkat96660@gmail.com");
	    
	    driver.findElement(By.id("signup_password")).sendKeys("886123");
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@title='Create Account']")).click();
	    

	}

}
