class Hello extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) 
			System.out.println(Thread.currentThread().getName()+" "+i);
	}
 
}
class Demo {
	public static void main(String[] args) {
		Hello t1 = new Hello();
		t1.setName("Pavan");
		Hello t2 = new Hello();
		t2.setName("Ram");
		Hello t3 = new Hello();
		t3.setName("Sai");
		Hello t4 = new Hello();
		t4.setName("Sadeep");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}
}