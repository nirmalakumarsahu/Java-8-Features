//Test08_PredicateSWEngAllow.java

import java.util.function.Predicate;
import java.util.ArrayList;

class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGF;

	SoftwareEngineer(String name, int age, boolean isHavingGF) {
		this.name=name; 
		this.age=age; 
		this.isHavingGF=isHavingGF;
	}

	@Override
	public String toString() {
		return name;
	}
}


class Test08_PredicateSWEngAllow {
	
	public static void main(String[] args){

		SoftwareEngineer[] list = { new SoftwareEngineer("nimu", 21, false),
						          new SoftwareEngineer("siba", 25, true),
			                      new SoftwareEngineer("pabi", 26, true),
			                      new SoftwareEngineer("papu", 18, false),
			                      new SoftwareEngineer("sameer", 19, true)
								};
		Predicate<SoftwareEngineer> allowed = se -> se.age>=18 && se.isHavingGF==true;
		ArrayList<SoftwareEngineer> al = new ArrayList<>();
		System.out.print("Allowed Software Engineers are : ");
		for (SoftwareEngineer se : list) {
			if(allowed.test(se)) {
				al.add(se);
			}  
		}
		System.out.println(al);
	}

}
