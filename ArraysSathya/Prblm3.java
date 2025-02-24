/*
Sum of the even numbers in the array
 */
package ArraysSathya;

public class Prblm3 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i:a) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	

}
