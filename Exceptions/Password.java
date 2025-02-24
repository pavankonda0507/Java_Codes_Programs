package Exceptions;
import java.util.Scanner;
class PasswordInvalidException extends RuntimeException {
	PasswordInvalidException() {
		super();
	}
	PasswordInvalidException(String s) {
		super(s);
	}
}
class UsernameInvalidException extends PasswordInvalidException {
	UsernameInvalidException() {
		super();
	}
	UsernameInvalidException(String s) {
		super(s);
	}
}
public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String username = sc.next();
		System.out.print("Enter Password: ");
		int password = sc.nextInt();
		if(password==9392 && username.equals("Pavan123")) 
			System.out.println("Welcome to page");
		else if(password!=9392) 
			throw new PasswordInvalidException("Password Invalid");
		else if(!username.equals("Pavan123"))
			throw new UsernameInvalidException("Username Invalid");
		
	}
	

}
