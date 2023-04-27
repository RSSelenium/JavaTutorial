package OOPS;

public class CallByValueCallByRef {
	int p;
	int q;
	
	public int meth(int a, int b) {
		int c=a+b;
		return c;
				
	}
	
	

	public static void main(String[] args) {
		CallByValueCallByRef d = new CallByValueCallByRef();
		int x=2;
		int y=3;
		d.meth(x, y);//call by value
		d.p=30;
		d.q=50;

	}

}
