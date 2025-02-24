class Multiplecatch {
	public static void main(String[] args) {
		int a = 10,b = 20,c=30;
		try {
		if(a>b&&a>c) 
			throw new ArithmeticException();
		else if(b>a&&b>c)
			throw new NullPointerException();
		else 
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception ae) {
			System.out.println("Exception caught "+ae);
		}
		
		
	}
}