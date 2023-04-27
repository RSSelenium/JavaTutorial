package OOPSConceptPart2;

public class HSBCBank implements USBank {
	
	
	public void credit() {
		System.out.println("credit money");
	}
	public void debit() {
		System.out.println("debit money");
		
	}
	public void transferMoney() {
		System.out.println("transfer money");
	}


	
	public static void main (String[] args) {
		
		USBank h = new HSBCBank();
	
		h.credit();
		
		
		
		
		
	}
}
