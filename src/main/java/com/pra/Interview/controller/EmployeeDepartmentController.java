package com.pra.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pra.Interview.enity.Employee;
import com.pra.Interview.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/")
public class EmployeeDepartmentController {

	@Autowired
	EmployeeService service;

	@GetMapping("/employee")
	public ResponseEntity<List<Employee>>  getAllEmployee() {

		return ResponseEntity.status(HttpStatus.OK).body(service.getAllEmployee());

	}

	@GetMapping("/employee/{dept}")
	public List<Employee> getEmployeesByDepartmnent(@PathParam(value = "dept") String dept) {

		return service.getAllEmployeesByDepartment(dept);

	}

}
