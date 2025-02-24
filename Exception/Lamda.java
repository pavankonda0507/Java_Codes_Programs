interface Sample {
	public void method();
}
class Lamda {
	public static void main(String[] arga) {
		Sample s=()->
		{
			System.out.println("I am lamda function");
		};
		s.method();
		
	}
}