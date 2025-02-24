class Myclass extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class Block {
	public static void main(String[] args) {
		Myclass t1 = new Myclass();
		t1.setName("Thread 1");
		t1.run();
		Myclass t2 = new Myclass();
		t2.setName("Thread 2");
		t2.run();
	}
}