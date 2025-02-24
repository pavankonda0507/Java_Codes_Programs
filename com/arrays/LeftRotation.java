package com.arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int r=4;
		for(int j=1;j<=4;j++) { 
			int temp = a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
			
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
