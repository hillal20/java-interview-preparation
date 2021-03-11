package springBootjunit5.myApp.javaToturials;


interface FirstInterface {
	default void hello() {
		System.out.println("hello world 1");
	}
}


interface SecondInterface {
	default void hello() {
		System.out.println("hello world 2");
	}
}


class MyCLASS implements FirstInterface, SecondInterface{
	
	public void  hello() {
		// this is to fix the diamands error in java , we shoose the fistInterface hello method
		FirstInterface.super.hello();
	}
}

public class DiamandErrorInJava {
	public static void main(String[] args) {
		
		MyCLASS myCLASS = new MyCLASS();
		myCLASS.hello();
		
	}

}
