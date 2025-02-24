class ArithEx {
	public static void main(String[] args) {

		System.out.println("Before exception");
		try {
			
			int a = 323/10;
			System.out.println("No Exception");
			System.out.println(a);
			
		}
		catch(Exception e) {
			System.out.println("Number cannot divide by zero");
			
		}
		finally {
			System.out.println("After Exception");
		}
		
	}
}
