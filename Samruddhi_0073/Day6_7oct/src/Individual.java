
public class Individual extends Customer{

	private double phoneNo;

	public Individual() {
		super();
	}

	public Individual(String name, String email, String creditClass ,double phoneNo) {
		super(name, email, creditClass);
		this.phoneNo = phoneNo;
	}

	public double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Individual [phoneNo=" + phoneNo + "]";
	}
	
}
