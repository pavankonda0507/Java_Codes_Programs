package Basics;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		double dallow = (40/100.0)*salary;
		double rallow = (20/100.0)*salary;
		double grosssalary = salary-(dallow+rallow);
		System.out.println("Gross salary: "+grosssalary);
		
	}
	

}
