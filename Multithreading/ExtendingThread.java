package Multithreading;

public class ExtendingThread extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	public static void main(String[] args) {
		ExtendingThread t1 = new ExtendingThread();
		ExtendingThread t2 = new ExtendingThread();
		t1.setName("Thread-1");
		t1.setName("Thread-2");
		t1.start();
		t2.start();
	}

}
