/*
 The distance between two cities (in km.) is input through the keyboard. 
 Write a program to convert and print this distance in meters, feet, inches and centimeters.
 
 1km = 1000meters
 1meter = 100cm
 1cm = 2.54inches
 1foot = 12inches
 */
package Basics;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		double km,m,cm,feet,inches;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in km: ");
		km = sc.nextDouble();
		m = km*1000;
		cm = m*100;
		inches = cm/2.54;
		feet = inches/12;
		System.out.println("Meters: "+m);
		System.out.println("Centimeters: "+cm);
		System.out.println("inches: "+inches);
		System.out.println("feet: "+feet);
	}
	

}
