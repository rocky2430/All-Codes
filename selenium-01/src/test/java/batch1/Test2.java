package batch1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeTest
	public void before() {
		System.out.println("Before The Test");
	}
	@Test(groups= {"Sanity","Smoke"})
	    public void test2() {
	        System.out.println("Smoke And Sanity Testing");
	    }
}
