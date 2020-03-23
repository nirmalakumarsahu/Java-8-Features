//Test02_LambdaExpression.java

class Test02_LambdaExpression {

	//normal method
	public void m1(int a, int b) {
		System.out.println(a+b);
	}
	
	//method using lambda expression	
	(int a, int b)-> {System.out.println(a+b);}
	(int a, int b)-> System.out.println(a+b);
	(a, b)-> System.out.println(a+b);

} //Test02_LambdaExpression {}

/*if compiler guess what is the type based on the 
context automatically that is called as type inference
*/