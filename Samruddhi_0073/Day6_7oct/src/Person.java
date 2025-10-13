
public class Person {
	
	private String name;
	private String email;
	public Person() {
		super();
	}
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

}








//Design a class hierarchy to maintain information for ABCTel  telecom company , company 
//wants to maintain information of customers and vendors. 
//For vendors they want to store vendorid, name, email, phone number,list of products they 
//supply 
//For customers they want to store custid, name, email,  credit class(based on credit 
//history), discounts, plan assigned to customer 
//Customer may be Individual or a company 
//For individual customer, system should store phone number   
//For a customer of type Company, system should store info about  relationship manager, 
//credit line, extensions, list of numbers 