package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tirupati_balaji {
	
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
  public void Tirupati() throws Exception {
	  
	  
	  driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	 
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"regdob\"]")).click();
	  Thread.sleep(3000);
	  
	  Select s = new Select(driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[1]")));
	  s.selectByVisibleText("September");
	  
	  Select s1 = new Select(driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[2]")));
	  s1.selectByVisibleText("1992");
	  Thread.sleep(3000);
	  
	 // Select s2 = new Select(driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/table/tbody/tr[2]/td[6]/a")));
	 // s2.selectByVisibleText("10");
	  
	  driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/table/tbody/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[1]/div[2]/div[5]/span[2]/input")).click();
  }
}
