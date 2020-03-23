//Test06_BiConsumer_BiFunctionIncEmpSal.java

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.ArrayList;

class Employee {
	String name;
	double salary;

	Employee(String ename, double salary) {
		this.name=name;
		this.salary=salary;
	}
}

class Test06_BiConsumer_BiFunctionIncEmpSal {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);
		al.add(f.apply("nimu", 1000.0));
		al.add(f.apply("pabi", 2000.0));
		al.add(f.apply("papu", 3000.0));
		al.add(f.apply("siba", 4000.0));
		al.add(f.apply("muna", 5000.0));
		al.add(f.apply("sameer", 6000.0)); 

		BiConsumer<Employee, Double> c = (e, increment) -> e.salary=e.salary+increment;
		for (Employee e:al) {
			c.accept(e, 500.0);
		}
		for (Employee e:al) {
			System.out.println("Name: "+e.name);		
			System.out.println("Salary: "+e.salary);		
			System.out.println();		
		}
	}

}
