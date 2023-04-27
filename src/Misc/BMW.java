package Misc;

public class BMW extends Car {
	//static methods cannot be overridemm
	@Override
	public void start() {
		System.out.println("overloaded method -- BMW sTart");
	}

	public static void main(String[] args) {
		

	}

}
