package Coding;

public class Factorial {
	//fact=3*2*1
	public static int fact(int num) {
		int f=1;
		if(num==0) {
			return 1;
		}
		for(int i=num; i>0; i--) {
			f*=i;
		}
		
		//System.out.println(f);
		return f;
		
	}

	public static void main(String[] args) {
		System.out.println(fact(6));
		
		
		
		

	}

}
