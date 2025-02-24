package com.arrays;

public class RigthRotation {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		int r=4;
		for(int j=1;j<=4;j++) {
			int temp=a[a.length-1];
			for(int i=a.length-1;i>=1;i--) {
				a[i] = a[i-1];
	 		}
			a[0] = temp;
		}
		for(int i:a) {
		System.out.println(i);
		}
	}

}
