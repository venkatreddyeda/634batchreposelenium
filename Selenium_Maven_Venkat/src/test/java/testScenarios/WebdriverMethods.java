package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com");
		    driver.manage().window().maximize();
		    
		    Thread.sleep(5000);
		    
		    // GETCURRENTURL(): GET the current webpage URL
		    
		    System.out.println(driver.getCurrentUrl());
		    System.out.println("**********************************8");
		    
		    // GETTITLE(): Get the current webpage title
		    
		    System.out.println(driver.getTitle());
		     
		    // click on forget password? link
		    
		    driver.findElement(By.linkText("Forgotten password?")).click();
		    
		    
		    
// GETCURRENTURL(): GET the current webpage URL
		    
		    System.out.println(driver.getCurrentUrl());
		    
		    // GETTITLE(): Get the current webpage title
		    
		    System.out.println(driver.getTitle());
		    

	}

}
