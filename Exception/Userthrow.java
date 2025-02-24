class Userthrow {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		}
		catch(Exception a) {
			System.out.println("Exception occurred");
			System.out.println(a);
		}
	}
}