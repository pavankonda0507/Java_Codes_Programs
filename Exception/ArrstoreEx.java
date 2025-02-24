import java.util.Scanner;
class ArrstoreEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("Enter the elements: ");
		try{
			for(int i=0;i<3;i++) {
				a[i] = sc.nextInt();
			}
		}
		catch(Exception e) {
			System.out.println("Elements type in array is not same");
		}

		
	}
}