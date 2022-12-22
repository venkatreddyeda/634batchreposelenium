package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedSample {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.justrechargeit.com/SignUp.aspx");
	    driver.manage().window().maximize();
	    
		if(driver.findElement(By.id("checkbox1")).isSelected()) {
			System.out.println("first checkbox is selected by default");
		} else {
			System.out.println("first checkbox is not selected by default");
		}
		
		System.out.println("*****************************");
		
		if(driver.findElement(By.id("checkbox")).isSelected()) {
			System.out.println("second checkbox is selected by default");
		} else {
			System.out.println("second checkbox is not selected by default");
		}
			

	}

}
