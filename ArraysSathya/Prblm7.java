//Search an element
package ArraysSathya;

public class Prblm7 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int search=81,temp=0;
		for(int i:a) {
			if(search==i) {
				temp=i;
				break;
				
			}
		}
		if(temp!=0)
			System.out.println("Element found");
		else 
			System.out.println("Element not found");
	}

}
