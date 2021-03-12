package springBootjunit5.myApp.javaToturials;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
	public static void main(String[] args) {
		
		
		// the same as Function interface but the type of take is the same as the return 
		UnaryOperator<Integer> uo = (x)-> x*4;
		System.out.println(uo.apply(3));
		
		// in the function we give the type of the take and the return 
		Function<String, Integer> fn = (s) -> s.length();
		System.out.println(fn.apply("hello"));
	}

}
