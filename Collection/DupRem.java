package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DupRem {
	public static void main(String[] args) {
		int[] a = {12,31,43,12,43,48,12,43,65,13,11};
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			l.add(a[i]);
		}
		Set<Integer> s = new TreeSet<>();
		s.addAll(l);
		System.out.println(s);
	}

}
