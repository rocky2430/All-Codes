package testNG;

import org.testng.annotations.Test;

public class dependOnMethod {

	@Test
	public void creatAc() {
		System.out.println("Creat Account");
	}
	@Test(dependsOnMethods="creatAc")
	public void EditAc() {
		System.out.println("Edit Account");
	}
	
}
