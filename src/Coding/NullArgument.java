package Coding;

public class NullArgument {
	
	public static void test(Object obj) {
		System.out.println("Object argument");
	}
	public static void test(String str) {
		System.out.println("String argument");
	}


	public static void main(String[] args) {
		test(null);

	}

}
