class Automatic{
	public static void main(String[] args){
		int num = 76,pow = (int) Math.pow(num,2);
		int dig = pow%100;
		if(dig==num)
			System.out.println("Automatic number");
		else
			System.out.println("Not Automatic number");	
	}
}