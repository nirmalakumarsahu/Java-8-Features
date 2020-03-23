//Test07_FunctionEmployeeIncSalary.java

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	double salary;
	Employee(String ename, double salary) {
		this.ename=ename;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return ename+" : "+salary; 
	}
}

class Test07_FunctionEmployeeIncSalary {

	public static void main(String[] args) {
		ArrayList<Employee> al1 = new ArrayList<>();
		populate(al1);
		System.out.println("Before Increment");
		System.out.println(al1);
		Predicate<Employee> p = e -> e.salary<3500;
		Function<Employee, Employee> f = emp -> {
			emp.salary=emp.salary+477;
			return emp;
		};
		ArrayList<Employee> al2 = new ArrayList<>();
		for (Employee e:al1) {
			if (p.test(e)) {
				f.apply(e);
				al2.add(e);
			}
		}
		System.out.println("After Increment");
		System.out.println(al2);
	}

	public static void populate(ArrayList<Employee> al) {
		al.add(new Employee("Sunny", 2000));	
		al.add(new Employee("Bunny", 3000));	
		al.add(new Employee("Munny", 2500));	
		al.add(new Employee("Chunny", 2500));	
		al.add(new Employee("Kunny", 3500));	
	}
}
