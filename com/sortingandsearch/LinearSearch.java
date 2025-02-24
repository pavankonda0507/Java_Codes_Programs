package com.sortingandsearch;

public class LinearSearch {
	public static void main(String[] args) { 
		int[] a = {12,34,53,83,92,282,1983};
		int search = 523,temp=0;
		for(int i=0;i<a.length;i++) {
			if(search==a[i]) {
				temp = a[i];
				break;
			}
		}
		if(temp==search) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
