class Armstrong {
	public static void main(String[] args) {
		int num = 153,dig = 0,sum = 0,pow = 0,count = 0,temp=num;
		while(num!=0) {
			count++;
			num/=10;
		}
		num = temp;
		while(temp!=0) {
			dig = temp%10;
			pow = (int) Math.pow(dig,count);
			sum += pow;
			temp /= 10;

		}
		if (sum==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
	}
}