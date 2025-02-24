package Multithreading;

public class Deadlock {
	
	public static void main(String[] args) {
		Thread[] t = new Thread[2];
		Runnable r = ()-> {
			try {
				t[1].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		Runnable r2 = ()-> {
			try {
				t[0].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		t[0] = new Thread(r);
		t[1] = new Thread(r2);
		t[0].start();
		t[1].start();

		
	}


}
