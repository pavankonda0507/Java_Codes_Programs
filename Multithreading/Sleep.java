class Sleep {
	public static void main(String[] args) {
		Runnable r =()-> {
			for(int i=1;i<=10;i++) {
				try {
					System.out.println(Thread.currentThread().getName()+" "+i);
					Thread.currentThread().sleep(1000);	
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		for(int i=1;i<=10;i++) {	
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {	
				Thread.currentThread().sleep(1000);	
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}