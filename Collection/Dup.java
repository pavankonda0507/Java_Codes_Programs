package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dup {
	public static void main(String[] args) {
		int a[] = {1,2,4,2,4,6,1,3,5};
		List<Integer> l = new ArrayList<>();
		Set<Integer> s = new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		for(Integer i:l) {
			if(l.indexOf(i)!=l.lastIndexOf(i)) {
				s.add(i);
			}
		}
		
		System.out.println(s);
	}

}
