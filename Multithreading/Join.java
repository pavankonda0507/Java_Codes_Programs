class Join {
	Thread[] t = new Thread[2];
	public static void main(String[] args) {
		Runnable r1 =()-> {
			try {
				t[1].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		Runnable r2 =()-> {
			try {
				t[0].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=8;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			
		};
		t[0] = new Thread(r1);
		t[0].start();
		t[1] = new Thread(r2);
		t[1].start();
		
		
	}
}