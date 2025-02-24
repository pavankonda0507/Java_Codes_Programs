package LOOPS;
class question {
    public static void main(String[] args) {
        for(int i =1;i<=1000;i++) {
            int num = i,count = 0,digit = 0,rev = 0, sum = 0,temp = num;
            for(;num!=0;num/=10) {
                digit = num%10;
                count++;
            }
            num = temp;
            while (num!=0) {
                int digit2 = num%10;
                int pow = (int) Math.pow(digit2, count);
                System.out.println("pow is: "+pow);
                sum = sum+pow;
                num/=10;
                count--;   
            }
            System.out.println("Num is: "+temp+ " and Sum is: "+sum);
        }
    }   
}