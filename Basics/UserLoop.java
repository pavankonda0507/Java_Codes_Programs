package Basics;
import java.util.Scanner;
public class UserLoop {

	public static void main(String[] args) {
		int num,c1 = 0,c2 = 0;
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(i<=10) {
			System.out.println("Enter enter the number: ");
			num = sc.nextInt();
			if(num>=0) {
				c1++;
					
			}
			else 
				c2++;
			i++;
		}
		System.out.println("The count of +ve numbers: "+c1);
		System.out.println("The count of -ve numbers: "+c2);
			
	}
		
		

}

