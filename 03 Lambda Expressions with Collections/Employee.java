//Employee.java

class Employee {
	
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno=eno;
		this.ename=ename;
	}

	@Override
	public String toString() {
		return eno+" : "+ename;
	}

}
