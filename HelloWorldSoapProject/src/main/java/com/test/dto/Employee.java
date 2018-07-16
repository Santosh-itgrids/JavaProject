package com.test.dto;

import java.io.Serializable;

public class Employee implements Serializable{

	private Long empId;
	private String empName;
	private String mobileNo;
	private AddressVO addressVO;
	
	
	public Employee(Long empId, String empName, String mobileNo, AddressVO addressVO) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.addressVO = addressVO;
	}

	public Employee() {
		super();
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public AddressVO getAddressVO() {
		return addressVO;
	}
	public void setAddressVO(AddressVO addressVO) {
		this.addressVO = addressVO;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + "]";
	}
	
}
