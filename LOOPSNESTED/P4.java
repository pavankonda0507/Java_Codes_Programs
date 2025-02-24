/* Write a program to check a number palindrome from 1 to 100*/
package LOOPSNESTED;

public class P4 {
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++) {
            int num = i,digit = 0,rev = 0,temp = num;
            for(;num!=0;num/=10) {
                digit = num%10;
                rev = rev*10+digit;
            }
            if(rev == temp) {
                System.out.println(temp+" : Palindrome");
            }
        }
    }
}
