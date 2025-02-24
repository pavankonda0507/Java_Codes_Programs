package Extraction;
import java.util.Scanner;

class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(),osum = 0,esum=0,temp = num,count=0,rem = 0;
        while(num!=0) {
            count++;
            num = num/10;
        }
        System.out.println("Count value: "+count);
        num = temp;
        if(count%2!=0) {
            while(num!=0){
                rem = num%10;
                osum = osum+rem;
                num = num/10;
            }
            System.out.println("Sum od digits for odd number of digits: "+osum);

        }
        else {
            int half = count/2;
            int last = (int) (num%Math.pow(10,half));
            int first = (int) (num/Math.pow(10,half));
            esum = first+last;
            System.out.println("Sum od digits for even number of digits: "+esum);
        }

    }
    
}
