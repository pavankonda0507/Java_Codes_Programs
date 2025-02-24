/*
 * Program to swap first even number and first odd number 
 */
package ArraysSathya;

public class Prblm10 {
	public static void main(String[] args) {
		int[] a= {2,4,7,8,10,34,43};
		int eindex=0,oindex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				eindex=i;
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				oindex=i;
				break;
			}
		}
		int temp = a[eindex];
		a[eindex] = a[oindex];
		a[oindex] = temp;
		for(int i:a) {
			System.out.println(i);
		}
	}

}
