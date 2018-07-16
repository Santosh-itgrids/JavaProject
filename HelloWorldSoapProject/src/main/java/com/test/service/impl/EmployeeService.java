package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.test.dto.AddressVO;
import com.test.dto.Employee;
import com.test.service.IEmployeeService;

@WebService
public class EmployeeService implements IEmployeeService {

	public Employee getEmployeeById(Long empId) {
		System.out.println("inside getEmployeeById() of EmployeeService");
		return new Employee(empId, "Santosh Kumar Verma", "7416308674", getAddress());
	}

	public List<Employee> getAllEmployee() {
		System.out.println("inside findAll() of EmployeeService ");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101l, "Santosh Kumar Verma", "7416308674", getAddress()));
		empList.add(new Employee(103l, "Sumit Kumar Verma", "7416308674", getAddress()));
		empList.add(new Employee(102l, "Ganesh Kumar Verma", "7416308674", getAddress()));
		return empList;
	}
    public AddressVO getAddress() {
    	 AddressVO addressVO = new AddressVO();
    	 addressVO.setStateId(1l);
    	 addressVO.setStateName("AP");
    	 addressVO.setDistrictId(101l);
    	 addressVO.setDistrictName("Chittor");
    	 return addressVO;
    }
}
