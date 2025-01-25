package practiceTestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.Amazon_page;
import ObjectSearch.facebookPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	WebDriver driver;
	@BeforeTest
	public void beforetset() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2)
	public void FillingDetailsOperation() {
		facebookPage page = new facebookPage(driver);
		page.google_Search("Facebook");
		page.google_Search_button();
		page.Link();
		page.createNewAccount();
		page.firstName("Rahul");
		page.surName("Mansarowar");
		page.gendre();
		page.email("selenium@gmail.com");
		page.password("12344321");
		
	}
	
	@Test(priority=3)
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
	public void AfterTest() {
		     driver.quit();
		 }	
	
}
