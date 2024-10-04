package com.pra.Interview.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pra.Interview.enity.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

	public List<Employee> findEmployeesByDepartmentName(String name);

}
