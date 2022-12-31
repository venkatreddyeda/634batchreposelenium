package testng;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JRI_Signin {
	           WebDriver driver;
	          
@Test
  public void Signin() throws Exception {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.justrechargeit.com");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("jriTop_signin9")).click();
		Thread.sleep(3000);
		
		// Scanner: System.in=Console
		
		Scanner s = new Scanner(System.in);
		String captcha  = s.next();
		Thread.sleep(10000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("venkateswarae2551@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("966613");
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
	    driver.findElement(By.name("imgbtnSignin")).click();
	    Thread.sleep(3000);
		
		
		
  }
}
