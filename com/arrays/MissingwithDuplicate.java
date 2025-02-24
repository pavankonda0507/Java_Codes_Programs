package com.arrays;

import java.util.Arrays;

public class MissingwithDuplicate { 
	public static void main(String[] args) {
		int a[] = {1,4,8,19,12,1,2,8,9,8,2,4};
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				count++;	
			}
		}
		int b[] = new int[count];
		int x=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[x] = a[i];
				x++;
			}
		}
		b[b.length-1]=a[a.length-1];
		for(int i:b) {
			System.out.println(i);
		}
	}

}
