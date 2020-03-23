//Test10_FIWithInheritance04.java

/* Case #4 :
------------
In child interface, we can define any new abstract
methods when the child class not assign with the 
annotation @FunctionalInterface
*/

@FunctionalInterface
interface Test10_FIWithInheritance04 {
	public void m1();
}

interface Test09 extends Test10_FIWithInheritance04 {
	public void m2();
}
