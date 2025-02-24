/*
Program for perfect number in array
6 factors 1 2 3 (excluding its factor)
1+2+3 = 6 perfect number
 */
package ArraysSathya;

public class Prblm5 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,28,468};
		for(int i=0;i<a.length;i++) {
			int num = a[i],sum=0;
			for(int j=1;j<=num/2;j++) {
				if(num%j==0) {
					sum+=j;
				}
			}
			if(sum==num) {
				System.out.println(num+" Perfect number");
			}
		}
		
	}

}
