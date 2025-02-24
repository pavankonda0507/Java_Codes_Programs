package com.arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,7,8,9,10,11,13,15};
		int x=0;
		for(int i=a[0];i<=a[a.length-1];i++) {
			if(a[x]!=i) {
				System.out.println(i);
			}
			else 
				x++;
			
		}
	}

}
