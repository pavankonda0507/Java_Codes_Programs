package Extraction;

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt(),temp = num,count = 0, sum = 0,pow = 0,digit=0;
        while(num!=0) {
            count++;
            num = num/10;
        }
        num = temp;
        System.out.println("count value:"+count);
        while(num!=0) {
            digit = num%10;
            pow = (int) Math.pow(digit, count);
            sum = sum+pow;
            num=num/10;
        }
        System.out.println("temp value :"+temp);
        System.out.println("sum value  :"+sum);
        if(sum==temp) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not a Armstrong");
        }

    }

    
}
