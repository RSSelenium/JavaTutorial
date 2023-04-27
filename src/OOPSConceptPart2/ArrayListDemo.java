package OOPSConceptPart2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList r = new ArrayList(2);
		r.add("rumor");
		r.add(2222);
		r.add("r");
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("tom");
		ar.add('e');
		ar.add(12.2);
		ar.add(r);
		
		ArrayList p = new ArrayList();
		
		for(int i=0; i<ar.size(); i++) {
			p.add(ar.get(i));
		}
		
		Iterator it = p.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		
		System.out.println(ar.get(0));
		System.out.println(ar.contains(2));
		System.out.println(ar.containsAll(p));
		
		Hashtable h = new Hashtable();
		h.put("A", "28");
		h.put(10, "tir");
		h.put('e', 12.2);
		h.put("Age", true);
		System.out.println(h.size());
		System.out.println(h.containsKey("S"));
		h.containsKey(h);
		h.containsValue(h);
		System.out.println(h.get("A"));
		System.out.println(h.get('e'));
		System.out.println(h.isEmpty());
		
		
		
		

	}

}
