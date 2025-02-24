/* Print sum of prime digits of a number */
package LOOPSNESTED;

class P7 {
    public static void main(String[] args) {
        int num = 25793,digit = 0,sum = 0;
        while(num!=0) {
            int count = 0;
            digit = num%10;
            for(int i = 2;i<=digit/2;i++) {
                if(digit%i==0) {
                    count++;
                    break;
                }
            }
            if(count==0 && digit>1){
                System.out.println("The digit "+digit+" is Prime");
                sum = sum+digit;
            }
            num/=10;
        }
        System.out.println("Sum of the prime digits is: "+sum);        
    }
    
}