package springBootjunit5.myApp.javaToturials;


import java.util.function.Function;


public class FunctionInterFace {

	
public static void main(String[] args) {
		
		
		// function  interface is a functional interface with only apply  method take a param and return an object 
		Function<String, Integer> functionObj  = (name)-> {
			System.out.println(name);
		return 4;
			};
			
		functionObj.apply("Hilal");
	}
}
