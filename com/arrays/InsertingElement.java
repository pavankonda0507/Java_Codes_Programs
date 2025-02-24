package com.arrays;

public class InsertingElement {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		int index=3,element=55;
		int[] b = new int[a.length+1];
		int x=0;
		for(int i=0;i<a.length;i++) {
			if(i==index) {
				b[x]=element;
				x++;
			}
			
			b[x] = a[i];
			x++;
		}
		for(int i:b) {
			System.out.println(i);
		}
	}

}
