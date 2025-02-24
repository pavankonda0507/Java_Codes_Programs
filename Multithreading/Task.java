class Task {
	public static void main(String[] args) {
		Thread t[] = new Thread[4];
		System.out.println("Program Executing...");
		Runnable r1 =()-> {
			try {
				t[2].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);	
			}
		};
		Runnable r2 =()-> {
			try {
				t[3].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);	
			}
		};
		Runnable r3 =()-> {
			try {
				t[0].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=15;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);	
			}
		};
		Runnable r4 =()-> {
			try {
				t[1].join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=20;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);	
			}
		};
		
		t[0] = new Thread(r1,"Thread-1");
		t[1] = new Thread(r2,"Thread-2");
		t[2] = new Thread(r3,"Thread-3");
		t[3] = new Thread(r4,"Thread-4");
		t[0].start();
		t[1].start();
		t[2].start();
		t[3].start();
		
		
	}
}