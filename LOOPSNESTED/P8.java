/*Sum of first 10 prime numbers */
package LOOPSNESTED;

public class P8 {
    public static void main(String[] args) {
        int range = 10,count = 0;
        for(int i = 1;count<range;i++) {
            int num = i,count1=0;
            for(int j = 2;j<=num/2;j++) {
                if(num%j==0) {
                    count1++;
                    break;
                }
            }
            if(count1==0 && num>1) {
                count++;
                System.out.println(num+ " :is prime");
            }
        }
    }
}
