package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetInter {
	public static void main(String[] args) {
		Set<Number> set = new HashSet<Number>();
		set.add(null);
		set.add(1);
		set.add(2.3);
		set.add(56.7f);
		set.add(3243546377l);
		set.add(null);
		set.add(1);
		set.add(null);
		set.add(45);
		System.out.println(set);
	}

}
