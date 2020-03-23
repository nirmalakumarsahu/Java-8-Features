//Test08_FIWithInheritance02.java

/* Case #2 :
------------
In child interface, we can define exactly same parent
interface abstract method
*/

@FunctionalInterface
interface Test08_FIWithInheritance02 {
	public void m1();
}


@FunctionalInterface
interface Test08 extends Test08_FIWithInheritance02 {
	public void m1();
}

