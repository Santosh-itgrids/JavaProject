package com.test.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.test.dto.Employee;

@WebService
public interface IEmployeeService {

	@WebMethod
	Employee getEmployeeById(Long empId);
	@WebMethod 
	List<Employee> getAllEmployee();
} 
