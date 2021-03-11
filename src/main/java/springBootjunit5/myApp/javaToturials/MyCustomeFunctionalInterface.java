package springBootjunit5.myApp.javaToturials;

import java.lang.FunctionalInterface;

@FunctionalInterface
public   interface MyCustomeFunctionalInterface {
	
public 	abstract  String  hello();


// default methods are new feature added to java 8 
  default void   printName() {
	System.out.println("hello Hilal");
}

  // static methods are interface methods 
  static void printLastName() {
	   System.out.println("hello aissani");
  }
  
}
