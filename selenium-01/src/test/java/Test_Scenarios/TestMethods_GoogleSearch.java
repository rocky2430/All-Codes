package Test_Scenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	@BeforeTest
	public void beforetset() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void searchOperation() throws InterruptedException {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.seachgoogle("iphone");
		Thread.sleep(5000);
		}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
