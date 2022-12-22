package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAccount {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/your-account");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus moblie 5g");
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//*[@id=\"p_89/OnePlus\"]/span/a/div/label/i")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"low-price\"]")).sendKeys("20000");
	  driver.findElement(By.xpath("//*[@id=\"high-price\"]")).sendKeys("40000");
	  driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath
    ("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	  
	 
	}
	

}
