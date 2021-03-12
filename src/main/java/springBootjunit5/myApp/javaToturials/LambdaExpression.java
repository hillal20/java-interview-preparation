package springBootjunit5.myApp.javaToturials;
import java.lang.FunctionalInterface;



@FunctionalInterface 
interface FunInterfaceWithMethods {
	 String myFn();
	 
	 default void hello() {
		 System.out.println("hello");
	 }
	 
	 static void hi() {
		 System.out.println("hi");
	 }
};



@FunctionalInterface 
interface FunInterface {
	String myFn();
};


interface LambdaInterface {
	void   myFn();
};


public class LambdaExpression {
	public static void main(String[] args) {
		
		// simple lambda expression from an interface with one method 
		LambdaInterface  lx = ()-> System.out.println(" hello gus"); 
		lx.myFn();
		
		// simple lambda expression from a functional  interface with one abstract method
		FunInterface  fn  = ()-> "hello  word"; 
		fn.myFn();
		
		//// simple lambda expression from a functional  interface with one abstract method and static and default methods 
	
	FunInterfaceWithMethods fnWithMethod =  ()-> "jus lambda is here";
	fnWithMethod.hello();
	fnWithMethod.myFn();
	FunInterfaceWithMethods.hi();
	
	
	}	
}
