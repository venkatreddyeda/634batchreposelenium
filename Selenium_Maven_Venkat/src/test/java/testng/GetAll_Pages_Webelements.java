package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testScenarios.WebdriverMethods;

public class GetAll_Pages_Webelements {
	WebDriver driver = new ChromeDriver();

	@Test
	public void Hyperlinks() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		 driver.findElement(By.linkText("Create New Account")).click();
		 Thread.sleep(5000);

		//// Getall hyperLinks from google page and print it
		  List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
		  System.out.println("allhyperlink from facebook page " + allhyperlinks.size());

		
		  // Editbox count
		  List<WebElement> allEditbox = driver.findElements(By.tagName("input"));
		  System.out.println(" allEditbox from facebook page "+ allEditbox.size());
		  
		  // Dropdowns 
		  List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
		  System.out.println("allDropdowns from facebook page " + allDropdowns.size());
		  
		  // Radio
		  List<WebElement> allRadio = driver.findElements(By.tagName("button"));
		  System.out.println("allRadio from facebook page " + allRadio.size());
		  
		  // Checkboxes
		  List<WebElement> allCheckboxes = driver.findElements(By.tagName("span"));
		  System.out.println("allCheckboxes from facebook page " + allCheckboxes.size());
		  
		 

	}
}
