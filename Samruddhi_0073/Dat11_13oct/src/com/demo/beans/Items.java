package com.demo.beans;

public class Items {
   private int itemid;
   private String iname;
   private int qty;
   private double price;
public Items() {
	super();
}
public Items(int itemid, String iname, int qty, double price) {
	super();
	this.itemid = itemid;
	this.iname = iname;
	this.qty = qty;
	this.price = price;
}
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Items [itemid=" + itemid + ", iname=" + iname + ", qty=" + qty + ", price=" + price + "]";
}
   
}
