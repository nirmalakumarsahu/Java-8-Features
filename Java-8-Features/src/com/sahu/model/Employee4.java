package com.sahu.model;

public class Employee4 {
	private Integer eno;
	private String name;
	private Double dailyWage;

	public Employee4(Integer eno, String name, Double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(Double dailyWage) {
		this.dailyWage = dailyWage;
	}
}