package springBootjunit5.myApp.javaToturials;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierInterface {

public static void main(String[] args) {
		
		
		// supplier  interface is a functional interface with only get method 
		Supplier<?> suplier = ()-> {
			System.out.println(LocalDate.now());
		return 	LocalDate.now();
			};
			
		suplier.get();
	}

	
}
