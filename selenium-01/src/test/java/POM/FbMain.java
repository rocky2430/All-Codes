package POM;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMain {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		facebook fb = new facebook(driver);
		fb.username("Selenium@gmail.com");
		fb.passWord("1234554321");
		fb.CreatAccount();
		fb.firstName("Selenium");
		fb.lastName("WebDriver");
		fb.select_date();
		fb.selec();
		fb.select_month();
		fb.Month_Select();
		fb.select_year();
		fb.Year_Select();
		fb.male_Box();
		fb.mobileNo("9988776655");
		fb.passwod("1234554321");
		fb.SignButton();
		driver.close();
	}
}
