package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage_Home {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///C:/Users/Dell/Downloads/QE%20-%20index.html");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("inputEmail")).sendKeys("venkat@123");
	    driver.findElement(By.id("inputPassword")).sendKeys("Reddy@1992");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//form[@class=\"form-signin\"]")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).click();
	  //  driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).

	}

}
