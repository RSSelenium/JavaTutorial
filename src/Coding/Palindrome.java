package Coding;

public class Palindrome { // always write a function & call that function in main method
	
	
	public static void palindromeNum(int num) {
		System.out.println("given number is : " + num);
		int r=0;
		int sum=0;
		int t;
		t=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
	
	public static void stringRev(String str) {
		String rev=null;
		
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	

	public static void main(String[] args) {
		palindromeNum(4554);
		palindromeNum(4454);
		palindromeNum(11);
		palindromeNum(0);
		stringRev("Rushali");

	}

}
