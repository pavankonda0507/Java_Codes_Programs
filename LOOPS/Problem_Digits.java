/*
 * if num is 12345 then print the output as 
 * 1
 * 2
 * 3
 * 4
 * 5
 */
package LOOPS;
import java.util.Scanner;

class Problem_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(),count = -1,digit = 0,temp = num,res = 0;
        for(;num!=0;num/=10) {
            count++;
        }
        System.out.println("Power value: "+count);
        num = temp;
        for(;temp!=0;) {
            int que = temp/(int) Math.pow(10,count);
            System.out.println(que);
            temp = temp%(int) Math.pow(10,count);
            count--;

        }
    }

    
}
