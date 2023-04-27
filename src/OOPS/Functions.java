package OOPS;

public class Functions {

	public void test() {
		System.out.println("test method");
	}

	public int par() {
		System.out.println("par method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;

	}

	public int division(int x, int y) {
		System.out.println("division method");
		int d=x/y;
		return d;

	}

	public static void main(String[] args) {
		Functions f = new Functions();
		System.out.println(f.par());
		System.out.println(f.qa());
		System.out.println(f.division(40,2));

	} 

}
