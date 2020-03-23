//Test06_FunctionEmployeeSalary.java

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
	String ename;
	double salary;
	Employee(String ename, double salary) {
		this.ename=ename;
		this.salary=salary;
	}
	public String toString() {
		return ename+" : "+salary; 
	}
}

class Test06_FunctionEmployeeSalary {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		populate(al);
		Function<ArrayList<Employee>, Double> f = emp -> {
			double total=0;
			for (Employee e:al) {
				total=total+e.salary;
			}
			return total;
		};
		System.out.println("The total salary is : "+f.apply(al));
	}

	public static void populate(ArrayList<Employee> al) {
		al.add(new Employee("Sunny", 20000));	
		al.add(new Employee("Bunny", 30000));	
		al.add(new Employee("Munny", 25000));	
		al.add(new Employee("Chunny", 25000));	
		al.add(new Employee("Kunny", 35000));	
	}
}
