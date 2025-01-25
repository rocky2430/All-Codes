package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.Amazon_page;
import ObjectSearch.facebookPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	WebDriver driver;
	@BeforeTest
	public void Beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
	}
	
	@Test(priority=0)
	public void mobile_Order() throws InterruptedException {
		Amazon_page a = new Amazon_page(driver);
		System.out.println("Strat Amazon");
		a.sleep();
		a.google_Search("amazon");
		a.google_search_Button();
		a.Link();
		a.amazon_search("samsung galaxy s23 ultra 5g mobile");
		a.amazon_search_Button();
		a.mobile_Click();
		a.window_Handle(driver);
//		a.check_Box();
		a.addTOCart();
		a.proceedToBuy();
		System.out.println("Stop Amazon");
	}
	
	@Test(priority=1)
	public void FillingDetailsOperation() {
		facebookPage page = new facebookPage(driver);
		System.out.println("Start Facebook");
		page.google_Search("Facebook");
		page.google_Search_button();
		page.Link();
		page.createNewAccount();
		page.firstName("Rahul");
		page.surName("Mansarowar");
		page.gendre();
		page.email("selenium@gmail.com");
		page.password("12344321");
		System.out.println("Stop Facebook");
		
	}
	@AfterTest
	public void AfterTest(ITestResult r) {
		if (driver != null) {
            driver.quit();
        }
        boolean rv = r.isSuccess();
        System.out.println("Test Result: " + rv);
    }		
}
