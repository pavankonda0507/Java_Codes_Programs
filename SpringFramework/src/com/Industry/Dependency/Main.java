package com.Industry.Dependency;

public class Main {
	public static void main(String[] args) {
		int num = 121,rev = 0,temp = num;
		while(num!=0) {
			int dig= num%10;
			rev = rev*10+dig;
			num/=10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		
	}

}
