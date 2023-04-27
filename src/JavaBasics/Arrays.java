package JavaBasics;

class Arr{
	
	static int a=5;
	public static int increment() {
		a=a+1;
		return a;
	}
	
	public static void doThis() {
		System.out.println("this is a method");	
	}
}

public class Arrays extends Arr {
	
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int[3];
		b[0]=21;
		//System.out.println(a[10]);
		System.out.println(b.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		char[] c = {'a', 'b', 'c'};
		
		Object[] ob = new Object[4];
		ob[0]='e';
		ob[1]="rtsing";
		ob[2]=12;
		ob[3]=2.22;
		System.out.println(ob.length);
		
		doThis();
		increment();
		
		String[][] r = new String[2][2];
		System.out.println(r.length);
		System.out.println(r[0].length);
		System.out.println(r[1][1]);
		
		for(int row=0; row<r.length; row++) {
			for(int col=0; col<r[0].length; col++) {
				System.out.println(r[row][col]);
			}
		}
		
	}

}
