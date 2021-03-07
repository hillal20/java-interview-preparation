package springBootjunit5.myApp.javaToturials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class JavaStreams {
	
	public static void main(String[] args) {
		
		
		// Integer stream 
		IntStream
		.range(1, 10)
		.skip(5)
		.sorted()
		.forEach(System.out:: println);
	
        // printing the sum 
		OptionalDouble st = IntStream
		.range(1, 10)
		.skip(5)
		.sorted()
		.average();
		System.out.println(st);
		
		// you can stream strings , int , objects 
		 Stream.of("hill", "aiss", "jijel")
		.findFirst()
		.ifPresent((x)-> System.out.println(x));
		 
		 // you can stream of arrays 
		 String[] names = {"jo","bb", "dell"};
		 Stream.of(names)
		 .sorted()
		 .forEach((x)-> System.out.println(x));
		 
		 // we can filter 
		 String[] names2 = {"jo","bb", "dell"};
		 Stream.of(names2)
		 .filter((x)-> x.startsWith("j"))
		 .forEach((x)-> System.out.println(x));
		 
		 // we can map
		 int[] list = new int[3];
		 
		 list[0] = 3;
		 list[1] = 2;
		 list[2] = 5;
		 
		 Arrays.stream(list)
		 .map(x ->  x*x )
		 .forEach(System.out:: println);
		 
		 // we could stream list 
		 
		 List<String> mylist = new ArrayList<>();
		 mylist.add("hill");
		 mylist.add("bill");
		 mylist.add("dill");
		 mylist.add("fill");
		 mylist.add("film");
		 mylist.add("disk");
		 
			
		 mylist.stream()
		 .filter(x -> x.endsWith("l"))
		 .forEach(x -> System.out.println(x));
			
		 // reduce 
		 
		 List<Integer> d = new ArrayList<>();
		 d.add(1);
		 d.add(2);
		 d.add(3);
		 d.add(4);
		 
		Integer sum =  d.stream()
		 .reduce(0, (a, b )-> a+b);
		 System.out.println(sum);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}