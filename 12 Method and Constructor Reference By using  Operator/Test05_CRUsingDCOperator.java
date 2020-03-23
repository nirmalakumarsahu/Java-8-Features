//Test05_CRUsingDCOperator.java

class Sample {
	Sample() {
		System.out.println("Sample Constructor Executed and object created");
	}
}

@FunctionalInterface
interface Test05_Interface {
	public Sample getObj();
}

class Test05_CRUsingDCOperator {

	public static void main(String[] args) {
		Test05_Interface i = Sample::new;
		Sample s = i.getObj();
	}
}
