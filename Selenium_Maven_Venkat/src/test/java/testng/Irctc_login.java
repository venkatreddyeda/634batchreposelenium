package testng;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Irctc_login {
	        WebDriver driver;
	
  @Test
  public void Irctclogin() throws Exception {
	  driver = new ChromeDriver();
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	 
	    
	  driver.findElement(By.xpath("//a [@class='search_btn loginText ng-star-inserted']")).click();
	  
	  driver.findElement(By.xpath("//input[@name='captcha']")).getText();
	  System.out.println("Enter Captcha");
	  
	  Scanner s = new Scanner(System.in);
	  String capture = s.next();
	  Thread.sleep(10000);
	  
	  driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(capture);
  }
}







/*
 * driver.findElement(By.id("alertButton")).click();
 * System.out.println(driver.switchTo().alert().getText());
 * driver.switchTo().alert().accept(); Thread.sleep(5000);
 * 
 * driver.findElement(By.id("Allow")).click(); Thread.sleep(5000);
 */



