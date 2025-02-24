package Bridge;

public class Hospital {
	String name;
	Patient patient;
	Doctor doctor;
	public Hospital(String name, Patient patient, Doctor doctor) {
		super();
		this.name = name;
		this.patient = patient;
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", patient=" + patient + ", doctor=" + doctor + "]";
	}
	

}
