package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.facebookPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_facebook {

	WebDriver driver;
	@BeforeTest
	public void beforetset() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void FillingDetailsOperation() {
		facebookPage page = new facebookPage(driver);
		page.createNewAccount();
		page.firstName("Rahul");
		page.surName("Mansarowar");
		page.gendre();
		page.email("selenium@gmail.com");
		page.password("12344321");
		
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
