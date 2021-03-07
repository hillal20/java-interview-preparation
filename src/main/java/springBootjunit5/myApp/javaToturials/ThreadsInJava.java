package springBootjunit5.myApp.javaToturials;


class MyThread extends Thread{
	
	public void run() {
		System.out.println(" == my thread is running ===");
	}
}


public class ThreadsInJava {
	
	public static void main(String[] args) {
		
		System.out.println("count ==> : "+ Thread.activeCount());
		System.out.println("name ===> : "+ Thread.currentThread().getName());
		System.out.println("priority ===> : "+ Thread.currentThread().getPriority());
		/////
		MyThread myThread2 = new MyThread();
		myThread2.start();
		System.out.println("count2 ==> : "+  myThread2.activeCount());
	    myThread2.currentThread().setName("t-2");
		System.out.println("name2 ===> : "+  myThread2.currentThread().getName());
		System.out.println("priority2 ===> : "+ myThread2.currentThread().getPriority());
	
	}

}
