package com.demo.dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.beans.Student;


public class StudentDaoImpl implements StudentDao {

 static Set<Student> sSet;
 static{
	 sSet=new HashSet<>();
 sSet.add(new Student(101,"Amit",94, 90,LocalDate.of(2001,07,11)));
 sSet.add(new Student(102,"abc",44,68,LocalDate.of(2003, 02, 10)));
 sSet.add(new Student(103,"xyz",57,38,LocalDate.of(2003, 12, 01)));
 sSet.add(new Student(104,"abc",67,88,LocalDate.of(2003, 11, 11)));
 sSet.add(new Student(105,"pqr",57,80,LocalDate.of(2003, 03, 10)));
 sSet.add(new Student(106,"pqrs",77,88,LocalDate.of(2002,07,10)));
	
 }
	@Override
	public boolean save(Student s) {
		return sSet.add(s);	
	}
	@Override
	public Set<Student> findAll() {
		return sSet;
	}
	@Override
	public Student findById(int id) {
Optional <Student> s= sSet.stream().filter(stud->stud.getId()==id).findFirst();
		if(s!=null)
		return s.get();
		return null;
	}
	@Override
	public Set<Student> findByName(String name) {
	Set<Student> stSet=sSet.stream().filter(stud->stud.getName().equals(name))
				.collect(Collectors.toSet());
		if(stSet.size()>0)
		return stSet;
		else
		return null;
		
	}
	@Override
	public boolean changeMarks(int id ,int marks) {
		Student s =findById(id);
		if(s!=null)
	   s.setM1(marks);
		return true;
	}
	@Override
	public boolean removeById(int id) {
		return sSet.remove(new Student(id));
		 
	}
	@Override
	public boolean removeByMarks(int marks) {
   sSet.removeIf(s->s.getM1()<marks);
		return true;
	}
	@Override
	public Set<Student> findAllByMarks(int marks) {
	Set <Student> studset = sSet.stream()
			                .filter(stud->stud.getM1()>marks)
			                .collect(Collectors.toSet());
	   if(studset.size()>0)	                        
		return studset;
	return null;
	}
	@Override
	public List<Student> sortByMarks() {
		
		return null;
	}

}
