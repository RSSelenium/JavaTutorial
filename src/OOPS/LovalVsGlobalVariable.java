package OOPS;

public class LovalVsGlobalVariable {
	
	String name="tom";
	int age=25;
	
	public void sum() {
		int i=10;
		int j=20;
		int age=23;
		
		
	}
	
	

	public static void main(String[] args) {
		int i=10;
		LovalVsGlobalVariable l = new LovalVsGlobalVariable();
		System.out.println(l.name);
	}

}
