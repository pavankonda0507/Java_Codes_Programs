package Exceptions;

class AgeException extends Exception {
	AgeException() {
		super();
	}
	AgeException(String str) {
		super(str);
	}
}
class Custom {
	public static void main(String[] args) throws AgeException {
		int age = 15;
		if(age>18)
			System.out.println("Eligible to vote");
		else 
			throw new AgeException("Age should not less than 18");
		
	}
}
