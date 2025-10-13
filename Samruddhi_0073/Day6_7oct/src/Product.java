
public class Product {

private static int pcount=0;
private String pid;
private String pname;
private float price;
public Product() {
	super();
}
public Product( String pname, float price) {
	super();
	pcount++;
	
	this.pid = "P"+pcount;
	this.pname = pname;
	this.price = price;
}
public static int getPcount() {
	return pcount;
}
public static void setPcount(int pcount) {
	Product.pcount = pcount;
}
public String getId() {
	return pid;
}

public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

}
