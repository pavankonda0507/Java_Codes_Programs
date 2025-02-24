package Exceptions;
import java.util.Scanner;
class TooYoungException extends RuntimeException {
	TooYoungException() {
		super();
	}
	TooYoungException(String s) {
		super(s);
	}
}
class TooOldException extends RuntimeException { // extends TooYoungException
	TooOldException() {
		super();
	}
	TooOldException(String s) {
		super(s);
	}
}
public class Marriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age>25) {
			throw new TooOldException("your age is too Old");
		}
		else if(age<25) {
			throw new TooYoungException("your age is too Young");
		}
		else {
			System.out.println("Your aligible for Marriage");
		}
	}

}
