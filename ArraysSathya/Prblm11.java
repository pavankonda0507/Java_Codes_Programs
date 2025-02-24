/*
Write a program to print even numbers at first and odd at last in an array
 */
package ArraysSathya;

public class Prblm11 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
		int x=0;
		
		for(int i:b) {
			if(i%2==0) {
				a[x]=i;
				x++;
			}
		}
		for(int i:b) {
			if(i%2!=0) {
				a[x]=i;
				x++;
			}
		}
		
		for(int i:a) {
			System.out.println(i);
		}
		
		
	}

}
