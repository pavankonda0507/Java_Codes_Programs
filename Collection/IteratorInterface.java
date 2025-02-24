package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorInterface {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		Iterator <Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}