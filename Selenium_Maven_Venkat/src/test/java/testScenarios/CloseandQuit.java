package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    // click on new window button
	    
	    driver.findElement(By.id("windowbutton")).click();
	    Thread.sleep(5000);
	    
	    driver.quit();

	}

}
