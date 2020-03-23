//Test09_EmployeeManagement.java

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.city=city;
	}

	@Override
	public String toString() {
		return String.format("Emp(%s, %s, %.2f, %s)",name, designation, salary, city);
	}
}


class Test09_EmployeeManagement {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		populate(al);
		Predicate<Employee> p1 = emp -> emp.designation.equalsIgnoreCase("Manager");
		System.out.println("Manager Information : ");
		display(p1, al);
		Predicate<Employee> p2 = emp -> emp.city.equalsIgnoreCase("Bangalore");
		System.out.println("Bangalore Employee Information : ");
		display(p2, al);
		Predicate<Employee> p3 = emp -> emp.salary<20000;
		System.out.println("Employee Information whose salary < 20000 : ");
		display(p3, al);
		System.out.println("All Manager information from Bangalore Location : ");
		display(p1.and(p2), al);
		System.out.println("All Employee information who are manager or salary<20000 : ");
		display(p1.or(p3), al);
		System.out.println("All Employee information who are not manager : ");
		display(p1.negate(), al);
	}

	public static void populate(ArrayList<Employee> al) {
		al.add(new Employee("Nimu", "CEO", 30000, "hyderabad"));
		al.add(new Employee("Pabi", "manager", 20000, "bangalore"));
		al.add(new Employee("Papu", "manager", 20000, "pune"));
		al.add(new Employee("Siba", "clerk", 15000, "hyderabad"));
		al.add(new Employee("sammer", "clerk", 15000, "delhi"));
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> al) {
		System.out.println("----------------------------------------------------");
		for (Employee e:al) {
			if(p.test(e))
				System.out.println(e);
		}
		System.out.println("----------------------------------------------------");
		System.out.println();
	}

}

