package POM;

import org.testng.annotations.*;

public class TestNGAnnotations {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Executed before the test suite.");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("Executed after the test suite.");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Executed before tests");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("Executed after tests");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Executed before the first method in the class.");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("Executed after the last method in the class.");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Executed before every test method.");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Executed after every test method.");
	    }

	    @Test
	    public void testMethod1() {
	        System.out.println("This is Test Method 1.");
	    }

	    @Test
	    public void testMethod2() {
	        System.out.println("This is Test Method 2.");
	    }
	    
}
