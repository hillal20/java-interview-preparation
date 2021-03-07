package springBootjunit5.myApp.javaToturials;

import java.util.function.Predicate;


public class PredicateInterface {

	
public static void main(String[] args) {
		
		
		// predicate   interface is a functional interface with only test method , return boolean
		Predicate<String> predicate  = (element) -> {
			System.out.println(element);
		return 	true;
			};
			
		predicate.test("USA");
	}
	
}
