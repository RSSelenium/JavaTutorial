package Misc;

public class B extends A {
	public B() {
		super(10, 3);
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		B b = new B();
	}

}
