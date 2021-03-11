package springBootjunit5.myApp.javaToturials;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();		
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		
		Stream stream = myList.stream().filter((e) ->  e%2 == 0).map((e)-> e*e);
		List<Integer> newList =  (List<Integer>) stream.collect(Collectors.toList());
		newList.stream().forEach((x)-> System.out.println(x) );
	}

	
	
}