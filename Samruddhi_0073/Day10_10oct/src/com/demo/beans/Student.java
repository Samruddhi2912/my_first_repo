package com.demo.beans;

import java.time.LocalDate;

public class Student {
     private int id ;
     private String name;
     private int m1;
     private int m2;
     private LocalDate bdate;
	public Student() {
		super();
	}
	public Student(int id, String name, int m1, int m2, LocalDate bdate) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.bdate = bdate;
	}
	public Student(int id2) {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", bdate=" + bdate + "]";
	}
     
     
}
