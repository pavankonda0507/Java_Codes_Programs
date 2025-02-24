package LOOPS;

class Reverse_Zero {
    public static void main(String[] args) {
        int num = 1200,rev = 0,digit = 0,temp = num , rev2 = 0, digit2 = 0;
        System.out.println("The given number: "+num);
        while(num!=0) {
            digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        System.out.println("Reverseed number: "+rev);
        while(rev!=0) {
            digit = rev%10;
            rev2 = rev2*10+digit;
            rev/=10;
        }
        System.out.println("Again reversed number: "+rev2);
        while(rev2!=temp) {
            rev2*=10;
        }
        System.out.println("The original number: "+rev2);

    }
    
}
