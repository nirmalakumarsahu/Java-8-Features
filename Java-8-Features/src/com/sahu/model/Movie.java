package com.sahu.model;

public class Movie {

	private String name;
	private String result;
	
	public Movie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
