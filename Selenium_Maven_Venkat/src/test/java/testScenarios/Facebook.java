package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/signup");
		    driver.manage().window().maximize();
		    
		    
		    
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venkat");
		    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("eda");
		    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("venkat025@gmail.com");
		    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("venkat025@gmail.com");
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("reddy@123");
		    
		   Select s = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		   s.selectByVisibleText("10");
		   
		   Select s1 = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		   s1.selectByVisibleText("Sep");
		   
		   Select s2 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		   s2.selectByVisibleText("1992");
		   
		   driver.findElement(By.xpath("//input[@value='2']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		   
		   
		   
	}

}
