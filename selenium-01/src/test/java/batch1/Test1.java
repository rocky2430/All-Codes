package batch1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test1 {

	@Test
	public void createAc() {
		System.out.println("Account Created");
		
	}
	
	@Test(dependsOnMethods="createAc")
	public void transactionWorking() {
		System.out.println("Transaction Is Working");
		Assert.fail();
	}
	
	@Test(dependsOnMethods={"createAc","transactionWorking"})
	public void CcancelTransaction() {
		System.out.println("Transaction Cancel");
	}
}
