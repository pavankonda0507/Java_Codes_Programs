/*
Program to print the multiplication table of each element in  array
 */
package ArraysSathya;

public class Prblm4 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			System.out.println("Multiplication table of: "+num);
			for(int j=1;j<=10;j++) {
				System.out.println(num+"x"+j+"="+num*j);
			}
			System.out.println();
		}
	}

}
