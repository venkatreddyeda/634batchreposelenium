package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukriRegisterPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("name")).sendKeys("venkat");
	    driver.findElement(By.name("email")).sendKeys("venkat@1234");
	    driver.findElement(By.id("password")).sendKeys("venky123");
	    driver.findElement(By.id("mobile")).sendKeys("9133113138");
	   Select s = new Select(driver.findElement(By.linkText("I'm Experienced")));
	   

	}

}
