package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMain {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		flipkart f = new flipkart(driver);
		f.google_Search_Box("Flipkart");
		f.google_search_button();
		f.flipkart_Link();
		f.flipkat_Search_Box("realme 12 pro");
		f.flipkart_Search_Button();
		f.mobileName();
		f.WindowHandling(driver);
		f.AddCart();
		f.CheckBox1();
		f.CheckBox2();
		f.placeOrder();
		
		
	}
}
