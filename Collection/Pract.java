package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pract {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		List<String> a = new ArrayList<>(Arrays.asList("Hello","all","How","are","You"));
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		a.sort(Comparator.naturalOrder());
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}

}
