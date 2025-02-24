package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		System.out.println(al.add(null));	
		System.out.println(al.toArray());
		System.out.println(al);
		al.add(10);
		al.add(20);
		System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
