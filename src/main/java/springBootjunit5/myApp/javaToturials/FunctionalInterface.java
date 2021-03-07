package springBootjunit5.myApp.javaToturials;

interface MyInterface{
	// functional interface contain only one abstract method
	void showMessage(String msg );
	
	}
public class FunctionalInterface {
	public static void main(String[] args) {
		// normally we do the following
		MyInterface myInterface = new MyInterface() {
			public void showMessage(String msg ) {
			System.out.println(" hello world 1  ==> " + msg  );
				
			}
		};
		myInterface.showMessage("whats up !! ");
		
		/// in lamda expression we can do 
		MyInterface interface2 = (String msg ) -> System.out.println(" hello world 2 ===> "+ msg);
		interface2.showMessage("holla ");
		
		
	}

}
