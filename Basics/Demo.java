package Basics;

import java.util.Scanner;
class Method {
	public int[] mymethod(int[] a) {
		int temp=0,mid=a.length/2;
		for(int i=0;i<mid;i++) {
			int temp1=a[i];
			a[i] = a[a.length-1-temp];
			a[a.length-1-temp] = temp1;
			temp++;
			
		}
		
		return a;
	}
}

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Method m= new Method();
		int[] b=m.mymethod(arr);
		for(int i:b) {
			System.out.println(i);
		}
		
		
		
		
	}
}