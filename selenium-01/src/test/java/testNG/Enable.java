package testNG;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled=false)
	public void testMethod() {
		System.out.println("Enable");
	}
}
