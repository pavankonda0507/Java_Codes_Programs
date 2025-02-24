package Recursion;

class DigitSum {
    int sum = 0;
    int sumOfDigits(int num) {
        if(num==0) {
            return sum;
        }
        else {
            int dig = num%10;
            sum+=dig;
            return sumOfDigits(num/=10);
        }
    }
    public static void main(String[] args) {
        DigitSum d = new DigitSum();
        System.out.println("Sum of digits: "+d.sumOfDigits(645));
    }
    
}
