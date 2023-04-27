package OOPS;

public class MethodOverloading {
	public void sum() {
		System.out.println("no parameter");
		
	}

	public void sum(int i) {
		System.out.println(" 1 parameter " + i);
	}

	public void sum(int j, int k) {
		System.out.println(" 2 parameter " + k + " " + j);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.sum(2,3);
		
		
		
	}
	
	public void main(String s) {
		
	}

}
