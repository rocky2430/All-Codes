package POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test() throws IOException {
		
		WebElement test = driver.findElement(By.name("q"));
		File src = test.getScreenshotAs(OutputType.FILE);
		File des = new File("../selenium-01/ScreenShot/testBox.png");
		FileUtils.copyFile(src, des);
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
