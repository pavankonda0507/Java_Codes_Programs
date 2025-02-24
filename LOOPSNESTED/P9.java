/*Write a program to print first 10 palindrome numbers */
package LOOPSNESTED;

public class P9 {
    public static void main(String[] args) {
        int count=0,range = 10;
        for(int i=1;count<range;i++) {
            int num = i,rev = 0,dig = 0,temp = num;
            for(;num!=0;num/=10) {
                dig = num%10;
                rev = rev*10+dig;
            }
            if(rev==temp) {
                count++;
                System.out.println(i+" : is palindrome");
            }
        }
    }
    
}
