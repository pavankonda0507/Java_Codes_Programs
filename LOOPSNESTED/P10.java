/*Write a program to print first 10 armstrong numbers */
package LOOPSNESTED;

public class P10 {
    public static void main(String[] args) {
        int count = 0,range = 10;
        for(int i = 1;count<10;i++) {
            int num = i,pow = 0,sum = 0,dig = 0,count1=0,temp = num;
            while (num!=0) {
                count1++;
                num/=10;                   
            }
            num=temp;
            while (temp!=0) {
                dig = temp%10;
                pow = (int) Math.pow(dig, count1);
                sum = sum+pow;
                temp/=10;
                
            }
            if(sum==num) {
                count++;
                System.out.println(i+" :is Armstrong");
            }

            
        }
    }
    
}
