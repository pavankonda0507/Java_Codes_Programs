package Extraction;
import java.util.Scanner;
class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt(),rem = 0;
        while (num!=0) {
            rem = num%10;
            System.out.println(rem);
            num = num/10;

            
        }
    }
    
}
