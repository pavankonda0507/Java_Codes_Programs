package Extraction;

class Max_Min_Digit {
    public static void main(String[] args) {
        int num = 641298,digit,max = 0,min = 9,temp = num;
        while (num!=0) {
            digit = num%10;
            if(digit>max) {
                max = digit;
            }
            num = num/10;
        }
        System.out.println(max);

        while (temp!=0) {
            int rem = temp%10;
            if(rem<=min) {
                min = rem;
            }
            temp = temp/10;
            
        }
        System.out.println(min);
    }
    
}
