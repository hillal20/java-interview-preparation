package springBootjunit5.myApp.javaToturials;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int [][] arr = {{}, {} , {}};
		System.out.println(arr.length);
		
		///////////////////////////////////////////
		
		 List<Integer> arr2  = new ArrayList<>();
		 List<Integer> arr3 = new ArrayList<>();
		 List<List<Integer>> array2d = new ArrayList<>();
		 
		 for(int i = 0; i < 5 ; i++ ) {
			 arr2.add(1);
			 arr3.add(2);
		 }
		
		 array2d.add(arr2);
		 array2d.add(arr3);
		 
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(array2d.get(1).get(0));
		
		/////////////////
		Integer x = 4;
		String y = "7";
		System.out.println(Integer.toString(x));
		System.out.println(Integer.parseInt(y));
		
		
		///////////// typeof in java is obj.getClass() 
		Object obj = null;
		obj = x;
		System.out.println(obj.getClass());
		obj = y;
		System.out.println(obj.getClass());
		
         ///////////// typeof in java is instanceof 
		
		System.out.println(y instanceof String);
		System.out.println(x  instanceof Integer  );
	}
	

}
