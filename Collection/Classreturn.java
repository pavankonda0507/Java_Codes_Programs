package Collection;
class Student {
	String name;
	int rollno;
	public Student(String name,int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
		
	}
	@Override
	public String toString() {
		return "name: "+name+" "+"Rollno: "+rollno;
	}
 	
}
public class Classreturn {
	public static void main(String[] args) {
		Classreturn cr = new Classreturn();
		System.out.println(cr.m1());
		
		
	}
	public Student m1() {
		return new Student("Pavan",24);
	}
	

}
