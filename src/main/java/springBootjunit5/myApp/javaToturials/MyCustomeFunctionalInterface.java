package springBootjunit5.myApp.javaToturials;

import java.lang.FunctionalInterface;

@FunctionalInterface
public   interface MyCustomeFunctionalInterface {
	
public 	abstract  String  hello();

  default void   printName() {
	System.out.println("hello Hilal");
}

  static void printLastName() {
	   System.out.println("hello aissani");
  }
  
}
