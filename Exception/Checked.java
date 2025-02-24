import java.io.FileReader;
import java.io.FileNotFoundException;
class Checked {
		public static void main(String[] args) throws FileNotFoundException {
			Checked c = new Checked();
			c.m1();
		
		}
		public void m1() throws FileNotFoundException {
			m2();
		}
		public void m2() throws FileNotFoundException {
			m3();
		}
		public void m3() throws FileNotFoundException {
			FileReader f = new FileReader("D:\\Data\\pava.txt");
			System.out.println("File opened");
		}
		
}