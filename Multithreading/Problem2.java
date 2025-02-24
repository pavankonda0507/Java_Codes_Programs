class out implements Runnable {
	int count;
	public void run() {
	for(int i=0;i<5;i++) 
		System.out.println(Thread.currentThread().getName()+" "+(++count));
	}
}
class Problem2 {
	public static void main(String[] args) {
 		out o = new out();
		Thread t1  = new Thread(o,"Thread 1");
		Thread t2 = new Thread(o,"Thread 2");
		t1.start();
		t2.start();
	}         
		
}