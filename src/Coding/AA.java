package Coding;

public class AA {

	public static int Factorial(int num) {
		int f=1;
		if(num==0) {
			return 1;
		}
		for(int i=num;i>=1;i--) {
			f*=i;
		}
		return f;
	}

	public static void main(String[] args) {
		
		System.out.println(Factorial(23));
		
	}

}
