class Abnormal {
	void m1() {
		
		System.out.println(10/0);
		m2();
	}
	void m2() {
		m3();
		System.out.println("I am in m2");
	}
	void m3() {
		m4();
		System.out.println("I am in m3");
	}
	void m4() {
		System.out.println("I am in m4");
	}
	public static void main(String[] args) {
		Abnormal a = new Abnormal();
		try {
			a.m1();
		}
		catch(Exception e) {
			System.out.println("Exception in m1");
		}
		
		System.out.println("I am in main");
	}
}