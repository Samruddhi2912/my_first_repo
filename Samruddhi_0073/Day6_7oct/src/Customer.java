
public class Customer extends Person {

	private static int ccount=0;
	private String cid;
	private static float discount=10;
	private String creditClass;
	public Customer() {
		super();
	}
	public Customer(String name, String email, String creditClass) {
		super(name , email);
		ccount++;
		this.cid = "C"+ccount;
		this.creditClass = creditClass;
	}
	public static int getCcount() {
		return ccount;
	}
	public static void setCcount(int ccount) {
		Customer.ccount = ccount;
	}
	public String getCid() {
		return cid;
	}
	public static float getDiscount() {
		return discount;
	}
	public static void setDiscount(float discount) {
		Customer.discount = discount;
	}
	public String getCreditClass() {
		return creditClass;
	}
	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", creditClass=" + creditClass + "]";
	}
	
}
