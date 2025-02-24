/* Write a program to print prime numbers from 1 to 20 */
package LOOPSNESTED;

class P3 {
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++){
            int num = i,count = 0;
            for(int j = 2 ;j<=num/2;j++) {
                if(num%j==0) {
                    count++;
                    break;
                    
                }
            }
            System.out.println(count==0 && num>1?num+" :Prime":num+" :Not prime");
        }
        
    }
    
}
