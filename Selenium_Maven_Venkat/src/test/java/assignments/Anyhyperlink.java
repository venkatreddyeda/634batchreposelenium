package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anyhyperlink {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://demoqa.com/links");
	    driver.manage().window().maximize();
	    
	   // driver.findElement(By.linkText("Home")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("No Content")).click();
	}
	}


