package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectSearch.Test3_Page;
import ObjectSearch.Test4_Page;

public class Test4_Method {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	public void Test3() {
		Test3_Page tp3 = new Test3_Page(driver);
		tp3.UserName("Admin");
		tp3.PassWord("admin123");
		tp3.LogIn();
		System.out.println("LogOut");
	}
	@Test
	public void Test4() throws InterruptedException {
		Test3_Page tp3 = new Test3_Page(driver);
		tp3.UserName("Admin");
		tp3.PassWord("admin123");
		tp3.LogIn();
		System.out.println("LogOut");
		Test4_Page tp4 = new Test4_Page(driver);
		tp4.AdminPro();
		tp4.Qualification();
		tp4.Education();
		tp4.MyProfile();
		tp4.FirstName("Rahul");
		tp4.MiddleName("Rockyy");
		tp4.LastName("Romance");
		tp4.EmpID("Orange24");
		tp4.OtherId("4488");
		tp4.LicenceId("NYDFS2430");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
