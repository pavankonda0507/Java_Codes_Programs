package LOOPS;
import java.util.Scanner;
class Problem_Digits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(),rev = 0,digit = 0,temp = num;
        for(;num!=0;num/=10) {
            digit = num%10;
            rev = rev*10+digit;
        }
        System.out.println(rev);
        for(;rev!=0;rev/=10) {
            int rem = rev%10;
            System.out.println(rem);

        }
    }
    
}
