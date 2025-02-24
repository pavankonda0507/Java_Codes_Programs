package LOOPS;

class Factor_Perfect {
    public static void main(String[] args) {
        int num = 34,i = 1,sum = 1;
        while(i<=num/2) {
            if(num%i==0) {
                sum+=i;
            }
            i++;

        }
        System.out.println("Sum is: "+sum);
        if(sum==num) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
}
