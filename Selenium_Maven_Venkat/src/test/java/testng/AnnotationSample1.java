package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationSample1 {
	WebDriver driver;

	@Test
	public void add() {
		System.out.println("@Test add");

	}

	@Test
	public void fblogin() throws Exception {
		System.out.println("@test fblogin");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("venkat@123");
		driver.findElement(By.id("pass")).sendKeys("Reddy123");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void sub() {
		System.out.println("@test sub");
  }
}
