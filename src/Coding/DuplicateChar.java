package Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*logic:
 * String s = "Java", String a = "Naveen";
 * a repeated 2 times, e repeated 2 times, no repetition for N/n
 * String ="Tom"; here it should not print anything
 *  for s==null> return nothing
 * for s==isEmpty> return nothing
 * s.length()==1 > return nothing

*/
public class DuplicateChar {
	public static void printDuplicateChar(String str) {
		if (str == null) {
			System.out.println("NULL String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("EMPTY String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single char String");
			return;
		}
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for (Character chh : ch) {
			if (m.containsKey(chh)) {
				m.put(chh, m.get(chh) + 1);
			} else {
				m.put(chh, 1);
			}

		}
		// System.out.println(m);
		
		Set<Character> charInString = m.keySet();
		for(Character c: charInString) {
			if(m.get(c)>1) {
				System.out.println(c + ":" + m.get(c));
			}
		}
	}

	public static void main(String[] args) {
		
		printDuplicateChar("needs input as string");
		
		
		char[] ch = {'w', 'e', 'r', 't'};
		for(int i=0; i<ch.length; i++) { // array
			System.out.println(ch[i]);
		}
		
		
		String r = "Rushali";
		for(int i=0; i<r.length(); i++) { // string
			System.out.println(r.charAt(i));
		}
		
		//converting integer into string
		int k=20;
		String s = String.valueOf(k);
		System.out.println(s);	
		
		char[] c = {'e', 'r', 't', 'y'};
		String j = String.valueOf(c);
		System.out.println(j);
		
		//converting string into datatypes 
		String ss = "123";
		int i = Integer.parseInt(ss);
		System.out.println(i);
		double dd = Double.parseDouble(ss);
		System.out.println(dd);
		
		HashMap<String, Integer> h = new HashMap<>();
		System.out.println(h.put("ria", 2));
		System.out.println(h.put("ra", 7));
		System.out.println(h.containsKey("ria"));
		System.out.println(h.containsValue(2));
		System.out.println(h.containsValue(0));
		System.out.println(h.get("ra")); // gives index value of present key
		
		
		
		
	}

}
