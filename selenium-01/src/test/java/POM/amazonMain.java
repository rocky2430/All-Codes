package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=amazon&oq=amazon");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		amazon a = new amazon(driver);
		a.linkButton();
		a.textbox("realme 12 Pro 5G");
		a.Searchbutton();
		a.PhoneName();
		a.WindowHandle(driver);
		a.checkbox();
		a.AddtoCart();
		a.proceedtobuy();
		a.acCreat();
		a.Name("Rahul");
		a.MoNo("123454321");
		a.pass("12344321");
	}
}
