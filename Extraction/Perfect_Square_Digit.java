package Extraction;

class Perfect_Square_Digit {
    public static void main(String[] args) {
        int num = 248,digit = 0;
        while (num!=0) {
            digit = num%10;
            double sqrt = Math.sqrt(digit);
            if(sqrt == (int) sqrt) {
                System.out.println(digit);
            }
            num = num/10;


            
        }
    }
    
}
