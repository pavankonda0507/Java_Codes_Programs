class Synch {
	int num;
	public void m1() {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+(++num));
			}
		}
	}
	public static void main(String[] args)  {
		Synch s = new Synch();
		Runnable r =()-> {
			s.m1();
			
		};
		Thread t1 = new Thread(r,"Thread 1");
		Thread t2 = new Thread(r,"Thread 2");
		t1.start();		
		t2.start();
	}
}