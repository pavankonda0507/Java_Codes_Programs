package ArraysChapter1;
import java.util.Scanner;

class Demo {
	Scanner sc = new Scanner(System.in);
	int[] intArr(int n) {
		int a[] = new int[n];
		System.out.println("Enter the integers: ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();	
		}
		return a;
	}
	char[] charArr(int n) {
		char ch[] = new char[n];
		System.out.println("Enter the characters: ");
		for(int i=0;i<n;i++) {
			ch[i] = sc.next().charAt(0);
		}
		return ch;
	}
	String[] stringArr(int n) {
		String s[] = new String[n];
		System.out.println("Enter the strings: ");
		for(int i=0;i<n;i++) {
			s[i] = sc.next();
		}
		return s;
	}
	boolean[] boolArr(int n) {
		boolean b[] = new boolean[n];
		System.out.println("Enter the booleans: ");
		for(int i=0;i<n;i++) {
			b[i] = sc.nextBoolean();	
		}
		
		return b;
		
	}
	

}
class Insert {
	public static void main(String[] args) {
		Demo obj = new Demo();
		int res[] = obj.intArr(5);
		for(int i:res) {
			System.out.println(i);
		}
		System.out.println("The length of the integer array: "+res.length);
		
		char res2[] = obj.charArr(6);
		for(char i:res2) {
			System.out.println(i);
		}
		System.out.println("The length of the char array: "+res2.length);
		
		String res3[] = obj.stringArr(4);
		for(String i:res3) {
			System.out.println(i);
		}
		System.out.println("The length of the string array: "+res3.length);
		
		boolean res4[] = obj.boolArr(3);
		for(boolean i:res4) {
			System.out.println(i);
		}
		System.out.println("The length of the boolean array: "+res4.length);
		
		
		
	}
}
