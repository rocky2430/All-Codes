package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice {

	@Test
	public void script() {
		System.out.println("Hello testNG");
		Reporter.log("Hello tesxtNG");
		Reporter.log("HELLOW TEXTNG",true);
	}
	
	
}
