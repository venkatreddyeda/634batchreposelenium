package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class H2o_Practice_Page {
	    WebDriver driver;
  @Test
  public void H2oPracticePage() throws Exception {
	          driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("file:///C:/Users/Dell/Downloads/H2o_Practice_Page.html");
	          Thread.sleep(5000);
	          
	        // Getall hyperLinks from H20Practice page and print it
			  List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
			  System.out.println("allhyperlink from H20Practice page " + allhyperlinks.size());
			  
			// Editbox count
			  List<WebElement> allEditbox = driver.findElements(By.tagName("input"));
			  System.out.println(" allEditbox from H20Practice page "+ allEditbox.size());
			  
			  // Dropdowns 
			  List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
			  System.out.println("allDropdowns from H20Practice page " + allDropdowns.size());
			  
			  // button
			  List<WebElement> allbutton = driver.findElements(By.tagName("button"));
			  System.out.println("allbutton from H20Practice page " + allbutton.size());
			  
			  // Images
			  List<WebElement> allImages = driver.findElements(By.tagName("img"));
			  System.out.println("allImages from H20Practice page " + allImages.size());
			  
			  // Radiobutton
			  List<WebElement> allRadiobutton = driver.findElements(By.tagName("div"));
			  System.out.println("allRadiobutton from H20Practice page " + allRadiobutton.size());
			  
			  // Checkboxes
	  
  }
}
