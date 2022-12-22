package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;

public class Justrechargeit_prat {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.justrechargeit.com/SignUp.aspx");
	    driver.manage().window().maximize();
	    
	  String abc = driver.findElement(By.linkText("Create Account")).getText();
	  System.err.println(abc);
	
	    
	    System.err.println("Enter your name");
	    
	    
	    Thread.sleep(5000);
	}

}
