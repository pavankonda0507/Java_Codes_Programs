package com.sortingandsearch;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a= {23,84,673,93,84,53,1,62,77};
		int min=0;
		for(int i=0;i<a.length-1;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
