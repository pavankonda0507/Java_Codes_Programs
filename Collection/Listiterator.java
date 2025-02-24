package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Listiterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		ListIterator<Integer> itr = al.listIterator();
		System.out.println("Forward iteration");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Backward Iteration");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
