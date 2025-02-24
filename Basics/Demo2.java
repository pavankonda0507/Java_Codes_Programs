package Basics;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		int[] a= {45,4,93,12,7,83,3,54,82,72,37};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
		}
		for(int i:a) { 
			System.out.println(i); 
		}
			
		
	}

}
