package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeek {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumWithJava\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://collegeweeklive.com/go-signup");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Venkat");
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Reddy");
    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("venkat@123");
    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9666132457");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reddy1234");
    driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("reddy1234");
    
    Select S = new Select(driver.findElement(By.xpath("//*[@name='nationality']")));
    S.selectByVisibleText("INDIA");
    
    Select S1 = new Select(driver.findElement(By.xpath("//*[@name='attendeeType']")));
    S1.selectByVisibleText("Parent");
    
    Select S2 = new Select(driver.findElement(By.xpath("//*[@id='questions[q_134]']")));
    S2.selectByVisibleText("Fall 2022");
    
    driver.findElement(By.xpath("//input[@id='questions[q_135]']")).click();
    driver.findElement(By.xpath("//input[@id='questions[q_136]']")).click();
    driver.findElement(By.xpath("//input[@id='questions[q_137]']")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.id("submit")).click();
    

	}

}
