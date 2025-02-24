package LOOPS;

class secondlargest {
    public static void main(String[] args) {
        int num = 12342,digit =0,rev =0, max = 0,sec = 0,temp=num;
        while (num!=0) {
            digit = num%10;
            if(digit>max) {
                max = digit;
            }
            num/=10;   
        }
        while (temp!=0) {
            int digit2=temp%10;
            if(digit2==max) {   
            }
            else{
                if (digit2>=sec) {
                    sec = digit2;
                }
            }
            temp/=10;
            
        }
        System.out.println("Sec Max is: "+sec);
    }
    
}
