/*
Temperature of a city in Fahrenheit degrees is input through the keyboard. 
Write a program to convert this temperature into Centigrade degrees.
c = (f-32)*5/9
 */
package Basics;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the F value: ");
		double f=sc.nextDouble(),c;
		c = (f-32)*(5/9.0);
		System.out.println(c);
		
		
	}

}
