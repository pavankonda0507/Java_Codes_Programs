package com.arrays;

public class SecondMax {
	public static void main(String[] args) {
		int[] a = {83,27,29,91,109,23,110,56,78,12,93};
		int max=a[0],smax=Integer.MIN_VALUE;
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("Max: "+max);
		for(int i:a) {
			if(i>smax&&i<max) {
				smax=i;
			}
		}
		System.out.println("Second max:"+smax);
		
	}

}
