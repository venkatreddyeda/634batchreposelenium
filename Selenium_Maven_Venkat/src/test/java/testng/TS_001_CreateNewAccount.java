package testng;

import java.sql.Driver;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TS_001_CreateNewAccount {
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
  public void TC_001() throws Exception {
	  
	  driver.get("https://www.justrechargeit.com");
	  Thread.sleep(5000);
  }
	  
	  @Test
	  public void TC_002() throws Exception {
		  
		  driver.findElement(By.partialLinkText("Create New Account")).click();
		  Thread.sleep(5000);
		  // verify the URL has change or not?
		  String expectedURL = "https://www.justrechargeit.com/SignUp.aspx";
		  String actulaURL = driver.getCurrentUrl();
		  // Validate the expected and actual URLs are same?
		  if (actulaURL.equals(expectedURL)) {
			  System.out.println("Create an account URL is matching as per the testcase");
		} else {
			 System.out.println("Create an account URL is not matching as per the testcase");
		}
	  }
			
		  @Test
		  public void TC_003() throws Exception {
			  driver.findElement(By.id("imgbtnSubmit")).click();
			  Thread.sleep(5000);
			String nameErrorMessage = driver.findElement(By.className("errormsg")).getText();
			String nameErrorMessageExpected = "Enter your name";
	  //Assert.assertEquals(nameErrorMessage, nameErrorMessageExpected)
			if (nameErrorMessage.equals(nameErrorMessageExpected)) {
				System.out.println("Application is displayed the validation message 'Enter your name'");
			} else {
				System.out.println("Application is not displayed the validation message 'Enter your name'");
				
			}
		  }
		  
		  
		  @Test
		  public void TC_004() throws Exception {
			  driver.findElement(By.name("signup_name")).sendKeys("venkatreddy");
			  driver.findElement(By.name("imgbtnSubmit")).click();
			  Thread.sleep(5000);
			  String MoblieNoErrorMessage = driver.findElement(By.className("errormsg")).getText();
			  String MoblieNoErrorMessageExpected = "Enter mobile no.";
		// Assert.assertEquals(MoblieNoErrorMessage, MoblieNoErrorMessageExpected)
			  if (MoblieNoErrorMessage.equals(MoblieNoErrorMessageExpected)) {
				    System.out.println("Application is display the validation message 'Enter mobile no.'");
			} else {
				System.out.println("Application is not display the validation message 'Enter mobile no.'");

			}
		  }
		  
		  @Test
		  public void TC_005() throws Exception {
			  driver.findElement(By.id("signup_mobileno")).sendKeys("9133113138");
			  driver.findElement(By.name("imgbtnSubmit")).click();
			  Thread.sleep(5000);
			  String EmailIDErrorMessage = driver.findElement(By.className("errormsg")).getText();
			  String EmailIDErrorMessageExpected = "Enter your email id";
			  ///
			  if (EmailIDErrorMessage.equals(EmailIDErrorMessageExpected)) {
				   System.out.println("Application is display the validation message 'Enter your email id'");
			} else {
				System.out.println("Application is not display the validation message 'Enter your email id'");

			}
			  
		  }
			  
		  @Test
		  public void TC_006() throws Exception {
			  driver.findElement(By.id("signup_email")).sendKeys("venkateswarae2551@gmail.com");
			  driver.findElement(By.name("imgbtnSubmit")).click();
			  Thread.sleep(5000);
			  String PasswordErrorMessage = driver.findElement(By.className("errormsg")).getText();
			  String PasswordErrorMessageExpected = "Enter your password";
			  ///
			  if (PasswordErrorMessage.equals(PasswordErrorMessageExpected)) {
			        System.out.println("Application is display the validation message'Enter your password'");	
			} else {
				    System.out.println("Application is not display the validation message'Enter your password'");   

			}
		  }
		
		  @Test
		  public void TC_007() throws Exception {
			  
			  driver.findElement(By.id("signup_password")).sendKeys("9666132457");
			  driver.findElement(By.name("imgbtnSubmit")).click();
			  Thread.sleep(5000);
			  String TermsErrorMsg = driver.findElement(By.className("errormsg")).getText();
			  String TermsErrorMsgExpected = "Please agree to the terms & conditions";
			  if (TermsErrorMsg.equals(TermsErrorMsgExpected)) {
				  System.out.println("Application is display the validation message'Please agree to the terms & conditions'");
			} else {
				System.out.println("Application is not display the validation message'Please agree to the terms & conditions'");

			}
		        
		  }
		  
		  @Test
		  public void TC_008() throws Exception {
			  
		     driver.findElement(By.xpath("//input[@name='checkbox']")).click();
		     driver.findElement(By.name("imgbtnSubmit")).click();
		     Thread.sleep(5000);
			  
			 driver.navigate().refresh();
			  
		  }
		  
		  @Test
		  public void TC_009() throws Exception {
			  driver = new ChromeDriver();
			  driver.get("https://www.justrechargeit.com/SignUp.aspx");
			  driver.manage().window().maximize();
			  Thread.sleep(5000);
			  
			  driver.findElement(By.name("signup_name")).sendKeys("venkatreddy");
			  driver.findElement(By.id("signup_mobileno")).sendKeys("9381135502");
			  driver.findElement(By.id("signup_email")).sendKeys("venkateswarae2551@gmail.com");
			  driver.findElement(By.id("signup_password")).sendKeys("966613");
			  driver.findElement(By.xpath("//input[@name='checkbox']")).click();
			  driver.findElement(By.name("imgbtnSubmit")).click();

			  
			  
			  }
			  
		   }


	  
	 

