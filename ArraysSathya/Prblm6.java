/*
Program to check the given element is duplicated or not 
 */
package ArraysSathya;

public class Prblm6 {
	public static void main(String[] args) {
		int[] a = {1,2,3,2,4,1,6,90,9,10,4,5,6,7,8};
		int element = 4;
		int count=0;
		for(int i:a) {
			if(i==element)
				count++;
		}
		if(count>1) {
			System.out.println("Duplicate");
		}
		else
			System.out.println("No ");
	}

}
