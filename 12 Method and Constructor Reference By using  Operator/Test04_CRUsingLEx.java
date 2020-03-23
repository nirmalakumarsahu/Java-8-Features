//Test04_CRUsingLEx.java

class Sample {
	Sample() {
		System.out.println("Sample Constructor Executed and object created");
	}
}

@FunctionalInterface
interface Test04_Interface {
	public Sample getObj();
}

class Test04_CRUsingLEx {

	public static void main(String[] args) {
		Test04_Interface i = () -> {
			Sample s = new Sample();
			return s;
		};
		Sample s = i.getObj();
	}
}
