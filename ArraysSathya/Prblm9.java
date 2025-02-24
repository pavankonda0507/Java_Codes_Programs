/*
Program to divide array into even and odd array
 */
package ArraysSathya;

public class Prblm9 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int ecount=0,ocount=0,x=0,y=0;
		for(int i:a) {
			if(i%2==0)
				ecount++;
			else
				ocount++;
		}
		int b[] = new int[ecount];
		int c[] = new int[ocount];
		for(int i:a) {
			if(i%2==0) {
				b[x]=i;
				x++;
			}
			else {
				c[y]=i;
				y++;
			}
		}
		System.out.println("Even array");
		for(int i:b) {
			System.out.println(i);
		}
		System.out.println("Odd array");
		for(int i:c) {
			System.out.println(i);
		}
	}

}
