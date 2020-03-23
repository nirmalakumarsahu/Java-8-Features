//Test09_FIWithInheritance03.java

/* Case #3 :
------------
In child interface, we can't define any new abstract
methods otherwise we will get CE.
*/

@FunctionalInterface
interface Test09_FIWithInheritance03 {
	public void m1();
}


@FunctionalInterface
interface Test09 extends Test09_FIWithInheritance03 {
	public void m2();
}

// here the super class abstract method is also available

/* CE:
Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Test09 is not a functional interface
    multiple non-overriding abstract methods 
	found in interface Test09
*/