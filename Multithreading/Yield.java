package Multithreading;

public class Yield {
	public static void main(String[] args) throws InterruptedException  {
		Runnable r = ()-> {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		
		t2.start();
		t2.yield();
	}
	

}
