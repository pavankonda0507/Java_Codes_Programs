/*
 If the marks obtained by a student in five different subjects are input 
 through the keyboard, find out the aggregate marks and percentage marks 
 obtained by the student. Assume that the maximum marks that can be 
 obtained by a student in each subject is 100.
 */
package Basics;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of each subject: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		double aggmarks = s1+s2+s3+s4+s5,percentage = (aggmarks/500.0)*100;
		System.out.println("Aggregate marks: "+aggmarks);
		System.out.println("Percentage: "+percentage);
		
		
	}
}
