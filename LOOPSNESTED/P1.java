/* Write a program to print the numbers from 1 to 10 tables */
package LOOPSNESTED;
import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        for(int i = 1;i<=range;i++) {
            for(int j = 1; j<=20; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }

    }
    
}
