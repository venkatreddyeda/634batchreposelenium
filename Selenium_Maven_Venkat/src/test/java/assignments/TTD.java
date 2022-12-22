package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	    driver.manage().window().maximize();

	    Thread.sleep(5000);
	    
	    new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");

	    new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Goa");
	}

}
