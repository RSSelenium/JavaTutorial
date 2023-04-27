package Coding;
//covering egde cases first
public class PrimeNumber {
	
		public static boolean ifPrime(int num) {
			if(num<=1) {
				return false;
			}
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		
		public static void getPrimeCount(int num) {
			for(int i=2;i<=num; i++) {
				if(ifPrime(i)) {// checks if number is prime, here we are checking 'i' numbers
					System.out.println(i+ " ");
				}
			}
		}
		
	
	

	public static void main(String[] args) {
		System.out.println(ifPrime(87));
		getPrimeCount(22);
		

	}

}
