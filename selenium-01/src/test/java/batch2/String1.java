package batch2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class String1 {

	
	@Test(invocationCount=5,dataProvider="LogInputData")
	public void test(String name,String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.close();
	}
	
	@DataProvider(name="LogInputData")
	public Object[][] credintialData() {
		Object[][] data = new Object[3][2];    // 5 Row And 2 Coloumn
		
		data[0][0]="Admin";
		data[0][1]="manager";
		
		data[1][0]="Rahul";
		data[1][1]="Mansarowar";
		
		data[2][0]="Facebook";
		data[2][1]="Password";
		
		return data;
		
	}
}
