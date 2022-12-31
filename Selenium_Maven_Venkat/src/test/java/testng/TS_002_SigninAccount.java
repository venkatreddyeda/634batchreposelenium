package testng;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_002_SigninAccount {
	        WebDriver driver;
	        
	        @Test
	          public void TC_010() throws Exception{
			  driver = new ChromeDriver();
			  driver.get("https://www.justrechargeit.com");
			  driver.manage().window().maximize();
			  Thread.sleep(5000);
			  
			  
		  
		 }
	          
	          @Test
			  public void TC_011() throws Exception {
	        	  driver.findElement(By.id("jriTop_signin9")).click();
	        	  Thread.sleep(5000);
	          }
		 
	          @Test
			  public void TC_012() throws Exception {
	        	  driver.findElement(By.id("imgbtnSignin")).click();
	        	  Thread.sleep(5000);
	  			String NameErrorMessage = driver.findElement(By.className("errormsg")).getText();
	  			String NameErrorMessageExpected = "Enter your email";
	  			////  As per the Test data sheet all validation message
	  			if (NameErrorMessage.equals(NameErrorMessageExpected)) {
					System.out.println("As per the Testdata sheet all validation messages is display");
				} else {
					System.out.println("As per the Testdata sheet all validation messages is not display");
				}
	          }
	  			
	  		  @Test
	  		  public void TC_013() throws Exception {
	  			 
	  			Scanner s = new Scanner(System.in);
	  			  String captcha = s.next();
	  			
	  			
	  			  driver.findElement(By.id("txtUserName")).sendKeys("venkateswarae2551@gmail.com");
	  			  driver.findElement(By.id("txtPasswd")).sendKeys("966613");
	  			 
	  			  driver.findElement(By.id("txtCaptcha")).sendKeys("");
	  			  driver.findElement(By.id("imgbtnSignin")).click();
	  			  Thread.sleep(3000);
	  		  }
	  			  
	  			@Test
		  		  public void TC_014() throws Exception {
	  				driver.findElement(By.xpath("//*[@id='jriTop_signOut']")).click();
	  				Thread.sleep(3000);
	  			}
	  			
	  			@Test
		  		  public void TC_015() throws Exception {
	  				driver.findElement(By.id("forgotpassword")).click();
	  				Thread.sleep(5000);
	  				boolean Expected = driver.findElement(By.id("defaulttext1")).isDisplayed();
	  				String Actual   = driver.getCurrentUrl();
	  				////  Application should Forgot your password
	  				if (Actual.equals(Expected)){
						   System.out.println("Application Forgot your password is displayed");
					} else {
						 System.out.println("Application Forgot your password is not displayed");

					}
	  		
	  				
	  			
	  			}
 
  }

