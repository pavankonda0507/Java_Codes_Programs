package Collection;

import java.util.LinkedList;
import java.util.List;

public class Unique {
	public static void main(String[] args) {
		int a[] = {1,2,3,3,1,4,5,7,4,8,9};
		List<Integer> l = new LinkedList<>();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		for(Integer i:l) {
			if(l.indexOf(i)==l.lastIndexOf(i)) {
				System.out.println(i);
			}
		}
		
	}

}
