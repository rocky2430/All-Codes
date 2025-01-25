package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.Test3_Page;

public class Test3_method {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void Test3() {
		Test3_Page tp3 = new Test3_Page(driver);
		tp3.UserName("Admin");
		tp3.PassWord("admin123");
		tp3.LogIn();
		System.out.println("LogOut Test 3");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
