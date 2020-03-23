//Test11_ObjDoubleConsumer.java

import java.util.function.ObjDoubleConsumer;
import java.util.ArrayList;

class Employee {
	String name;
	double salary;
	Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
}

class Test11_ObjDoubleConsumer {

	public static void main(String[] args) {
		ArrayList<Employee>	al = new ArrayList<>();
		populate(al);
		ObjDoubleConsumer<Employee> c = (e, d) -> e.salary=e.salary+d;
		for (Employee e:al) {
			c.accept(e, 500.0);
		}
		for (Employee e:al) {
			System.out.println("Employee Name : "+e.name);
			System.out.println("Employee Salary : "+e.salary);
			System.out.println();
		}
	}

	public  static void populate(ArrayList<Employee> al) {
		al.add(new Employee("Nimu", 1000));
		al.add(new Employee("Sunny", 2000));
		al.add(new Employee("Bunny", 3000));
		al.add(new Employee("Chinny", 4000));
	}
}
