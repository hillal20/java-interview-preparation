package springBootjunit5.myApp.javaToturials;



enum MyEnum { 
	 PHONE(1), CAR(2);
	int number;
	MyEnum(int num){
		this.number = num;
		
	}
	
}

public class Enums {
	
	public static void main(String[] arg){
		MyEnum car = MyEnum.CAR;
		
		System.out.println("car ===> " + car);
		System.out.println("car ===> " + car.number);
		
	}
}