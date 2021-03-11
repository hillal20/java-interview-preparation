package springBootjunit5.myApp.javaToturials;



interface MyDefaultInterface {
	
	default void hello() {
		System.out.println(" hello world ");
	}
}

class MyClass1 implements MyDefaultInterface{
	// this class will have the default implementation of the method hello()
	}

class MyClass2 implements MyDefaultInterface{
	public void hello() {
		System.out.println("hey guys");
	}
}

public class DefaultMethodsInInterfaces {
	
	public static void main(String[] args) {
		MyDefaultInterface myClass1 = new MyClass1();
		MyDefaultInterface myClass2 = new MyClass2();
		
		myClass1.hello();
		myClass2.hello();
		
		
	}
	

}
