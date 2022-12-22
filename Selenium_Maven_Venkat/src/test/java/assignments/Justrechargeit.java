package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrechargeit {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.justrechargeit.com/SignIn.aspx");
		    driver.manage().window().maximize();
		    
		    driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("venkat@123");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9666345678");
            
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//input[@name='txtCaptcha']")).sendKeys("92");
            
            driver.findElement(By.xpath("//input[@name='imgbtnSignin']")).click();
            
            
            String abc =  driver.findElement(By.id("values")).getText();
      	    System.out.println(abc);
	}

}
