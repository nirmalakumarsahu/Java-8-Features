//Test04_BiFunctionCalMothlySal.java

import java.util.function.BiFunction;

class Employee {
	int eno;
	String ename;
	double dailywage;

	Employee(int eno, String ename, double dailywage) {
		this.eno=eno;
		this.ename=ename;
		this.dailywage=dailywage;
	}
}

class TimeSheet {
	int eno;
	int days;
	TimeSheet(int eno, int days) {
		this.eno=eno;
		this.days=days;
	}
}

class Test04_BiFunctionCalMothlySal {

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailywage*t.days;
		Employee e = new Employee(101, "Nimu", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		System.out.println("Mothly salary : "+f.apply(e, t));
	}
}
