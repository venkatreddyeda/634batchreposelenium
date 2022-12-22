package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testautomationpractice_blogspot {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://testautomationpractice.blogspot.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	    new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");

	    new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
	    
	    new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
	    
	    new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
	    
	    new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");
	}

}
