

class Out {
 	public static void main(String[] a) {
		
		Runnable l = ()-> 
		{
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(l,"Thread 1");
		t1.start();
		Thread t2 = new Thread(l,"Thread 2");
		t2.start();
	}
}