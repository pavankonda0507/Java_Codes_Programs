class Priority {
	public static void main(String[] args) {
		Runnable r=()-> {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());
			}
			
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}