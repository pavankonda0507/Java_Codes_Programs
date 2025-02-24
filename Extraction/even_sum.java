package Extraction;

class even_sum {
    public static void main(String args[]) {
        int num = 1234,sum = 0,rem = 0;
        while (num!=0) {
            rem = num%10;
            if(rem%2==0)
                sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
    
}
