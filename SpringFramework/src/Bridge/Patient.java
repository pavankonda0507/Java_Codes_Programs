package Bridge;

public class Patient {
	int pid;
	String pname;
	String pproblem;
	public Patient(int pid, String pname, String pproblem) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pproblem = pproblem;
	}
	
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", pproblem=" + pproblem + "]";
	}
	

}
