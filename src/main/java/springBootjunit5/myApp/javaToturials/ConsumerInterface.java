package springBootjunit5.myApp.javaToturials;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		
		List<Integer> arr1 = Arrays.asList(1,4,6,7,8);
		
		// consumer interface is a functional interface with only accept method 
		Consumer consumer = (i)-> System.out.println("i ===>" + i);
			
		// forEach takes a consumer which is an instance of a class implemented Cunsumer interface 
		arr1.forEach(consumer);
		
		
		
		// other example is here
		Consumer consumer2 = new Consumer() {

			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub	
				System.out.println("t ==> "+ t.toString());
			}	
			
		};
		
		arr1.forEach(consumer2:: accept);
		
	}

}
