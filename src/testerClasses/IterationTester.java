package testerClasses;

import interfaces.Map;
import mapClasses.BSTMap;

public class IterationTester {
	public static void main(String[] args) {
		BSTMap<Integer, String> map = 
				new BSTMap<Integer, String>(new NumberComparator1()); 
			mapInsert(1, "one", map); 
			mapInsert(30, "thirty", map); 
			mapInsert(13, "thirteen", map); 
			mapInsert(40, "forty", map); 
			mapInsert(-10, "minus ten", map); 
			mapInsert(19, "nineteen", map); 
			mapInsert(11, "eleven", map);  
			mapInsert(4, "four", map); 
			mapInsert(-5, "minus five", map); 
			mapInsert(35, "thirty five", map);  
			mapInsert(50, "fifty", map);  
			mapInsert(25, "twenty five", map);  
			mapInsert(17, "seventeen", map);  
			mapInsert(8, "eight", map);  
			mapInsert(9, "nine", map);  
		 	mapInsert(10, "ten", map);  
			mapInsert(7, "seven", map);  
			mapInsert(23, "twenty three", map);  
			mapInsert(16, "sixteen", map);  
			mapInsert(14, "fourteen", map);  
			mapInsert(47, "forty seven", map);  
			mapInsert(29, "twenty nine", map);  
			mapInsert(33, "thirty three", map); 
			mapInsert(15, "fifteen", map);  
			
			showMapValues("The values are",map);
			showMapKeys("The keyss are",map);
			
	}
	private static void mapInsert(int key, String value, BSTMap<Integer, String> map) { 
		System.out.println("Map after inserting [key = " + key + ", " + " values = " + value + "]"); 
		map.put(key, value); 
		map.displayTree();
		
	}
	private static <K,V> void showMapValues(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (V value : m.values()) 
			System.out.println(value); 
	}

	private static <K,V> void showMapKeys(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (K key : m.keySet()) 
			System.out.println(key); 
	}
}
