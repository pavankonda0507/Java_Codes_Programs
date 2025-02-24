package OOPS.Constructors;
class Demo1 {
	int a=10;
	Demo1() {
		System.out.println("Default constructor in parent class");
	}
	Demo1(int x) {
		System.out.println("Parameter Constructor in parent class");
	}
	public void method() {
		System.out.println("Method in parent class");
	}
	
}
class Demo2 extends Demo1 {
	int y=20;
	Demo2() {
		System.out.println("Default constructor in parent class");
	}
	Demo2(int x) {
		super(100);
		System.out.println("Parameter Constructor in parent class");
		System.out.println("Parent instance variable: "+super.a);
	}
	public void method() {
		super.method();
		System.out.println("Method in child class");
	}
	
}

public class Super2 {
	public static void main(String[] args) {
		Demo2 d = new Demo2(100);
		d.method();
	}
	
	
}
