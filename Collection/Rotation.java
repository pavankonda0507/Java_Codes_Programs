package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Rotation {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> l = new LinkedList<>();
		for(int i:a) 
			l.add(i);
		System.out.println(Collections.min(l));
		System.out.println(Collections.max(l));
		System.out.println("Right rotation for 2 times: ");
		Collections.rotate(l, 2);
		System.out.println(l);
		System.out.println("Left rotation for 2 times: ");
		Collections.rotate(l, -2);
		System.out.println(l);
	}
}
