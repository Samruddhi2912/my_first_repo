package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface OrderService {

	boolean addNewCustomer();
    
	Map<Customer, List<Items>> displayAll();

}
