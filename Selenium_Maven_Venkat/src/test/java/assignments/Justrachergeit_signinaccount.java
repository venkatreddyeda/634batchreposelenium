package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrachergeit_signinaccount {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.justrechargeit.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	    
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.name("txtUserName")).sendKeys("icbib");
	    driver.findElement(By.name("txtPasswd")).sendKeys("dvuwrgi");
	    driver.findElement(By.name("txtCaptcha")).sendKeys("22");
	    
	    
	    Thread.sleep(5000);
	   
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());

	    System.out.println("**************************");
	    
	  driver.navigate().refresh();
	  driver.navigate().back();
	  
	  System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    
	  driver.navigate().forward();
	  
	  driver.quit();
	  
	}

}
