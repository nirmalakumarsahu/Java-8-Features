//Test03_LambdaExpression.java

class Test03_LambdaExpression {
	
	//normal method
	public int m1(String str) {
		return str.length();
	}
	
	//method using lambda expression
	(String str)-> {return str.length();}
	(String str)-> return str.length();
	(str)-> return str.length();
	(str)-> str.length();
	str -> str.length();

} //Test03_LambdaExpression {}

/* if your method have only one parameter then the 
parathensis is optional
*/