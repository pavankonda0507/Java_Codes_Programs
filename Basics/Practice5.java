/*
The length & breadth of a rectangle and radius of a circle are input through the keyboard. 
Write a program to calculate the area & perimeter of the rectangle, and the area & circumference of the circle.
Shape					Area				Perimeter
     
square					a**2				4*side
rectangle				l*b					2(l+b)
circle					Pi*r**2				2*pi*r
triangle				1/2*base*height		s = a+b+c
parallellogram			b*h					2(b*h)
 */
package Basics;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,b,r;
		System.out.println("Enter length and breadth of reactangle: ");
		l = sc.nextInt();b = sc.nextInt();
		System.out.println("Enter the radius of the circle: ");
		r = sc.nextInt();
		int ra = l*b,rp = 2*(l+b);
		int ca = (int) (3.14*(Math.pow(r, 2)));
		int cp = (int) (2*3.14*r);
		System.out.println("Rectangle area: "+ra+" "+" perimeter: "+rp );
		System.out.println("Circle area: "+ca+" "+" perimeter: "+cp);
		
	}

}
