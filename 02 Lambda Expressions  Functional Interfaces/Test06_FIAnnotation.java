//Test06_FIAnnotation.java

@FunctionalInterface
interface Test06_FIAnnotation {

	public void m1();

	default void m2() {
		System.out.println("Default method");
	}

	public static void m3() {
		
	}

}


@FunctionalInterface
interface Test06_FIAnnotation02 {

	public void m1();

	public void m2();

}
/* CE:
Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Test06_FIAnnotation02 is not a functional interface
    multiple non-overriding abstract methods found in 
	interface Test06_FIAnnotation02
*/


@FunctionalInterface
interface Test06_FIAnnotation03 {

}
/* CE:
Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  Test06_FIAnnotation03 is not a functional interface
    no abstract method found in interface Test06_FIAnnotation03
*/



/* To check that an interface is funtional interface
or not from java 1.8 version there is an annotation 
that is @FuncationalInterface
*/