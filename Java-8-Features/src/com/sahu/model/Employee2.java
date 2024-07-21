package com.sahu.model;

public class Employee2 {
	private Integer empNo;
	private String ename;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee2(Integer empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return empNo + " : " + ename;
	}

}
