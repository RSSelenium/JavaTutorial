package OOPS;

public class WrapperClass {

	public static void main(String[] args) {
		String s = "100";
		System.out.println(10 + 2 + s+20);
		
		int i = Integer.parseInt(s);
		
		String a = "12.45";
		double d = Double.parseDouble(a);
		
		String c = "true";
		boolean b = Boolean.parseBoolean(c);
		System.out.println(b);
		
		int e = 12;
		String f = String.valueOf(e);
		char[] q = {'q', 'w', 'e', 'r', 't'};
		String m = String.valueOf(q);
		System.out.println(m);
		
		Object o = 'r';
		String k = String.valueOf(o);
		
		String w = "100e";
		//System.out.println(Integer.parseInt(w)); > number format exception
		
		
		
		
	}

}
