package Exceptions;
import java.util.Scanner;
class InsufficientBankBalance extends RuntimeException {
	InsufficientBankBalance() {
		super();
	}
	InsufficientBankBalance(String str) {
		super(str);
	}
}

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Bankbalance = 50000;
		System.out.print("Enter withdraw amount: ");
		int withdraw = sc.nextInt();
		if(Bankbalance>=withdraw) {
			System.out.println("Withdraw success");
		}
		else {
			throw new InsufficientBankBalance("Insufficinet balance");
		}
	}
}
