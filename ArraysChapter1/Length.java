package ArraysChapter1;

class Length {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int c = 0;
		for(int i:a) {
			c++;
		}
		System.out.println("The length of the array: "+c);
		for(int i=0;i<c;i++) {
			System.out.println(a[i]);
		}
	}

}
