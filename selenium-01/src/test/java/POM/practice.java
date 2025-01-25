package POM;

import org.testng.annotations.Test;

public abstract class practice {

	protected String productName;
	protected String productId;
	
	public practice(String productName,String productId) {
		this.productName=productName;
		this.productId=productId;
	}
	public abstract String getProductId();

	public abstract String getProductName();
	
	public void displayDetails() {
		System.out.println("Product Name "+getProductName());
		System.out.println("Product Id "+getProductId());
	}
	
}