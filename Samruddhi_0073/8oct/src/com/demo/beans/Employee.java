package com.demo.beans;

import java.time.LocalDate;

public class Employee {
  private int eid;
  private String name;
  private double sal;
  private LocalDate jdt;
public Employee() {
	super();
}
public Employee(int eid)
{  this.eid = eid ;
	}
public Employee(int eid, String name, double sal, LocalDate jdt) {
	super();
	this.eid = eid;
	this.name = name;
	this.sal = sal;
	this.jdt = jdt;
}

public boolean equals(Object obj) {
	return this.eid==((Employee)obj).eid;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public LocalDate getJdt() {
	return jdt;
}
public void setJdt(LocalDate jdt) {
	this.jdt = jdt;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", jdt=" + jdt + "]";
}
}
