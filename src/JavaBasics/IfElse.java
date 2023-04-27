package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
			int a=10;
			int b=20;
			if(b>a) {
				System.out.println("b is greater than a");
			}
			else {
				System.out.println("b is less than a");
			}

			int c=40;
			int d=20;
			if(c==d) {
				System.out.println("c is equal to d");
			}
			else {
				System.out.println("c not equal to d");
			}
			
			int a1=1000;
			int a2=2000;
			int a3=300;
			if(a1>a2 && a1>a3) {
				System.out.println("a1 is the greatest");
			}
			else if(a2>a3) {
				System.out.println("a2 is the greatest");
			}
			else {
				System.out.println("a3 is the greatest");
			}
			
		

	}

}
