/*
Program to reverse the all elements in an array without using second array
 */
package ArraysSathya;

public class Reverse {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int b=0,mid = a.length/2;
		for(int i=0;i<mid;i++) {
			int temp = a[i];
			a[i] = a[a.length-1-b];
			a[a.length-1-b] = temp;
			b++;	
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
