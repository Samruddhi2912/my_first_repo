import java.util.Arrays;

public class Company extends Customer{
  
	private String relManager;
	private double creditLine;
	private double [] listOfNo;
	public Company() {
		super();
	}
	public Company(String name, String email, String creditClass, String relManager, double creditLine, double[] listOfNo) {
		super(name, email, creditClass);
		this.relManager = relManager;
		this.creditLine = creditLine;
		this.listOfNo = listOfNo;
	}
	public String getRelManager() {
		return relManager;
	}
	public void setRelManager(String relManager) {
		this.relManager = relManager;
	}
	public double getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	public double[] getListOfNo() {
		return listOfNo;
	}
	public void setListOfNo(double[] listOfNo) {
		this.listOfNo = listOfNo;
	}
	@Override
	public String toString() {
		return "Company [relManager=" + relManager + ", creditLine=" + creditLine + ", listOfNo="
				+ Arrays.toString(listOfNo) + "]";
	}
	
	
}
