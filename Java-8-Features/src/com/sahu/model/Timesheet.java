package com.sahu.model;

public class Timesheet {
	private Integer eno;
	private Integer dayas;

	public Timesheet(Integer eno, Integer dayas) {
		this.eno = eno;
		this.dayas = dayas;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public Integer getDayas() {
		return dayas;
	}

	public void setDayas(Integer dayas) {
		this.dayas = dayas;
	}
}
