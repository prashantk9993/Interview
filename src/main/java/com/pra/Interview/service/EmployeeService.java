package com.pra.Interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pra.Interview.enity.Employee;
import com.pra.Interview.repositiry.EmployeeRespository;

@Service
public class EmployeeService {

	//@Autowired
	//private   EmployeeRespository repo;
	
	private final  EmployeeRespository repo;
	
	@Autowired
	public EmployeeService(EmployeeRespository repo) {
		this.repo=repo;
	}

	public List<Employee> getAllEmployee() {

		 List<Employee> lst = repo.findAll();
		 System.out.println(lst.size()+"====================="+lst);
		 return lst;
	}

	public List<Employee> getAllEmployeesByDepartment(String dept) {

		return repo.findEmployeesByDepartmentName("IT");
	}

}
