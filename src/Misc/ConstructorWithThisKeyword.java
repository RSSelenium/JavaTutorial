package Misc;

public class ConstructorWithThisKeyword {
	String name;
	int age;


	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}


	public static void main(String[] args) {
		
		ConstructorWithThisKeyword cc = new ConstructorWithThisKeyword("Tom", 20);

	}

}
