package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyperlink_contact_us {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
        driver.get("https://myaccount.greenmountain.com/en_US/register");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	driver.findElement(By.linkText("Contact Us")).click();
	    
	}

}
