package OOPS.Constructors;

public class ThisMethod {
	int num = 20;
	public void method1() {
		this.method2(10, 20);
		System.out.println("In method 1");
		System.out.println("Instance variable: "+this.num);
		
	}
	public void method2(int a, int b) {
		int c=a+b;
		System.out.println("In method 2");
		System.out.println("Sum of a, b: "+c);
		
	}
	public static void main(String[] args) {
		ThisMethod obj = new ThisMethod();
		obj.method1();
	}
 
}
