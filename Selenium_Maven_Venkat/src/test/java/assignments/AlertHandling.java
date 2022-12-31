package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
	
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demoqa.com/alerts");
		    driver.manage().window().maximize();
		    
		    // click on first click me button
		    driver.findElement(By.id("alertButton")).click();
		    Thread.sleep(5000);
		    
		    // alert will display, how to handle?
		    // get the alert text
		    System.out.println(driver.switchTo().alert().getText());
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    
		    // confirmation code
		    driver.findElement(By.id("confirmButton")).click();
		    Thread.sleep(5000);
		    
		    // click on cancel button confirmation alert
		   // driver.switchTo().alert().dismiss();
		    
		    // click on ok button confirmation alert
		    driver.switchTo().alert().dismiss();

	}

}
