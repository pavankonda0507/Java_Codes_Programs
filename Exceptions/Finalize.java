package Exceptions;

public class Finalize {
	protected void finalize() {
		System.out.println("finalize() method called");
	}
	public static void main(String[] args) {
		Finalize f = new Finalize();
		f=null;
		System.gc();
		System.out.println("Garbage collected");
		
	}

}
