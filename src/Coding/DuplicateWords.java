package Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {
	
	public static void findDuplicate(String inputString) {
		//java is java the best language is java for the employees
		String[] words = inputString.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
		for(String word: words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		//System.out.println(wordCount);
		
		Set<String> wordInString = wordCount.keySet();
		
		for(String w : wordInString) {
			if(wordCount.get(w)>1) {
				System.out.println(w + ":" + wordCount.get(w));
				
			}
		}
			
	}
	public static void main(String[] args) {
		findDuplicate("java is java the best language is java for the employees");
		
	}

}
