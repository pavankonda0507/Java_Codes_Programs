class Prob7 {
	void search(int a[],int f,int l,int search) {
		while(f<=l) {
			int mid = (f+l)/2;
			if(search==a[mid]) {
				System.out.println("Element found");
				break;
			}	
			else if(search>a[mid]) {
				f = mid+1;
			}
			else {
				l = mid-1;
			}
		}
		if(f>l) 
			System.out.println("Element not found");
		
		
	}
}
class Binary {
	public static void main(String[] args) {
		Prob7 p = new Prob7();
		int a[] = {9,3,7,2,8,7,5};
		p.search(a,0,a.length-1,10);
	}
}