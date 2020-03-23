//Test01_LambdaExpression.java

class Test01_LambdaExpression {

	//normal method
	public void m1() {
		System.out.println("Hello World!");
	}
	
	//method using lambda expression	
	()-> {System.out.println("Hello World!");}
	()-> System.out.println("Hello World!");

} //Test01_LambdaExpression {}

/* if the lambda expression have only one statement 
then the colly brashes are optional
*/