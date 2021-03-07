package springBootjunit5.myApp.javaToturials;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	
	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1,"hilal -1");
		myMap.put(2,"hilal -2");
		myMap.put(3,"hilal -3");
		
		for( String e : myMap.values()) {
			System.out.println("e ==> " + e);
		}
		for( Integer e : myMap.keySet()) {
			System.out.println("e ==> " + e);
		}
	}

}
