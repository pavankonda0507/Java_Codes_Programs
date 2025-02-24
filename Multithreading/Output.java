class Tech extends Thread {
	public void run() {	
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Output {
	public static void main(String[] args) {
		Tech t1 = new Tech();
		Tech t2 = new Tech();
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
		}
		t2.start();
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}