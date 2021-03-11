package springBootjunit5.myApp.javaToturials;

import java.util.function.Predicate;


public class PredicateInterface {

	
public static void main(String[] args) {
		
		
		// predicate   interface is a functional interface with only test method , return boolean
		Predicate<String> predicate  = (element) -> {
			System.out.println(element);
		return 	element.endsWith("h");
			};
			
		predicate.test("USA");
		
		// joining predcicates 
		Predicate<String> predicate2 = (str)-> str.length() >= 3;
		
		System.out.println(predicate.and(predicate2).test("Hhi"));
		System.out.println(predicate.or(predicate2).test("Hhi"));
		System.out.println(predicate.negate().test("Hhh"));
		
	}

	
}
