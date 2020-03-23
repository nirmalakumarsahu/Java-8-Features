//Test07_FIWithInheritance01.java

/* Case #1 :
------------
If an interface extends Funcational interface and child 
interface does not contain any abstract method, then child
interface is always Functional interface.
*/

@FunctionalInterface
interface Test07_FIWithInheritance01 {
	public void m1();
}


@FunctionalInterface
interface Test07 extends Test07_FIWithInheritance01 {

}

