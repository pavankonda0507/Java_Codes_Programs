class Syn implements Runnable {
	int count;
	public void run() {
		method();
	}
	public synchronized void method() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+(count++));
		}
	}
}
class Sample {
	public static void main(String[] args) {
		Syn s = new Syn();	
		Thread t1 = new Thread(s,"Thread 1");
		Thread t2 = new Thread(s,"Thread 2");
		t1.start();
		t2.start();
	}
}