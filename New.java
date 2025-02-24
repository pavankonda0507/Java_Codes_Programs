public class New {
    public static void main(String[] args) {
        int num  = 7356234,max = 0,smax = 0,temp = num;
		while(num!=0) {
			int digit = num%10;
			if(digit>max) {
				max = digit;
			}
			num/=10;
		}
        while(temp!=0) {
            int digit = temp%10;
            if(digit>smax&&digit<max) 
                smax = digit;
            temp/=10;
        }
        System.out.println(smax);

    }
    
}
