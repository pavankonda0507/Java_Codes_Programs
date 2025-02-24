package LOOPS;

class Factor_Sum {
    public static void main(String args[]) {
        int num = 12, i=1, sum = 0;
        while(i<=12) {
            if(num%i==0) {
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);

    }
    
}
