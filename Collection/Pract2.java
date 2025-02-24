package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Students {
	int roll;
	String name;
	public Students(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + "]";
	}
	
}
public class Pract2 {
	public static void main(String[] args) {
		Students s1 = new Students(28,"Pavan");
		Students s2 = new Students(25,"Raj");
		Students s3 = new Students(36,"Ram");
		Students s4 = new Students(27,"Sai");
		ArrayList<Students> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al, new Sortroll());
		System.out.print(al);
	}
}
class Sortroll implements Comparator<Students> {
	@Override
	public int compare(Students o1,Students o2) {
		return Integer.compare(o1.roll, o2.roll);
		
	}
	
}
