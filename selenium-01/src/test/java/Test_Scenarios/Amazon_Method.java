package Test_Scenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.Amazon_page;

public class Amazon_Method {

	WebDriver driver;
	@BeforeTest
	public void Beforetest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void mobile_Order() {
		Amazon_page a = new Amazon_page(driver);
		a.google_Search("amazon");
		a.google_search_Button();
		a.Link();
		a.amazon_search("samsung galaxy s23 ultra 5g mobile");
		a.amazon_search_Button();
		a.mobile_Click();
		a.window_Handle(driver);
	//	a.check_Box();
		a.addTOCart();
		a.proceedToBuy();
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
}
