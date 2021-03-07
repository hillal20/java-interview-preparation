package springBootjunit5.myApp.javaToturials;


class Greating{
	String saySomething() {
		return "hello Guys";
	}
	String sayWrongthing() {
		return "FK u  Guys";
	}
	
	
}

public class InnerAnnonymousClass {
	public static void main(String[] args) {
		
		Greating  greating = new Greating() {
		     // this space here is called  anonymous class to override  the original class 
			String saySomething() {
				return "hllo  Brothers";
			}	
		};
		
		Greating greating2 = new Greating();
		
		System.out.println(" greating ===> "+ greating.sayWrongthing());
		System.out.println(" greating ===> "+ greating.saySomething());
		System.out.println(" greating ===> "+ greating2.saySomething());
	}

}
