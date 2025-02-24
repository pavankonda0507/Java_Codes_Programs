class Exnull {
	public static void main(String[] args) {
		try {
			throw new SQLException();
		}
		catch(SQLException c) {
			System.out.println("Exception occured");
		

		}


	}
}