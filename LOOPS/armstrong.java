package LOOPS;

import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(),digit = 0,rev = 0,count = 0,temp  = num,sum = 0,pow = 0;
        for(;num!=0;) {
            count++;
            num/=10;

        }
        num = temp;
        for(;temp!=0;temp/=10) {
            digit = temp%10;
            pow=(int) Math.pow(digit,count);
            sum+=pow;
        }
        System.out.println(sum);
        System.out.println(sum==num?"Armstrong":"Not Armstrong");
    }
}
