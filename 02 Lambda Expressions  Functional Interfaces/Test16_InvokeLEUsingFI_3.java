//Test16_InvokeLEUsingFI_3.java

interface Test16_Interface {
	public int getLength(String str);
}

class Test16_InvokeLEUsingFI_3 {

	public static void main(String[] args) {
		Test16_Interface i = str -> str.length();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("Without lambda"));
	}

} 

/*
Test16_Interface i = (String str) -> {return str.length();}
Test16_Interface i = (String str) -> return str.length();
Test16_Interface i = str -> return str.length();
Test16_Interface i = str -> str.length();
*/