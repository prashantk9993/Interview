package com.pra.Interview.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pra.Interview.enity.Department;

@Repository
public interface DepartmentRepositiory extends JpaRepository<Department, Long>{

}
