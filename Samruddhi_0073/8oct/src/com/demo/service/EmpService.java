package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpService {

	boolean addEmp();

	List<Employee> displayAll();

	Employee searchById(int eid);

	List<Employee> searchByName(String nm);

	boolean updateSal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	List<Employee> findBySal(double sal);

}
