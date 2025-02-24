import java.util.Scanner;
class X {
    public static void main(String[] args) {
        int num  = 7356234,max = 0,smax = 0;
		while(num!=0) {
			int digit = num%10;
			if(digit>max) {
				max = digit;
			}
			if(digit>smax&&digit<max) {
				smax = digit;
            }
			num/=10;
		}
		System.out.println(smax);

        
            
    }


}