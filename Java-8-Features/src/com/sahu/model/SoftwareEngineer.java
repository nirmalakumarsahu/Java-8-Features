package com.sahu.model;

public class SoftwareEngineer {
	private String name;
	private Integer age;
	private Boolean isHavingGF;

	public SoftwareEngineer(String name, Integer age, Boolean isHavingGF) {
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsHavingGF() {
		return isHavingGF;
	}

	public void setIsHavingGF(Boolean isHavingGF) {
		this.isHavingGF = isHavingGF;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}

}
