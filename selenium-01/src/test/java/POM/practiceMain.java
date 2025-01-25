package POM;

public class practiceMain extends practice {
	
	protected String name;
	protected String course;
	protected int id;
	
	public practiceMain(String productName,String productId,String name,String course,int id) {
		super(productName,productId);
		this.name=name;
		this.course=course;
		this.id=id;
	}

	@Override
	public String getProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(name);
		System.out.println(course);
		System.out.println(id);
	}
	public static void main(String[] args) {
		practiceMain p = new practiceMain("afaf","afaf","wfwef","efae",42);
		p.displayDetails();
	}
}
