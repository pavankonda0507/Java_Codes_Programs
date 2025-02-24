package LOOPS;
class Task {
    public static void main(String[] args) {
        int num = 999934,digits = 0, sum = 0,rev = 0,temp = num;
        System.out.println("Given number: "+num);
        while(num!=0) {
            digits = num%10;
            sum = sum+digits;
            num/=10;
        }
        System.out.println("Sum of digits: "+sum);

        while(temp!=0) {
            int digits1 = temp%10;
            rev = rev*10+digits1;
            temp/=10;
        }
        while (rev!=0) {
            int digits2 = rev%10;
            int res = sum/digits2;
            System.out.print(res);
            rev/=10;
            
        }
    }
}