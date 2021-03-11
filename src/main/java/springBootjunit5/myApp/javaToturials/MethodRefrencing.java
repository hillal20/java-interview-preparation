package springBootjunit5.myApp.javaToturials;

import java.lang.FunctionalInterface;
import java.util.function.Function;

class MClass{ 
	 static void  print() {
		 System.out.println("hello guys");
		 }
}

@FunctionalInterface
interface MyFuntionalInterface{
	
abstract void hello();
}

public class MethodRefrencing {
	
	public static void main(String[] args) {
		// method reference can replace lambda expressions 
		MyFuntionalInterface  myObj = MClass :: print; 
		// or 
		MyFuntionalInterface  myObj2 = () -> System.out.println("hello guys 2 ");
		
		myObj.hello();
		myObj2.hello();
				
	}

}



 