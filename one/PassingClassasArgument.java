package one;

public class PassingClassasArgument {
	public static void main(String[] args) {
		Student student = new Student();
		PassingClassasArgument obj = new PassingClassasArgument();
		System.out.println(obj.m1(student));
		
		
	}
	public Student m1(Student student) {
		student.setRoll(10);
		student.setName("Pavan");
		student.setEmail("pavan@gmail.com");
		return student;
	}
}
