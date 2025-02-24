package OOPS.Constructors;

class Sample {
	Sample() {
		System.out.println("Default Constructor in sample");
	}
	Sample(int a, int b) {
		int c = a+b;
		System.out.println("Parameter Constructor in sample "+c);
	}
	Sample(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("Three Parameter Constructor in sample "+d);
	}
}
class Sample2 extends Sample {
	Sample2() {
		super();//By default constructor contains the super keyword by JVM
		System.out.println("Default constructor in sample2");
	}
	Sample2(int x, int y) {
//		super(); Default contains super if we want to call parameter constructor then we have to specify explicitly
		super(20,30,40);
		int z=x+y;
		System.out.println("Two Parameter constructor in sample2 "+z);
	}
}
class Sample3 extends Sample2 {
	Sample3() {
		super(10,20);
		System.out.println("Default constructor in sample3");
		
	}
	Sample3(int i) { 
		
		System.out.println("Two Parameter constructor in sample3 "+i);
		
	}
}
public class Super {
	public static void main(String[] args) {
		Sample3 s = new Sample3();
	}
}
