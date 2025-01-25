package ObjectSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void seachgoogle(String searchInput) {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(searchInput);
		
	}
}
