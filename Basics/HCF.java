
package Basics;
import java.util.Scanner;

class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1 = sc.nextInt(),num2 = sc.nextInt(),hcf=0;
		int res = num1>num2?num2:num1;
		for(int i=1;i<=res;i++) {
			if(num1%i==0&&num2%i==0) {
				hcf = i;
			}
		}
		System.out.println("The hcf of "+num1+" and "+num2+" is "+hcf);		
	}
	

}
