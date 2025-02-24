/* Write a program to print sum of digits from 1 to 100- */
package LOOPSNESTED;

class P5 {
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++) {
            int num = i,sum = 0,digit = 0,temp = num;;
            for(;num!=0;num/=10) {
                digit = num%10;
                sum += digit;
            }
            System.out.println("sum of digits of number "+temp+" is "+sum);
        }
    }
    
}
