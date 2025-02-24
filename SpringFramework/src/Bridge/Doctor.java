package Bridge;

public class Doctor {
	int did;
	String dname;
	String dspeciality;
	public Doctor(int did, String dname, String dspeciality) {
		super();
		this.did = did;
		this.dname = dname;
		this.dspeciality = dspeciality;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", dspeciality=" + dspeciality + "]";
	}
	

}
