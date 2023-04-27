package Misc;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Constructor Default");
	}
	
	public ConstructorConcept(int a) {
		System.out.println("Constructor single param with a : " + a);
	} 
	
	public ConstructorConcept(int a, int b) {
		System.out.println("Constructor single param with a : " + a + " and b : " + b);
	}

	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(3);
		ConstructorConcept cc2 = new ConstructorConcept(2,6);

	}

}
