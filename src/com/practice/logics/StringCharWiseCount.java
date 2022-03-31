package com.practice.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCharWiseCount {
	
	/*Set<Integer> set = new Hs<>();
	set.add(11);

	for(Integer num : set) {
		SYSO(num);
		
	}*/
	
	public static void main(String[] args) {
		//System.out.println(getCharWiseCount("Saikrishna"));
		Map<Character, Integer> charWiseCount = getCharWiseCount("saikrishna");
		Set<Entry<Character, Integer>> entrySet = charWiseCount.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println("Key-" + entry.getKey() + " -> "+ "Vlaue-" + entry.getValue());
		}
	}
	
	public static Map<Character,Integer> getCharWiseCount(String inputStr) {
		Map<Character,Integer> charWiseCountMap = new HashMap<>();
		for(int i = 0 ; i < inputStr.length(); i++) {
			if(charWiseCountMap.containsKey(inputStr.charAt(i))) {
				charWiseCountMap.put(inputStr.charAt(i), charWiseCountMap.get(inputStr.charAt(i)) + 1);
			} else {
				charWiseCountMap.put(inputStr.charAt(i), 1);
			}
		}
		return charWiseCountMap;
	}
	
}
