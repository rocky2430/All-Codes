package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class local {

	WebDriver driver;
	@BeforeTest
	public void before() {
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void fb() {
		driver.findElement(By.linkText("Create new account"));
		driver.findElement(By.id("email")).sendKeys("Selenium");
		driver.findElement(By.id("pass")).sendKeys("1234554321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@AfterTest
	public void after() {
		driver.quit();
	}
	
}
