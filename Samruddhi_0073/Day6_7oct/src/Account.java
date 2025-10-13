
public class Account {
  
	private String accNum;
	private String fname;
	private String lname;
	private double MobNO;
	private String Email;
	private static int cnt = 1;
	
	

	public Account() {
		super();
	}
	public Account(String fname, String lname, double mobNO, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		MobNO = mobNO;
		Email = email;
	}
	
	
}
