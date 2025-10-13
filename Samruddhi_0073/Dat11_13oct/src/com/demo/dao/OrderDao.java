package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface OrderDao {

	boolean save(Customer c, List<Items> lst);

	Map<Customer, List<Items>> show();

}
