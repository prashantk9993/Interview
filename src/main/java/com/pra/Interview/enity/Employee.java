package com.pra.Interview.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private long salary;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Department department;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	

	public Employee(String name, long salary, Department department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	

}
