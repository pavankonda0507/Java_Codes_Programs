/* Write a program for finding the digit factorials in a number  */
package LOOPSNESTED;
class P6 {
    public static void main(String[] args) {
        int num = 145,digit = 0,fact = 1,sum = 0,temp = num;
        while (num!=0) {
            digit = num%10;
            for(int j=1;j<=digit;j++) {
                fact = fact*j;
            }
            System.out.println("The factorial of digit "+digit+" is "+fact);
            num/=10;
            sum = sum+fact;
            fact = 1;
            
        }
        System.out.println("Sum of factorial digits is: "+sum);
        if(sum==temp) {
            System.out.println("Strong number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
    
}
