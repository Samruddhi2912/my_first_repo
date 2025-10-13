package com.demo.dao;

import java.util.*;

import com.demo.beans.Customer;
import com.demo.beans.Items;


public class OrderDaoImpl implements OrderDao {
     
 static Map<Customer, List<Items>> hm;
 static {
	   hm = new HashMap<>();
	   Customer c1=new Customer(10,"Sushrut","33333");
	   List<Items> lst=new ArrayList<>();
	   lst.add(new Items(1001,"Chair",34,5678));
	   lst.add(new Items(1002,"Table",30,7678));
	   hm.put(c1, lst);
	   Customer c2=new Customer(11,"Pranav","4444");
	   List<Items> lst1=new ArrayList<>();
	   lst1.add(new Items(1001,"Shelf",40,2678));
	   lst1.add(new Items(1002,"drawer",20,5678));
	   hm.put(c2, lst1);
 }
		@Override
		public boolean save(Customer c, List<Items> lst) {
			if(!hm.containsKey(c)){
				hm.put(c, lst);
				return true;
			}
			return false;
		}
		@Override
		public Map<Customer, List<Items>> show() {
			return hm;
		}
}