/*
Swap first and last element in the array
 */
package ArraysSathya;

public class Prblm1 {
	public static void main(String[] args) {
		int[] a = {12,4,6,2,7,3,1};
		int temp = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = temp;
		for(int i:a) {
			System.out.println(i);
		}
	}
	

}
