package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fatcowPage {
	
	WebDriver driver;
	@BeforeTest
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=naukri&oq=naukri&gs_lcrp=EgZjaHJvbWUqEAgAEAAYgwEY4wIYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyEwgBEC4YgwEYxwEYsQMY0QMYgAQyDQgCEAAYgwEYsQMYgAQyDQgDEAAYgwEYsQMYgAQyDQgEEAAYgwEYsQMYgAQyDQgFEAAYgwEYsQMYgAQyCggGEAAYsQMYgAQyBwgHEAAYgAQyBwgIEAAYgATSAQkzMDgyajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void NAUKRI() {
	//	driver.findElement(By.name("q")).sendKeys("naukri");
	//	driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.findElement(By.partialLinkText("Naukri.com - Quick Job Apply")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("Selenium");
		
	}
	@AfterTest
	public void after() {
		driver.quit();
	}
}