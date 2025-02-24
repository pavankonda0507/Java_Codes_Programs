package Multithreading;

public class ImplementingRunnable implements Runnable {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		ImplementingRunnable obj = new ImplementingRunnable();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
		
	}

}
