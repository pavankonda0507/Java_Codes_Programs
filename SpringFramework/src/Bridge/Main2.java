package Bridge;

public class Main2 {
	public static void main(String[] args) {
		Patient patient = new Patient(10,"Raj","Ear pain");
		Doctor doctor = new Doctor(101,"Dev","ENT");
		Hospital hospital = new Hospital("Appollo",patient,doctor);
		System.out.println(hospital);
	}

}
