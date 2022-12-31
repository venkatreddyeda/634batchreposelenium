package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class blazedemo {
	WebDriver driver;
	
	// parameters: to get the browser value from xml file.
	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch (String browserName) {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
		
	

	@Test
	public void blazedemopage() throws Exception {

		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://blazedemo.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Mexico City");

		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("New York");

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();

		driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("venkat");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("KPHB Colony");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("HYD");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("500072");

		new Select(driver.findElement(By.xpath("//select[@name='cardType']"))).selectByVisibleText("American Express");
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("4582113417238943");
		driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("08");
		driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("1992");
		driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Venkateswara reddy");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    
	    //String abc = driver.findElement(By.xpath("/html/body/div[2]/div/table")).getText();
         //System.out.println(abc);
         
        String abc = driver.findElement(By.xpath("(//div[contains(@class,'container')])[3]")).getText();
        System.out.println(abc);
		
	
	}

}
