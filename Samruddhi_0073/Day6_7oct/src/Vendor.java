import java.util.Arrays;

public class Vendor extends Person {

	private String vid;
	private double phoneNo;
	private Product product[];
	private static int vcount =0;
	public Vendor() {
		super();
	}
	public Vendor(String name,String email, double phoneNo, Product[] product) {
		super(name, email);
		vcount++;
		
		this.vid = "V"+vcount;
		this.phoneNo = phoneNo;
		this.product = product;
	}
	public String getVid() {
		return vid;
	}
	
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Product[] getProduct() {
		return product;
	}
	public void setProduct(Product[] product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", phoneNo=" + phoneNo + ", product=" + Arrays.toString(product) + ", vcount="
				+ vcount + "]";
	}
	
}
