package OOPS;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		Car c = new Car();//object > new opertor, c is object reference variable
		Car a = new Car();
		Car b = new Car();
		
		System.out.println(a.mod=2);
		System.out.println(c.wheel=2233);
		System.out.println(b.mod=1);
		System.out.println(b.wheel=1222);
		System.out.println(a.mod=222);
		System.out.println(a.wheel=1112);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		
	}

}
