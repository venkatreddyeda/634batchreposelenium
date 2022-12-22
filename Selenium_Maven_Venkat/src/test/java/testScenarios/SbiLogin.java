package testScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiLogin {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		    driver.manage().window().maximize();

		    Thread.sleep(5000);
		    
		    driver.findElement(By.className("login_button")).click();
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("Button2")).click();
		    
		    
		    
		   Alert alert= driver.switchTo().alert();
		    String alertmsg = driver.switchTo().alert().getText();
		    System.out.println(alertmsg);
		    alert.accept();
		    
		    driver.findElement(By.partialLinkText("Register")).click();
		    
		    Thread.sleep(5000);
		    
		    driver.switchTo().alert().accept();
		   // driver.switchTo().alert().accept();
		    //driver.quit();
		    
		    
		    
		    
		    
		    
		   
	}

}
