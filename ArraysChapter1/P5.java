package ArraysChapter1;
class Prob {
	//Reverse the given array
	void reverse(int a[],int n) {
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	//Print the first array in reverse order and print the whole array
	int[] firstHalfReverse(int a[],int n,int mid) {
		int b[] = new int[mid],x = 0;
		for(int i=0;i<mid;i++) {
			b[i] = a[i];		
		}
		for(int i=b.length-1;i>=0;i--) {
			a[x] = b[i];
			x++;
		}
		return a;
	}
}
class P5 {
	public static void main(String[] args) {
		Prob p = new Prob();
		int a[] = {12,56,34,23,67,76,32,75,90,345};
		int n = a.length,mid = n/2;
//		p.reverse(a, n);
		
		int fr[] = p.firstHalfReverse(a, n, mid);
		for(int i:fr) {
			System.out.println(i);
		}
		
		
		
	}

}
