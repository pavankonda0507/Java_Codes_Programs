package Extraction;

import java.util.Scanner;

class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt(),digit=0,sum=0;
        while(num!=0) {
            digit = num%10;
            sum = sum+digit;
            num = num/10;


        }
        System.out.println(sum);
    }
    
}
