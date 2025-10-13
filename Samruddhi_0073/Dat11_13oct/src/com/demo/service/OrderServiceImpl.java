package com.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;
import com.demo.beans.*;

public class OrderServiceImpl implements OrderService  {
	private OrderDao odao;
	
	public OrderServiceImpl() {
		odao = new OrderDaoImpl();
	}
    
	@Override
	public boolean addNewCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int cid = sc.nextInt();
		System.out.println("Enter name");
		String cname = sc.next();
		System.out.println("enter mobile number");
		String mob = sc.next();
		
		Customer c = new Customer(cid, cname, mob);
		//accept list of items
		List <Items> lst =new ArrayList<>();
		String ans;
		do {
		System.out.println("Enter item id");
		int iid = sc.nextInt();
		System.out.println("Enter item name");
		String iname = sc.next();
		System.out.println("Enter quantity");
		int qty = sc.nextInt();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		Items item = new Items(iid,iname,qty,price);
		lst.add(item);
		System.out.println("Do you want to add more items(y/n)");
	    ans = sc.next();
		}while(!ans.equals("n"));
		
		return odao.save(c,lst);
	}

	@Override
	public Map<Customer, List<Items>> displayAll() {
		return odao.show();
		
	}

}
