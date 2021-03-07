package springBootjunit5.myApp.javaToturials;

public class ForEachLoop {
	
	public static void main(String[] args ) {
		
		String[] fruits = { "apple", "grape", "banana"};
		
		for(String f : fruits) {  // : means in 
			System.out.println(" ===>"+ f);
		}
	}

}
