package com.demo.test;

import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Items;
import com.demo.service.*;
import java.util.*;

public class TestOrderManageSystem {
	
 public static void main(String[] args) {
	 
	OrderService oservice = new OrderServiceImpl();
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
		System.out.println("1. add new customer\n2. display all\n3. display by customer");
		System.out.println("4. delete customer\n5. add a new item in existing order");
		System.out.println("6. delete item from existing order\n7.exit\n choice:");
		choice = sc.nextInt();
		switch(choice) {
		
		case 1->{
			//add new customer
			boolean status = oservice.addNewCustomer();
			if(status) {
				System.out.println("Added successfully");
			}
			else {
				System.out.println("Not added");
			}
		}
		case 2->{
		Map<Customer, List<Items>> omap= oservice.displayAll();
		Set <Customer> keys= omap.keySet();
		keys.forEach(c->System.out.println(c +"...."+omap.get(c)));
		}
		case 3->{
			//display by customer
			System.out.println("enter customer id");
			int cid =sc.nextInt();
			Map.entry<Customer, List<Items>> data = oservice.displayByCustomer(cid);
		}
		case 4->{
		}
		case 5->{
		}
		case 6->{
		}
		case 7->{
			System.out.println("Thank you");
		}
		default ->{
			System.out.println("Invalid");
		}
		}
	}while(choice!=7);
	
	}
	
}
