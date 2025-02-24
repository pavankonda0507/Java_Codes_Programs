import java.util.List;
import java.util.ArrayList;
class List1 {
	public static void main(String[] args) {
		List<Object> al = new ArrayList();	
		al.add(12);
		al.add(6.2);
		al.add("Pavan");
		al.add('K');
		System.out.println(al);
		System.out.println(al.get(1));
	}
}