package com.sortingandsearch;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = {12,348,84,259,24,7561,81};
		int search=761,f=0,l=a.length-1;
		while(f<=l) {
			int mid=(f+l)/2;
			if(search==a[mid]) {
				System.out.println("Element found");
				break;
			}
			else if(search>a[mid]) {
				f=mid+1;
			}
			else {
				l=mid-1;
			}
		}
		if(f>l) {
			System.out.println("Element not found");
		}
	}

}
